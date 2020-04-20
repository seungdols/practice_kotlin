package com.seungdols.calc

/**
 *
 * @PACKAGE com.seungdols.calc
 * @AUTHOR  seungdols
 * @DATE    2020/04/20
 */

class Calculator(val output: Result) {
    fun add (a: Int, b: Int): Int {
        return a + b
    }
}

interface Result {
    fun wrtie(answer: Int)
}

class NullResult : Result {
    override fun wrtie(answer: Int) {

    }
}