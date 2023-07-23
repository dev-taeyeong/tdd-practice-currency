package org.example;

class Bank {

    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
