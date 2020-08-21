package com.example.uibestpractice

import android.content.Context
import android.util.DisplayMetrics




object DisplayUtil {
    fun getScreenWidth(context: Context): Int {
        val dm: DisplayMetrics = context.getResources().getDisplayMetrics()
        return dm.widthPixels
        //111
    }
}