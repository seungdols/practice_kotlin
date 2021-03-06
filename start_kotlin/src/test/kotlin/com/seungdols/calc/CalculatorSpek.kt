package com.seungdols.calc

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.jupiter.api.Assertions
import org.mockito.Mock
import org.mockito.Mockito
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe


/**
 * @PACKAGE com.seungdols.calc
 * @AUTHOR seungdols
 * @DATE 2020/04/20
 */
internal class CalculatorSpek : Spek({
    describe("The Calculator") {
        var calculator: Calculator? = null
        beforeEachTest { calculator = Calculator(NullResult()) }

        it ("should add two numbers") {
            val result = calculator?.add(12, 13)
            Assertions.assertEquals(25, result)
        }
        it ("should accumlate one number") {
            calculator?.accmulate(23)
            Assertions.assertEquals(23, calculator?.total)
        }
        it ("should accumlate two number") {
            calculator?.accmulate(2)
            calculator?.accmulate(3)
            Assertions.assertEquals(5, calculator?.total)
        }
    }

    describe("the output should be written correctly") {
        val result : Result = mock()
        val calculator = Calculator(result)
       it("should write the output amount") {
           calculator.accmulate(23)

           verify(result).wrtie(23)
       }
    }
})