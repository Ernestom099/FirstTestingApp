package com.example.firsttestingapp

import org.junit.*
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParametrizedTest(var currentValue: Boolean, var currentUser: User) {
    @get:Rule
    val locationESRule = LocationESRule()

    @Test
    fun checkIsAdultTest() {
        //Assert.assertEquals(currentValue, assertions?.isAdult(currentUser))
        Assert.assertEquals(currentValue, locationESRule.assertions?.isAdult(currentUser))
    }

    companion object {
/*        var assertions: Assertions? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon() {
            assertions = Assertions()
        }


        @AfterClass
        @JvmStatic
        fun tearDownCommon() {
            assertions = null
        }
*/
        @Parameterized.Parameters
        @JvmStatic
        fun getUserUS() = arrayOf(
            arrayOf(false, User("Pedro", 12)),
            arrayOf(true, User("Clara", 34)),
            arrayOf(false, User("Bot21", 4,false)),
            arrayOf(true, User("Alex", 18))
        /*     arrayOf(false, User("Pedro", 12)),
            arrayOf(true, User("Clara", 34)),
            arrayOf(false, User("Bot21", 4,false)),
            arrayOf(false, User("Alex", 18))*/
        )
    }
}