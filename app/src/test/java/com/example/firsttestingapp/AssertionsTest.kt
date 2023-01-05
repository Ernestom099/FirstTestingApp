package com.example.firsttestingapp

import org.junit.Assert.*
import org.junit.Test
import kotlin.math.exp
import kotlin.random.Random

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

    @Test(timeout = 1000)
    fun getCitiesTest(){
        val cities = arrayOf("México","Perú","Argentina")
        Thread.sleep(Random.nextLong(901,1100))
        assertEquals(3,cities.size)
    }

}