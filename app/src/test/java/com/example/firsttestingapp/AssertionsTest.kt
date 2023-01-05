package com.example.firsttestingapp

import org.junit.Assert.*
import org.junit.Test
import kotlin.math.exp

class AssertionsTest {
    @Test
    fun getArrayTest() {
        val assertions = Assertions()
        val array = arrayOf(2, 7)//Expected value
        //val array = arrayOf(7,7)//Expected value with error
        assertArrayEquals("Custom message: Testing error", array, assertions.getLuckyNumbers())
    }

    @Test
    fun getNameTest() {
        val assertions = Assertions()
        val expectedName = "Ernesto"
        val otherName = "Luis"
        assertEquals(expectedName, assertions.getName())
        assertNotEquals(otherName, assertions.getName())
    }

    @Test
    fun checkIsAdultTest() {
        val assertions = Assertions()
        val bot = User("Elon", 0, false)
        val juan = User("Juan", 23, true)
        assertTrue(assertions.isAdult(juan))
        assertFalse(assertions.isAdult(bot))
    }

    @Test
    fun checkNullUserTest() {
        val user = null
        assertNull(user)
        val assertions = Assertions()
        assertNull(assertions.checkHuman(user))
    }

    @Test
    fun checkNonNullUserTest() {
        val user = User()
        assertNotNull(user)
        val assertions = Assertions()
        assertNotNull(assertions.checkHuman(user))
    }

    @Test
    fun checkNotSameUsersTest() {
        val bot = User("Elon", 0, false)
        val juan = User("Juan", 23, true)
        assertNotSame(bot, juan)
    }

    @Test
    fun checkSameUsersTest() {
        val bot = User("Juan", 23, true)
        val juan = User("Juan", 23, true)
        val copyJuan = juan
        assertNotSame(bot,juan)
        assertSame(juan,copyJuan)
    }
}