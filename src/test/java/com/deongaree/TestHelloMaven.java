package com.deongaree;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {

    @Test
    public void testHelloMaven() {
        System.out.println("测试add方法");
        HelloMaven hello = new HelloMaven();

        int res = hello.add(10, 32);

        Assert.assertEquals(42, res);

    }


}
