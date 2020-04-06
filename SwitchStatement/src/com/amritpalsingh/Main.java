package com.amritpalsingh;

public class Main {

    public static void main(String[] args) {
        String role = "YL";
        switch (role) {
            case "admin":
                System.out.println("You are ADMIN");
                break;
            case "moderator":
                System.out.println("You are MOD");
                break;
            default:
                System.out.println("You are a Guest");
        }
    }
}
