package inflearn.Chapter2_Array;

import java.util.Scanner;

/*
[소수(에라토스테네스 체)]
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
제한시간은 1초입니다.
소수: 1과 그 수 자신 이외의 자연수로는 나눌 수 없는, 1보다 큰 자연수
▣ 입력설명
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
▣ 출력설명
첫 줄에 소수의 개수를 출력합니다.
▣ 입력예제 1
20
▣ 출력예제 1
8
*/
public class problem5 {

    public static int solution(int n) {
        int answer = 0;
        // 1. ch를 n+1만큼 초기화한다.
        int[] ch = new int[n + 1];
        // 2. 2부터 n까지 반복한다.
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                // 3. i의 배수를 모두 1로 체크한다.
                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution(n));
    }
}
