package inflearn.Chapter2_Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
[큰 수 출력하기]
N(1<=N<=100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작
성하세요.(첫 번째 수는 무조건 출력한다)
▣ 입력설명
첫 줄에 자연수 N이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
▣ 출력설명
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
▣ 입력예제 1
6
7 3 9 5 6 12
▣ 출력예제 1
7 9 6 12
*/
public class problem1 {

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 1. 첫 번째 수는 출력
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            // 2. 두 번째 수부터 for문을 돌면서 비교
            if (arr[i] > arr[i - 1]) {
                // 3. 앞의 수 보다 크면 출력
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
