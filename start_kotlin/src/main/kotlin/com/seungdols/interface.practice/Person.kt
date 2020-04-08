package com.seungdols.`interface`.practice

/**
 * @PACKAGE com.seungdols.`interface`.practice
 * @Author seungdols
 * @Date 2020-04-08
 */

interface Signatory {
    fun sign()
}

class Person : Signatory {
    override fun sign()  = println("I can sign document.")
}

fun main(args: Array<String>) {
    val p = Person()
    p.sign()
}
