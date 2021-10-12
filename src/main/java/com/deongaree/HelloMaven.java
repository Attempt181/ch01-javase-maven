package com.deongaree;

public class HelloMaven {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        HelloMaven hello = new HelloMaven();

        int res = hello.add(10, 23);
        int res2 = hello.minus(100, 20);

        System.out.println(res);
        System.out.println(res2);
        System.out.println("结果计算完毕！");
        System.out.println("hot-fix-test！");
    }

    public int minus(int n1,int n2){
        return n1 - n2;
    }
}
