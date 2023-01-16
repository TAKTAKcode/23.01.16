package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //만약에 3개가 모두 같으면 10,000 + (눈) * 1000
        //만약에 2개가 같으면 1000 + (눈) * 100
        //만약에 다 다르면 (큰 눈) * 100

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //만약에 3개가 모두 같으면 10,000 + (눈) * 1000
        if (a == b && a == c) {

            System.out.println(10000 + a * 1000);

        //만약에 다 다르면 (큰 눈) * 100
        } else if (a != b && b != c && c != a) {

            int max;

            if (a > b) {

                if (c > a) {
                    max = c;
                } else {
                    max = a;
                }

            } else {

                if (c > b) {
                    max = c;
                } else {
                    max = b;
                }

            }

            System.out.println(max * 100);

        //만약에 2개가 같으면 1000 + (눈) * 100
        } else {

            if(a == b || a == c) {
                    System.out.println(1000 + a * 100);
                }
                // b가 c랑 같은 경우
                else {
                    System.out.println(1000 + b * 100);
                }

            }

    }

}
