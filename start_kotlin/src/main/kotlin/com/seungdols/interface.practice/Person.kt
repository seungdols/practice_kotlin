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
    init {
        if (name == "seungdols" && age < 54) throw Exception("Invalid age")
    }
    override fun sign()  = println("$name aged $age can sign documents.")
}

class Student(name: String, age: Int) : Person(name, age)

fun main(args: Array<String>) {
    val p = Person("seungdols", 30)
    p.sign()
    p.age = 28
    p.sign()
}
