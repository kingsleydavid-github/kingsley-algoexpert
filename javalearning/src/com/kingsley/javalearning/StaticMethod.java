package com.kingsley.javalearning;

public class StaticMethod {

    static {
        method1();
    }

    public static void main(String[] args) {
        System.out.println("inside main");
        method1();
    }

    public static void method1() {
        System.out.println("inside method1");
    }
}
