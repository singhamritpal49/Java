package com.amritpalsingh;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Arrays have fixed length;
        //old array syntax
        int[] number = new int[6];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        // To print array use Arrays.toString()
        System.out.println(Arrays.toString(number));

        // new syntax
        int[] numbers = { 5, 4, 3, 1 };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        // Multi Dimension Array;
        // Old syntax
        int[][] multiArray = new int[2][3];
        multiArray[0][0] = 1;
        multiArray[0][1] = 2;
        System.out.println(Arrays.deepToString(multiArray));

        // New  Syntax
        int[][] newArray = {{12,3},{2,3}};
        System.out.println(Arrays.deepToString(newArray));

    }
}
