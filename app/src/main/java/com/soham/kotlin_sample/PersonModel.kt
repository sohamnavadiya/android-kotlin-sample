package com.soham.kotlin_sample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by soham on 6/12/17.
 */
@Parcelize
data class PersonModel(val name: String, val age: Int):Parcelable