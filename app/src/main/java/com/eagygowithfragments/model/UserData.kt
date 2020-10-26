package com.eagygowithfragments.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserData(
    var name: String = "",
    var email: String = "",
    var mobile: String = "",
    var country: String = ""
): Parcelable