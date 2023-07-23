package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertThat(five.times(2)).isEqualTo(Money.dollar(10));
        assertThat(five.times(3)).isEqualTo(Money.dollar(15));
    }

    @Test
    public void testEquality() {
        assertThat(Money.dollar(5).equals(Money.dollar(5))).isTrue();
        assertThat(Money.dollar(5).equals(Money.dollar(6))).isFalse();
        assertThat(Money.franc(5).equals(Money.franc(5))).isTrue();
        assertThat(Money.franc(5).equals(Money.franc(6))).isFalse();
        assertThat(Money.franc(5).equals(Money.dollar(5))).isFalse();
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = Money.franc(5);
        assertThat(five.times(2)).isEqualTo(Money.franc(10));
        assertThat(five.times(3)).isEqualTo(Money.franc(15));
    }

    @Test
    public void testCurrency() {
        assertThat(Money.dollar(1).currency()).isEqualTo("USD");
        assertThat(Money.franc(1).currency()).isEqualTo("CHF");
    }

    @Test
    public void testDifferentClassEquality() {
        assertThat(new Franc(10, "CHF")).isEqualTo(new Money(10, "CHF"));
    }
}