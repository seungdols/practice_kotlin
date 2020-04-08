package com.seungdols.`interface`.practice

/**
 * @PACKAGE com.seungdols.`interface`.practice
 * @Author seungdols
 * @Date 2020-04-08
 */

interface Signatory {
    fun sign()
}

open class Person(val name: String, var age: Int) : Signatory {
    var isMarried: Boolean = false
    constructor(name: String, age: Int, isMarried: Boolean): this(name, age) {
        this.isMarried = isMarried
    }

    override fun sign()  = println("$name aged $age can sign documents. (and their marital status is $isMarried)")
}

class Student(name: String, age: Int) : Person(name, age)

fun main(args: Array<String>) {
    val p = Person("seungdols", 30, true)
    p.sign()
    p.age = 28
    p.sign()
}
