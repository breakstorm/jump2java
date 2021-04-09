package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");

        //03-7 리스트(List)

        ArrayList pitches = new ArrayList();
        pitches.add("123");
        pitches.add("456");
        pitches.add("789");
        pitches.add("123");

        System.out.println(pitches.get(0));
        System.out.println(pitches.size());
        System.out.println(pitches.contains("999"));
        System.out.println(pitches);
        System.out.println(pitches.remove(0));
        System.out.println(pitches);

        //03-8 제네릭스(Generics)
        ArrayList<String> aList = new ArrayList<String>(); // String형 강제
        System.out.println(aList);
    }
}
