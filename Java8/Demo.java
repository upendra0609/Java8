package com.sikku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number");
        int n = Integer.parseInt(br.readLine().trim());

        for (int i=1;i<=10;i++){
            System.out.println(n*i);
        }

    }
}
