package com.seungdols.calc

/**
 *
 * @PACKAGE com.seungdols.calc
 * @AUTHOR  seungdols
 * @DATE    2020/04/20
 */

class Calculator(val output: Result) {
    var total = 0
    fun add (a: Int, b: Int): Int {
        return a + b
    }

    fun accmulate(x: Int) {
        total += x
    }

}

interface Result {
    fun wrtie(answer: Int)
}

class NullResult : Result {
    override fun wrtie(answer: Int) {

    }
}