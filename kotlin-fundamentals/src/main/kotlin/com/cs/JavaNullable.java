package com.cs;

import java.util.Optional;

public class JavaNullable {

    public static Optional<String> getSomething(){
        //....
        return null;
    }

    public static void main(String[] args) {
        Optional<String> value = getSomething();
        System.out.println(value.get());
    }
}
