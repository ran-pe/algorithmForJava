package inflearn.Chapter1_String;

import java.util.Arrays;
import java.util.Scanner;

/*
[가장 짧은 문자거리]
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출
력하는 프로그램을 작성하세요.

▣ 입력설명
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.

▣ 출력설명
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

▣ 입력예제 1
teachermode e

▣ 출력예제 1
1 0 1 2 1 0 1 2 2 1 0
*/
public class problem10 {

    public static int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;
        // 1. 문자열의 문자와 입력된 문자가 같은지 비교
        for (int i = 0; i < str.length(); i++) {
            // 2. 같으면 거리를 0으로 하고 리턴값에 저장
            if (str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                // 3. 다르면 거리를 증가하고 리턴값에 저장
                p++;
                answer[i] = p;
            }
        }

        // 4. 뒤에서도 거리를 비교하여 저장된 값과 현재 값을 비교하여 작은값을 저장
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        for (int x : solution(str, c)) {
            System.out.print(x + " ");
        }
    }

}
