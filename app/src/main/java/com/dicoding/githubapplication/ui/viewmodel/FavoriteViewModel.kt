package com.dicoding.githubapplication.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.dicoding.githubapplication.database.FavoriteUser
import com.dicoding.githubapplication.database.FavoriteUserDao
import com.dicoding.githubapplication.database.UserDatabase

class FavoriteViewModel(application: Application): AndroidViewModel(application) {

    private val userDb: UserDatabase?
    private val userDao: FavoriteUserDao?

    init {
        userDb = UserDatabase.getDatabase(application)
        userDao = userDb?.favoriteUserDao()
    }

    fun getFavoriteUser(): LiveData<List<FavoriteUser>>? {
        return userDao?.getFavoriteUser()
    }
}