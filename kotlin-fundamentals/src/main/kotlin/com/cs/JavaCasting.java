package com.cs;

public class JavaCasting {

    public static void process(Object obj){
        if(obj instanceof String){
            System.out.println("String type of length:"+((String) obj).length());
        }
    }
}
