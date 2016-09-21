package com.xmc.main;

import com.xmc.reflect.entity.Type;

import java.util.ArrayList;

/**
 * Created by xmc1993 on 16/8/4.
 */
public class TestSort {

    public static void main(String[] args) {
        ArrayList<Type> types = new ArrayList<Type>();
        Type type = new Type();
        type.setId(1);
        Type type1 = new Type();
        type1.setId(2);
        types.add(type1);
        types.add(type);
//        types.sort(new Comparator<Type>() {
//            public int compare(Type o1, Type o2) {
//                return o1.getId() - o2.getId();
//            }
//        });
        for (Type type2 : types) {
            System.out.println(type2.getId());
        }
    }
}
