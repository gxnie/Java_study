package java_start;

import java.util.Scanner;

public class mission03_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > 0 && num2 < 0){
            System.out.println(num1 * num2);
        }
    }
}
