package com.example.lib;

import java.util.Scanner;

public class o15 {
    public static void main(String[] args) {
        String str = "Taiwan, Touch, Your, Heart";
        String strChange = "";

        int strlength = str.length();
        for (int i = 0; i < strlength; i++) {
            if (str.charAt(i)!=(char)44) {
                strChange += str.charAt(i);
            }
        }
        System.out.println(strChange);
    }
}
