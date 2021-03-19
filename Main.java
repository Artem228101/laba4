package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("n");
        double n = in.nextDouble();
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s=Math.sin(i)+Math.sin(i)*Math.sin(i);
        }
        System.out.println(s);
    }
}