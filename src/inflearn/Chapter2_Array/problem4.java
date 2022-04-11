package inflearn.Chapter2_Array;

import java.util.Scanner;

/*
[피보나치 수열]
1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는
수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면
된다.
▣ 입력설명
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
▣ 출력설명
첫 줄에 피보나치 수열을 출력합니다.
▣ 입력예제 1
10
▣ 출력예제 1
1 1 2 3 5 8 13 21 34 55
*/
public class problem4 {

    public static int[] solution(int n) {
        int[] answer = new int[n];
        // 1. 첫번째, 두번째 수는 1로 초기화
        answer[0] = 1;
        answer[1] = 1;
        // 2. n만큼 반복하면서 앞의 2개의 수를 합한다.
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int x : solution(n)) {
            System.out.print(x + " ");
        }
    }

}

class problem4_1 {

    public static void solution(int n) {
        int a = 1, b = 1, c;
        // 1. 첫번째, 두번째 수를 출력
        System.out.print(a + " " + b + " ");
        // 2. n만큼 반복하면서 앞의 2개의 수를 합한다.
        for (int i = 2; i < n; i++) {
            c = a + b;
            // 3. 합한 수를 출력
            System.out.print(c + " ");
            // 4. 숫자증가
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        solution(n);
    }
}
