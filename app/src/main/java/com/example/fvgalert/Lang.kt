package com.example.fvgalert

import android.content.Context
import android.view.View

/** زبان برنامه: فارسی یا انگلیسی (ذخیره‌شده در تنظیمات با کلید lang) */
object Lang {
    @Volatile var fa = true

    fun load(c: Context) {
        fa = c.getSharedPreferences("cfg", Context.MODE_PRIVATE).getString("lang", "fa") != "en"
    }

    fun dir(): Int = if (fa) View.LAYOUT_DIRECTION_RTL else View.LAYOUT_DIRECTION_LTR
}

/** متن مناسب زبان فعلی */
fun tr(fa: String, en: String): String = if (Lang.fa) fa else en
