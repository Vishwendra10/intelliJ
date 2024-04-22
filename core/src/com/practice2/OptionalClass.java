package com.practice2;

import java.sql.SQLOutput;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        //Usecase: method return Optional, easy to checknull value

        String str= null;

        //create the object of Optional
        Optional<String> optional= Optional.ofNullable(str);

        //Print the value if present otherwise print null value
        System.out.println(optional.orElse("null value"));
        //print the value, if null then NoSuchElementException
//        System.out.println(optional.get());
        //if not null then true else false
        System.out.println(optional.isPresent());
    }
}
