package com.hspedu.debug_;

public class Debug01 {
    public static void main(String[] arg) {
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sum= " + i);
        }
        System.out.println("for繰り返しから抜ける");
    }
}
