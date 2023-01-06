package com.example.firsttestingapp

import android.location.Location

class Assertions {
    private var location = "US"
    private val user = User("Ernesto", 26)

    fun setLocation(location: String) {
        this.location = location
    }

    fun getLuckyNumbers(): Array<Int> {
        return arrayOf(2, 7)
    }

    fun getName(): String {
        return user.name
    }

    fun checkHuman(): Boolean {
        return user.isHuman
    }

    fun checkHuman(user: User?): Boolean? {
        return user?.isHuman
    }

    fun isAdult(user: User): Boolean {
        if (!user.isHuman) {
            return false
        }

        if (location == "US")
            return user.age >= 21

        return user.age >= 18
    }
}