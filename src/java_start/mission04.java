package java_start;

import java.util.Scanner;

public class mission04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}
