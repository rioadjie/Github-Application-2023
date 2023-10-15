package com.dicoding.githubapplication.ui.main

import androidx.test.core.app.ActivityScenario
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Before
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import com.dicoding.githubapplication.R
import org.junit.Test

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {
    private val dummyUsername = "Rio"

    @Before
    fun setup(){
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun openGithubApps() {
        onView(withId(R.id.recyclerView)).perform(swipeDown())
        onView(withId(R.id.recyclerView)).perform(click())
        onView(withId(R.id.recyclerView)).perform(swipeDown())
    }
}