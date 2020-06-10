package com.cqteam.imageloader.utils

import android.util.Log

/**
 * Author： 洪亮
 * Time： 2020/4/20 - 5:38 PM
 * Email：281332545@qq.com
 * <p>
 * 描述： 图片地址处理
 */
object ImageUrlUtils {

    var imageUrlHost = ""

    fun handle(url: String): String {
        if (url.length < 4) return ""
        Log.i("ImageUrl",url)
        Log.i("ImageUrl","${url.substring(0,4)}")
        // String.substring(startIndex,endIndex) 截取字符串，从startIndex开始，在endIndex之前结束
        return when {
            url.substring(0,7) == "http://" -> { url }
            url.substring(0,8) == "https://" -> { url }
            else -> { imageUrlHost +url }
        }
    }
}