package inflearn.Chapter3_TwoPointers_SlidingWindow;

import java.util.Scanner;

/*
[연속된 자연수의 합]
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는
방법의 가짓수를 출력하는 프로그램을 작성하세요.
만약 N=15이면
7+8=15
4+5+6=15
1+2+3+4+5=15
와 같이 총 3가지의 경우가 존재한다.
▣ 입력설명
첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
▣ 출력설명
첫 줄에 총 경우수를 출력합니다.
▣ 입력예제 1
15
▣ 출력예제 1
3
*/
public class problem5 {
    // 수학적 방법
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(solution(n));
    }

    private static int solution(int n) {
        // 연속된 자연수의 합을 찾으려면
        // 2개: 1, 2 를 n에서 빼서 2로 나눈 나머지가 0이면 연속된 2개의 자연수의 합으로 표현가능 ex) 15 - (1 + 2) / 2 = 6 연속된 자연수: 1+6, 2+6
        // 3개: 1, 2, 3을 n에서 빼서 3으로 나눈 나머지가 0이면 연속된 3개의 자연수의 합으로 표현가능 ex) 15 - (1 + 2 + 3) / 3 = 3 연속된 자연수: 1+3, 2+3, 3+3
        int answer = 0;
        // cnt: 연속된 자연수의 갯수
        int cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            // n에서 2를 뺀다.
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }
        return answer;
    }
}

class problem5_1 {
    // two pointers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int sum = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }
        int lt = 0;
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
