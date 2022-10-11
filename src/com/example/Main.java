package com.example;

public class Main {
    public static void main(String[] args) {
        byte validByte = 117;
        short validShort = 487;
        int validInt = 10957230;

        long validLong = 50000 + (10 * (validByte + validShort + validInt));

        System.out.println(validLong);
    }
}