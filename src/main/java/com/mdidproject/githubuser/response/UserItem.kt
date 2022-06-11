package com.mdidproject.githubuser.response

import com.google.gson.annotations.SerializedName

data class UserItem(

	@field:SerializedName("avatar_url")
	val avatarUrl: String,

	@field:SerializedName("login")
	val username: String
)