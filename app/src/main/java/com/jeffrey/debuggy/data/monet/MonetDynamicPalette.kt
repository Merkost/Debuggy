package com.jeffrey.debuggy.data.monet

import android.annotation.SuppressLint
import android.content.Context
import com.jeffrey.debuggy.data.preference.PreferencesHelper
import com.jeffrey.debuggy.util.Utils
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

@SuppressLint("InlinedApi")
class MonetDynamicPalette(val context: Context) : KoinComponent {

    private val preference: PreferencesHelper by inject()

    private val darkMode = Utils.isDarkMode(context, preference.appTheme)
    private val monetCompatColors: MonetCompatColors = MonetCompatColors(context)

    val collapsingToolbarColor =
        if (darkMode) monetCompatColors.systemNeutral2Shade700 else monetCompatColors.systemNeutral2Shade100

    var snackbarBackgroundColor =
        if (darkMode) monetCompatColors.systemNeutral2Shade700 else monetCompatColors.systemNeutral2Shade100

    val snackbarTextColor =
        if (darkMode) monetCompatColors.systemNeutral2Shade50 else monetCompatColors.systemNeutral2Shade900
}
