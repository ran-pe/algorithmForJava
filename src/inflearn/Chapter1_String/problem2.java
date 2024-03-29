package inflearn.Chapter1_String;

import java.util.Scanner;

/*
https://cote.inflearn.com/contest/10/problem/01-02

[대소문자 변환]

대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로
변환하여 출력하는 프로그램을 작성하세요.

▣ 입력설명
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
문자열은 영어 알파벳으로만 구성되어 있습니다.

▣ 출력설명
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.

▣ 입력예제 1
StuDY

▣ 출력예제 1
sTUdy
*/
public class problem2 {

    public static String solution2(String str) {
        // 대문자: 65~90, 소문자: 97~122, 대문자와 소문자의 차이: 32
        String answer = "";
        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122) answer += (char) (x - 32);
            else answer += (char) (x + 32);
        }
        return answer;
    }

    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                // 소문자는 대문자로 변환
                answer += Character.toUpperCase(ch);
            } else {
                // 대문자는 소문자로 변환
                answer += Character.toLowerCase(ch);
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
