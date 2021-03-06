/*
 * 文 件 名:  ImageLoaderUtill.java
 * 版    权:  VA Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  lijing
 * 修改时间:  2015-5-11
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.kerkr.edu.Image;

import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  lijing
 * @version  [版本号, 2015-5-11]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class ImageLoaderUtill {
    public static DisplayImageOptions getDisplayImageOptions(int defaultDrawable, boolean iscacheOnDisk, int corner) {
        DisplayImageOptions options = new DisplayImageOptions.Builder().showImageOnLoading(defaultDrawable)
                .showImageForEmptyUri(defaultDrawable)
                .showImageOnFail(defaultDrawable)
                .cacheInMemory(true)
                .cacheOnDisk(iscacheOnDisk)
                .considerExifParams(false)
                .bitmapConfig(Bitmap.Config.RGB_565)
                // 16bit 降低内存开销
                .displayer(new RoundedBitmapDisplayer(corner))
                .build();
        return options;
    }
}
