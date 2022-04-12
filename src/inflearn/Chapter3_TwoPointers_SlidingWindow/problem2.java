package inflearn.Chapter3_TwoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
[공통원소 구하기]
A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로
그램을 작성하세요.
▣ 입력설명
첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
각 집합의 원소는 1,000,000,000이하의 자연수입니다.
▣ 출력설명
두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
▣ 입력예제 1
5
1 3 9 5 2
5
3 2 5 7 8
▣ 출력예제 1
2 3 5
*/
public class problem2 {

    private static ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        // arr1, arr2 오름차순 정렬
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            // 두 배열의 원소가 같으면 answer에 저장 후 p1, p2 증가
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                // arr1의 원소가 크면 p1증가
                p1++;
            } else {
                // arr2의 원소가 크면 p2증가
                p2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        for (int x : solution(n, arr1, m, arr2)) {
            System.out.print(x + " ");
        }
    }
}
