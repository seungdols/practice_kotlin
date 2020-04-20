package com.seungdols.calc

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe


/**
 * @PACKAGE com.seungdols.calc
 * @AUTHOR seungdols
 * @DATE 2020/04/20
 */
internal class CalculatorSpek : Spek({
    val calculator = Calculator(NullResult())
    describe("The Calculator") {
        it ("should add two numbers") {
            val result = calculator.add(12, 13)
            Assertions.assertEquals(25, result)
        }
    }
})