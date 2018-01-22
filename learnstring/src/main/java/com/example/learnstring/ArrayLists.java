package com.example.learnstring;

import java.util.ArrayList;

/**
 * Created by innovace on 22/1/18.
 */

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList name  = new ArrayList();
        name.add("aaa");
        name.add("bbb");
        name.add("ccc");
        name.add("ddd");
        name.add("eee");


        System.out.println("name value :" +name.get(0));
        name.remove(0);
        System.out.println("name value :" +name.get(0));
        name.remove(0);
        System.out.println("name value :" +name.get(0));


    }
}
