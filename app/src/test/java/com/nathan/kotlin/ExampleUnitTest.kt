package com.nathan.kotlin

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        for (item in 1..10) {
            if (item == 5) {
                break
            }

            println("the order is $item")
        }
    }
}