package com.deongaree;

public class HelloMaven {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        HelloMaven hello = new HelloMaven();

        int res = hello.add(10, 23);

        System.out.println(res);
    }
}
