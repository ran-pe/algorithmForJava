package inflearn.Chapter1_String;

import java.util.Scanner;

/*
[중복문자제거]
소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하
세요.
제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

▣ 입력설명
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.

▣ 출력설명
첫 줄에 중복문자가 제거된 문자열을 출력합니다.

▣ 입력예제 1
ksetkset

▣ 출력예제 1
kset
*/
public class problem6 {

    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));

            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
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
