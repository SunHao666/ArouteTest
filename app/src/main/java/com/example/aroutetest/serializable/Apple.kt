package com.example.aroutetest.serializable

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Apple(val name:String):Parcelable {

}