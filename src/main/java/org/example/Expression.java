package org.example;

public interface Expression {

    Money reduce(Bank bank, String to);
}
