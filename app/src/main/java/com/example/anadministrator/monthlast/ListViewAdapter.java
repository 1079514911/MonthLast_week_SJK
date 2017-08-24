package com.example.anadministrator.monthlast;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 张祺钒
 * on2017/8/24.
 */

public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private List<Bean.DataBean.TopicsBean> topics;

    public ListViewAdapter(Context context, List<Bean.DataBean.TopicsBean> topics) {
        this.context = context;
        this.topics = topics;
    }

    @Override
    public int getCount() {
        return topics.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null){
            holder=new ViewHolder();
            view=view.inflate(context,R.layout.item,null);
            holder.imageView=view.findViewById(R.id.imageview);
            holder.textView=view.findViewById(R.id.textview);
            view.setTag(holder);
        }else{
            holder= (ViewHolder) view.getTag();
        }
        holder.textView.setText(topics.get(i).description);
        ImageLoaderUtils.setImageView(topics.get(i).vertical_image_url,context,holder.imageView);
        return view;
    }
    static  class ViewHolder{
        TextView textView;
        ImageView imageView;
    }
}
