package com.example.anadministrator.monthlast;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;

/**
 * Created by 张祺钒
 * on2017/8/24.
 */

public class ImageLoaderUtils {
    public static void setImageView(String url, Context context, ImageView imageView) {
    //    File cacheDir = StorageUtils.getOwnCacheDirectory(context, "imageloader/Cache");
        //缓存文件夹路径  在storage/emcalu/0数字的就是缓存
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
    //            .diskCache(new UnlimitedDiskCache(cacheDir))
                .build(); //开始构建
        //创建Imageloader 对象
        ImageLoader imageLoader = ImageLoader.getInstance();
        //设置初始化
        imageLoader.init(config);


        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.ic_launcher) //设置图片在下载期间显示的图片
                .showImageForEmptyUri(R.mipmap.ic_launcher)//设置图片Uri为空或是错误的时候显示的图片
                .showImageOnFail(R.mipmap.ic_launcher)  //设置图片加载/解码过程中错误时候显示的图片
                .cacheInMemory(true)//设置下载的图片是否缓存在内存中
                .cacheOnDisk(true)//设置下载的图片是否缓存在SD卡中
                .imageScaleType(ImageScaleType.IN_SAMPLE_INT)//设置图片以如何的编码方式显示
                .bitmapConfig(Bitmap.Config.RGB_565)//设置图片的解码类型
                .build();//构建完成

        imageLoader.displayImage(url, imageView, options);
        //.displayer(new RoundedBitmapDisplayer(90))  构建圆形图片

    }
}
