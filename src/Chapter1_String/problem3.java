package Chapter1_String;

import java.util.Scanner;

/*
[문장 속 단어]
한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
문장속의 각 단어는 공백으로 구분됩니다.

▣ 입력설명
첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성
되어 있습니다.

▣ 출력설명
첫 줄에 가장 긴 단어를 출력한다. 가장 긴 단어가 여러개일 경우 문장속에가 가장 앞쪽에 위
치한 단어를 답으로 합니다.

▣ 입력예제 1
it is time to study

▣ 출력예제 1
study
*/
public class problem3 {

    public static String solution2(String str) {
        String answer = "";
        int minValue = Integer.MIN_VALUE;
        int pos;
        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > minValue) {
                minValue = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        // 마지막 단어 처리
        if(str.length() > minValue) {
            answer = str;
        }
        return answer;
    }

    public static String solution(String str) {
        String answer = "";
        int minValue = Integer.MIN_VALUE;
        String[] word = str.split(" ");
        for (String x : word) {
            int len = x.length();
            if (len > minValue) {
                minValue = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution2(str));
    }


}
