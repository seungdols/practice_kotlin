package com.seungdols.`interface`.practice

/**
 * @PACKAGE com.seungdols.`interface`.practice
 * @Author seungdols
 * @Date 2020-04-08
 */

interface Signatory {
    fun sign()
}

open class Person(val name: String, var age: Int, var isMarried: Boolean = false) : Signatory {

    var partnerName: String = ""
    override fun sign() = println("$name aged $age can sign documents. (and their marital status is $isMarried)")

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person("seungdols", 30, true)
            p.sign()
            p.age = 28
            p.sign()

            p.partnerName = "SD"
            println("Partner name is ${p.partnerName}")
            p.partnerName = "Bob"
            println("Partner name is ${p.partnerName}")
        }
    }
}

class Student(name: String, age: Int) : Person(name, age)


