package ch5.ex1;

import java.util.Scanner;

// 하향식, 상향식 기본 버전 (앞으로 출력)
public class Recur {

    public static void recur(int x){
        if(x > 0){
            recur(x - 1);
            System.out.println(x);
            recur(x - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : "); int input = scanner.nextInt();

        recur(input);
    }
}
