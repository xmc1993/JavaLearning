package com.xmc.reflect;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * Created by xmc1993 on 2017/8/4.
 */
public class Main {
    public static void main(String[] args) throws Throwable {
        MethodHandle methodHandle = null;
        MethodType methodType = MethodType.methodType(String.class);
        MethodHandles.Lookup lookup = MethodHandles.lookup();

        try {
            methodHandle = lookup.findVirtual(Main.class, "toString", methodType);

        }catch (Exception e) {

        }

        System.out.println(methodHandle.invokeExact(new Main()));

    }
}
