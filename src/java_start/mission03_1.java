package java_start;

import java.util.Scanner;

public class mission03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int score = sc.nextInt();

        if(age >= 18 && score >= 70){
            System.out.println("합격");
        }
    }
}
