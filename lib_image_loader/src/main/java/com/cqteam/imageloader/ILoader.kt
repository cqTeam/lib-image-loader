package com.cqteam.imageloader

import android.content.Context
import android.widget.ImageView
import androidx.annotation.DrawableRes

/**
 * Author： 洪亮
 * Time： 2019-10-24 - 11:33
 * Email：281332545@qq.com
 * <p>
 * 描述：
 */
internal interface ILoader {
    /**
     *  普通图片
     */
    fun load(context: Context, view: ImageView, url: String)

    fun load(
        context: Context,
        view: ImageView,
        url: String, @DrawableRes placeholderResourceId: Int?, @DrawableRes errorResourceId: Int?
    )

    fun load(
        context: Context,
        view: ImageView,
        @DrawableRes showResourceId: Int?,
        @DrawableRes placeholderResourceId: Int?,
        @DrawableRes errorResourceId: Int?
    )

    /**
     *  四个圆角图片
     */
    fun loadRoundedCornersImage(
        context: Context,
        view: ImageView,
        @DrawableRes showResourceId: Int?,
        roundingRadius: Int,
        @DrawableRes placeholderResourceId: Int?,
        @DrawableRes errorResourceId: Int?
    )

    fun loadRoundedCornersImage(
        context: Context,
        view: ImageView,
        url: String,
        roundingRadius: Int,
        @DrawableRes placeholderResourceId: Int?,
        @DrawableRes errorResourceId: Int?
    )

    fun loadRoundedCornersImage(
        context: Context,
        view: ImageView,
        url: String,
        topLeftRadius: Int,
        topRightRadius: Int,
        @DrawableRes placeholderResourceId: Int?,
        @DrawableRes errorResourceId: Int?
    )

    fun loadRoundedCornersImage(
        context: Context,
        view: ImageView,
        @DrawableRes showResourceId: Int?,
        topLeftRadius: Int,
        topRightRadius: Int,
        @DrawableRes placeholderResourceId: Int?,
        @DrawableRes errorResourceId: Int?
    )

    /**
     *  圆形图片
     */
    fun loadCircleImageWithDefault(context: Context, imageView: ImageView, url: String, defaultImgRes :Int)
    fun loadCircleImageWithDefault(context: Context, imageView: ImageView, @DrawableRes showResourceId: Int?, defaultImgRes :Int)
}