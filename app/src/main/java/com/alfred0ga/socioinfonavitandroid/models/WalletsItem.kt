package com.alfred0ga.socioinfonavitandroid.models


import com.google.gson.annotations.SerializedName

data class WalletsItem(
    val avatar: String,
    @SerializedName("benevit_count")
    val benevitCount: Int,
    @SerializedName("desktop_cover_url")
    val desktopCoverUrl: Any,
    @SerializedName("display_index")
    val displayIndex: Int,
    @SerializedName("display_text")
    val displayText: String,
    val icon: String,
    val id: Int,
    @SerializedName("max_level")
    val maxLevel: Int,
    @SerializedName("member_level")
    val memberLevel: Int,
    @SerializedName("mobile_cover_url")
    val mobileCoverUrl: Any,
    val name: String,
    val path: String,
    @SerializedName("primary_color")
    val primaryColor: String
)