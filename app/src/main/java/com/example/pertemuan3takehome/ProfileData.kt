package com.example.pertemuan3takehome

import androidx.annotation.ColorRes
import androidx.annotation.StringRes

data class ProfileData(
    @StringRes val name: Int,
    @StringRes val address: Int,
    @ColorRes val cardColor: Int,
    @StringRes val phone: Int? = null,
    val isCursive: Boolean = false
)