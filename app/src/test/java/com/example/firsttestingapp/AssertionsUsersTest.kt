package com.example.firsttestingapp

import org.junit.*
import org.junit.Assert.*

class AssertionsUsersTest {
    private lateinit var bot: User

    @Before
    fun setup() {
        bot = User("Elon", 0, false)
        println("Before")
    }

    @After
    fun tearDown() {
        bot = User()
        println("After")
    }



    @Test
    fun checkNonNullUserTest() {
        assertNotNull(juan)
        println("checkNonNullUserTest")
    }

    @Test
    fun checkNotSameUsersTest() {
        assertNotSame(bot, juan)
        println("checkNotSameUsersTest")
    }

    @Test
    fun checkSameUsersTest() {
        val copyJuan = juan
        assertNotSame(bot, juan)
        assertSame(juan, copyJuan)
        println("checkSameUsersTest")
    }


    companion object {
        private lateinit var juan: User

        @BeforeClass @JvmStatic
        fun setupCommon() {
            juan = User("Juan", 23, true)
            println("BeforeClass")
        }

        @AfterClass @JvmStatic
        fun tearDownCommon() {
            juan = User()
            println("AfterClass")
        }
    }

}