package com.cqteam.imageloader

import android.content.Context
import android.widget.ImageView
import com.cqteam.imageloader.glide.GlideLoader
import com.cqteam.imageloader.utils.ImageUrlUtils

/**
 * Author： 洪亮
 * Time： 2019-10-24 - 11:32
 * Email：281332545@qq.com
 * <p>
 * 描述： 提供给客户端的门面类
 */
object ImageLoader {

    private val loader: ILoader = GlideLoader()

    fun show(context: Context, imageView: ImageView, url: String){
        loader.load(context,imageView,
            ImageUrlUtils.handle(url),GlobalConfiguration.placeholderResourceId,GlobalConfiguration.errorResourceId)
    }

    fun showWithDefault(context: Context, imageView: ImageView, url: String, defaultImgRes :Int){
        loader.load(context,imageView,
            ImageUrlUtils.handle(url),defaultImgRes,defaultImgRes)
    }

    fun showCircleWithDefault(context: Context, imageView: ImageView, url: String, defaultImgRes :Int){
        loader.loadCircleImageWithDefault(context,imageView,ImageUrlUtils.handle(url), defaultImgRes)
    }

    fun show(context: Context, imageView: ImageView, resourceId: Int) {
        loader.load(context,imageView,resourceId,GlobalConfiguration.placeholderResourceId,GlobalConfiguration.errorResourceId)
    }

    fun show(context: Context, imageView: ImageView, resourceId: Int, topLeftRadius: Int, topRightRadius: Int) {
        loader.loadRoundedCornersImage(context,imageView,resourceId,topLeftRadius,topRightRadius,GlobalConfiguration.placeholderResourceId,GlobalConfiguration.errorResourceId)
    }

    fun show(context: Context, imageView: ImageView, url: String, topLeftRadius: Int, topRightRadius: Int) {
        loader.loadRoundedCornersImage(context,imageView,ImageUrlUtils.handle(url),topLeftRadius,topRightRadius,GlobalConfiguration.placeholderResourceId,GlobalConfiguration.errorResourceId)
    }

    fun show(context: Context, imageView: ImageView, resourceId: Int, radius: Int) {
        loader.loadRoundedCornersImage(context,imageView,resourceId,radius,GlobalConfiguration.placeholderResourceId,GlobalConfiguration.errorResourceId)
    }

    fun show(context: Context, imageView: ImageView, url: String, radius: Int) {
        loader.loadRoundedCornersImage(context,imageView,ImageUrlUtils.handle(url),radius,GlobalConfiguration.placeholderResourceId,GlobalConfiguration.errorResourceId)
    }

    /**
     *  设置ImageUrl的域名
     */
    fun setImageUrlHost(host: String) {
        ImageUrlUtils.imageUrlHost = host
    }
}