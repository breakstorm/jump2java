package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");

        /* 03-7 리스트(List)
          자료형에 관련없이 자료를 저장 및 출력이 가능하다.
        */

//        ArrayList pitches = new ArrayList();
//        pitches.add(123);
//        pitches.add("456");
//        pitches.add("789");
//        pitches.add("123");
//
//        System.out.println(pitches.get(0).getClass());
//        System.out.println(pitches.get(1).getClass());
//        System.out.println(pitches.size());
//        System.out.println(pitches.contains("999"));
//        System.out.println(pitches);
//        System.out.println(pitches.remove(0));
//        System.out.println(pitches);

        //03-8 제네릭스(Generics)
        ArrayList<String> aList = new ArrayList<String>(); // String형 강제
        aList.add("123");
//        aList.add(456); // String타입이 아니여서 오류가 발생
        System.out.println(aList);

        // 03-9 맵(Map)
//        System.out.println("03-9 Map");
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("people", "사람");
//        map.put("baseball", "야구");
//        System.out.println(map.get("people"));
//        System.out.println(map.containsKey("people"));
//        System.out.println(map.remove("people"));
//        System.out.println(map);
//        System.out.println(map.size());

        /* 04-5 for each
        */
//        System.out.println("04-5 for each");
//        String[] numbers = {"One", "Two", "Three"};
//        for(String var: numbers) {
//            System.out.println(var);
//        }

        /* objective oriendted feature
        * 1.class, object, instance
        * 2.inherit
        * 3.interface
        * 4.polymorphism
        * 5.abstract
        * */

    }
}
