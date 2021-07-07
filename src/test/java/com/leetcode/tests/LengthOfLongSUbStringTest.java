package com.leetcode.tests;

import com.leetcode.LengthOfLongSUbString;
import org.junit.Test;

public class LengthOfLongSUbStringTest {


    @Test
    public void test1(){
        LengthOfLongSUbString lengthOfLongSUbString = new LengthOfLongSUbString();
        String test = "abccedf";
        System.err.println(lengthOfLongSUbString.lengthOfLongSubString(test));
    }
}
