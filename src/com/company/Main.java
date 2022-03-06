package com.company;

import java.util.Scanner;

public class Main {

    //  a보다 작은 숫자 i로 a를 나누었을 때 나머지가 0이 나오지 않는다면 a는 소수이다.

    public static void main(String[] args) {
        while(true) {
            System.out.println("\n숫자를 입력하시오.");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int i = 1;

            while (++i <= a) {
                if (i == a) {
                    System.out.println(a + "은(는) 소수입니다.");
                } else if (a % i == 0) {
                    System.out.println(a + "은(는) 소수가 아닙니다.");
                    break;
                }
            }
        }
    }
}
