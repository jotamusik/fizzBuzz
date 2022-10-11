package dev.kata.stringcalculator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StringCalculatorShould {
    @Test
    fun `throw not implemented`() {
        assertThatExceptionOfType(NotImplementedError::class.java)
            .isThrownBy {
                StringCalculator.add()
            }.withMessage("An operation is not implemented: Time to do some TDD...")
    }
}
