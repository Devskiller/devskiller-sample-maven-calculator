package com.devskiller.calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicTest {

    @Test
    public void shouldAddTwoNumbers() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(2, 3);

        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.subtract(5, 3);

        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(2, 3);

        //then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(6, 3);

        //then
        assertThat(result).isEqualTo(2);
    }
}
