package com.dicoding.githubapplication.data.retrofit

import com.dicoding.githubapplication.data.response.DetailUserResponse
import com.dicoding.githubapplication.data.response.GithubResponse
import com.dicoding.githubapplication.data.response.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("users")
    fun getUser(
        @Header("Authorization")
        authorization : String = com.dicoding.githubapplication.BuildConfig.KEY,
    ) : Call<ArrayList<User>>

    @GET("search/users")
    fun getSearchUser(
        @Query("q") query: String,
        @Header("Authorization")
        authorization : String = com.dicoding.githubapplication.BuildConfig.KEY,
    ): Call<GithubResponse>

    @GET("users/{username}")
    fun getUserDetail(
        @Path("username") username : String,
        @Header("Authorization")
        authorization : String = com.dicoding.githubapplication.BuildConfig.KEY,
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    fun getFollowers(
        @Path("username") username : String,
        @Header("Authorization")
        authorization : String = com.dicoding.githubapplication.BuildConfig.KEY,
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    fun getFollowing(
        @Path("username") username : String,
        @Header("Authorization")
        authorization : String = com.dicoding.githubapplication.BuildConfig.KEY,
    ): Call<ArrayList<User>>
}