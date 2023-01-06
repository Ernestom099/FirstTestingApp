package com.example.firsttestingapp

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class AssertionsUserAdultTest{
    private lateinit var bot: User
    private lateinit var juan: User

    @get:Rule val locationESRule = LocationESRule()

    @Before
    fun setup() {
        bot = User("Elon", 0, false)
        juan = User("Juan", 20, true)

        println("Before")
    }

    @After
    fun tearDown() {
        bot = User()
        juan = User()
        println("After")
    }

    @Test
    fun checkIsAdultTest() {
        /*val assertions = Assertions()
        assertions.setLocation("MX")
        assertTrue(assertions.isAdult(juan))
        assertFalse(assertions.isAdult(bot))
        println("checkIsAdultTest")*/

        assertEquals(true,locationESRule.assertions?.isAdult(juan))
        assertEquals(false,locationESRule.assertions?.isAdult(bot))
    }
}