package com.infrontofthenet.f20lesson2

import org.junit.Test

class VarsTest {
    @Test
    // the "fun" keyword is Kotlin for "function"
    fun readOnly() {
        // create an immutable variable
        val flavour = "Moose Tracks"

        // change the variable's value -> cannot do this when declared with val
        //flavour = "Pumpkin Pie"
    }

    @Test
    fun changeVar() {
        var flavour = "Moose Tracks"
        flavour = "Pumpkin Pie"
    }
}

// set up a function to see how Kotlin params work, including a default param value
// Java equiv: public static int multiply(int left, int right = 1)
fun multiply(left: Int, right: Int = 1): Int {
    return left * right
}

class FunTest {
    @Test
    fun paramsTest() {
        println(multiply(10, 4))
        println(multiply(right = 5, left = 10))
    }

    @Test
    fun defaultValTest() {
        println(multiply(50))
        println(multiply(left = 4))
    }
}

class NullableTest {
    @Test
    fun cannotBeNull() {
        var flavour: String = "Death by Chocolate"
        // even w/o :String declaration, Kotlin assumes it's a string and won't allow null values
        //flavour = null
    }

    @Test
    fun canBeNull() {
        var flavour: String? = "Death by Chocolate"
        flavour = null
    }

    @Test
    fun checkForNull() {
        var flavour: String? = "Vanilla"

        if (flavour != null) {
            println(flavour)
        }
        else {
            println("No flavour assigned")
        }
    }

    @Test
    fun letCheck() {
        var flavour: String? = "Banana Boat"

        flavour?.let{ println("Flavour is " + flavour) }
    }

    @Test
    fun elvisCheck() {
        var flavour: String? = null

        // elvis ?: if it's null, assign another value
        println(flavour ?: "something else")

        // now change null value to a string value
        flavour = "Oreo"
        println(flavour ?: "something else")
    }
}
