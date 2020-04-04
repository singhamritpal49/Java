package com.amritpalsingh;

public class Main {

    public static void main(String[] args) {
        //  When you trying to converts from one type to another;
        // Implicit Casting;
        // byte > short > int > long > float > double
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);

        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);

    }
}
