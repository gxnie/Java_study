package java_start;

import java.util.Scanner;

public class mission04_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력해주세요.");
        int number1 = sc.nextInt();

        System.out.println("두번째 정수를 입력해주세요.");
        int number2 = sc.nextInt();

        System.out.println("사칙연산을 입력해주세요.");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(number1 + number2);
                break;

            case '-':
                System.out.println(number1 - number2);
                break;

            case '*':
                System.out.println(number1 * number2);
                break;

            case '/':
               if(number2 != 0){
                   System.out.println(number1 / number2);
               } else {
                   System.out.println("0으로 나눌 수 없습니다.");
               }
               break;

            default:
                System.out.println("올바르지 않은 값입니다.");
        }
    }
}
