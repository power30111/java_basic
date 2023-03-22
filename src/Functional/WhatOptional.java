package Functional;

import java.util.List;
import java.util.Optional;

public class WhatOptional {
    public static void main(String[] args) {
        System.out.println(EvenMaxNumber().orElse(34));
    }

    private static Optional<Integer> EvenMaxNumber(){
        return List.of(23,45,67)
                .stream()
                .filter(n -> n%2 ==0)
                .max((n1,n2) -> Integer.compare(n1,n2));
    }
}
