package com.example.firsttestingapp

import org.junit.Assert.*
import org.junit.Test

class AssertionsTest{
   @Test
   fun getArrayTest(){
       val assertions = Assertions()
       val array = arrayOf(2,7)//Expected value
       //val array = arrayOf(7,7)//Expected value with error
       assertArrayEquals("Custom message: Testing error",array,assertions.getLuckyNumbers())
   }
    @Test
    fun getNameTest(){
        val assertions = Assertions()
        val expectedName = "Ernesto"
    }
}