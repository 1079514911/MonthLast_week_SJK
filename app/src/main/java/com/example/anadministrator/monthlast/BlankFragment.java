package com.example.anadministrator.monthlast;


import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.bawei.xlistviewlibrary.XListView;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.example.anadministrator.monthlast.R.id.lv;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements XListView.IXListViewListener {


    private String path = "http://api.kkmh.com/v1/topic_new/discovery_module_list/210?offset=0&limit=3&sa_event=eyJwcm9qZWN0Ijoia3VhaWthbl9hcHAiLCJ0aW1lIjoxNDg3OTE2MTcwNjE5LCJwcm9wZXJ0aWVzIjp7IiRvc192ZXJzaW9uIjoiNC4yLjIiLCJHZW5kZXJUeXBlIjoi5peg5rOV6I635Y-WIiwiVHJpZ2dlckl0ZW0iOjE3LCJWaXNpdFBhZ2VOYW1lIjoi5paw5L2c5LiK5p62IiwiJGxpYl92ZXJzaW9uIjoiMS42LjM0IiwiJG5ldHdvcmtfdHlwZSI6IldJRkkiLCIkd2lmaSI6dHJ1ZSwiJG1hbnVmYWN0dXJlciI6InNhbXN1bmciLCJUcmlnZ2VySXRlbU5hbWUiOiLmlrDkvZzkuIrmnrYiLCIkc2NyZWVuX2hlaWdodCI6NTc2LCJMaXN0VHlwZSI6IuaXp-eJiCIsIlByb3BlcnR5RXZlbnQiOiJSZWFkTGlzdCIsIlRyaWdnZXJPcmRlck51bWJlciI6MCwiRmluZFRhYk5hbWUiOiLmjqjojZAiLCJhYnRlc3RfZ3JvdXAiOjQ2LCIkc2NyZWVuX3dpZHRoIjoxMDI0LCIkb3MiOiJBbmRyb2lkIiwiVHJpZ2dlckl0ZW1UeXBlIjowLCJUcmlnZ2VyUGFnZSI6IkZpbmRQYWdlIiwiJGNhcnJpZXIiOiJDTUNDIiwiJG1vZGVsIjoiR1QtUDUyMTAiLCIkYXBwX3ZlcnNpb24iOiIzLjguMSJ9LCJ0eXBlIjoidHJhY2siLCJkaXN0aW5jdF9pZCI6IkE6OTA1MTA0Mjc2Mzc1NTEwOSIsIm9yaWdpbmFsX2lkIjoiQTo5MDUxMDQyNzYzNzU1MTA5IiwiZXZlbnQiOiJSZWFkTGlzdCJ9&style=2";
    private View view;
    private XListView mLv;
    private ListViewAdapter adapter;
    private List<Bean.DataBean.TopicsBean> topics;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_blank, container, false);
        initView(inflate);
        /**
         * 模块二：进入页面判断网络。
         (1) 有网直接加载数据，无网则弹出dialog，使用户选择
         是否设置网络。（5分）
         (2) 选择“确定”则取去设置网络。（5分）
         */
        HasNet();

//        (3) 用Xutils网络框架加载数据。（5分）
        x.http().get(new RequestParams(path), new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {

                Bean bean = new Gson().fromJson(result, Bean.class);
                topics = bean.data.topics;
                /**
                 * 模块三：将所得的数据存入数据库
                 (1) 自定义SqliteOpenHelper类，创建数据库和表。（5分）
                 (2) 自定义dao层，封装添加数据的方法。（5分）
                 (3) 实例化dao层，将数据添加到数据库。（5分）
                 */
                SQLiteDatabase db = new MyHelper(getContext()).getWritableDatabase();
                Dao dao = new Dao();
                //description text,imageUrl text
                for (int i = 0; i < topics.size(); i++) {
                    Bean.DataBean.TopicsBean topicsBean = topics.get(i);
                    dao.insert(db, "tb", "description", topicsBean.description, "imageUrl", topicsBean.vertical_image_url);
                }
                adapter = new ListViewAdapter(getContext(), topics);
                mLv.setAdapter(adapter);


            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
        mLv.setPullLoadEnable(true);
        mLv.setPullRefreshEnable(true);
        mLv.setXListViewListener(this);
        /**
         * 模块六：点击条目，跳转到另一个页面。
         (1) 将本条目的图片传到第二个页面。（5分）
         (2) 实现图片的拖拽和缩放。（10分）
         */
        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), ImageActivity.class);
                intent.putExtra("name",topics.get(i-1).vertical_image_url);
                startActivity(intent);
            }
        });
        return inflate;
    }

    private void HasNet() {
        ConnectivityManager systemService = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = systemService.getActiveNetworkInfo();
        if (info == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setTitle("提示");
            builder.setMessage("是否去设置网络");
            builder.create().show();
        } else {
            Toast.makeText(getContext(), "有网", Toast.LENGTH_SHORT).show();
        }
    }

    private void initView(View inflate) {
        mLv = (XListView) inflate.findViewById(lv);
    }
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            adapter.notifyDataSetChanged();
            closeXlistView();
        }
    };
    @Override
    public void onRefresh() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                topics.add(0,topics.get(1));
                handler.sendEmptyMessage(0);
            }
        },2000);
    }

    @Override
    public void onLoadMore() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                topics.add(topics.get(1));
                handler.sendEmptyMessage(0);
            }
        },2000);
    }
    private  void closeXlistView(){
        mLv.stopRefresh();
        mLv.stopLoadMore();
        mLv.setRefreshTime(getCurrentTime());
    }
    private  String getCurrentTime(){
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        return time;
    };
}
