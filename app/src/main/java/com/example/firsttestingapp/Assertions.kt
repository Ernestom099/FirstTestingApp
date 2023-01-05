package com.example.firsttestingapp

class Assertions {
    private val user = User("Ernesto", 26,)

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
            return true
        }
        return user.age >= 18
    }
}