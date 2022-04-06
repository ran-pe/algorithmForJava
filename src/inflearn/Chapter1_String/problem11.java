package inflearn.Chapter1_String;

import java.util.Scanner;

/*
[문자열 압축]
알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시
오. 단 반복횟수가 1인 경우 생략합니다.

▣ 입력설명
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

▣ 출력설명
첫 줄에 압축된 문자열을 출력한다.

▣ 입력예제 1
KKHSSSSSSSE

▣ 출력예제 1
K2HS7E
*/
public class problem11 {

    public static String solution(String str) {
        String answer = "";
        // 1. 맨 뒤에 빈 문자열 삽입
        str = str + " ";

        // 2. 문자열을 문자 array로 변환
        char[] c = str.toCharArray();
        int cnt = 1;
        for (int i = 0; i < str.length() -1; i++) {
            if (c[i] == c[i+1]) {
                // 3. 반복문자면 카운트만 증가
                cnt++;
            } else {
                // 4. 현재문자와 다음문자가 다르면(반복문자가 아니면) 해당문자를 저장
                answer+= c[i];
                // 5. 반복문자수가 1보다 크면 카운트도 저장
                if(cnt > 1) {
                    answer+= cnt;
                }
                // 6. cnt 초기화
                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }

}
