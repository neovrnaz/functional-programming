package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<String> details = Arrays.asList(
            "Name",
            "Description",
            "Tools",
            "Years Experience",
            "References",
            "Objective"
        );


        for (String detail : details) {
            System.out.println(detail);
        }

//                      This is an anonymous function
//        details.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

// This is shorthand for the function above
        details.forEach((detail) -> System.out.println(details));

    }
}
