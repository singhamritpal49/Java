package com.amritpalsingh;

public class Main {

    public static void main(String[] args) {
        String name = greetUser("Amrit");
        System.out.println(name);
    }

    public static String greetUser(String name) {
      return "Hello" + name;
    }
}
