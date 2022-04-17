package inflearn.Chapter4_HashMap_HashSet_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

/*
[학급 회장(해쉬)]
학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그
기호를 발표하고 있습니다.
선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작
성하세요. 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
▣ 입력설명
첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로
문자열로 입력됩니다.
▣ 출력설명
학급 회장으로 선택된 기호를 출력합니다.
▣ 입력예제 1
15
BACBACCACCBDEDE
▣ 출력예제 1
C
*/
public class problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(solution(n, str));
    }

    private static char solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        // 문자열크기만큼 반복하면서 문자, 문자개수를 hashMap에 넣는다
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            // hasmMap의 수만큼 반복하면서 문자갯수가 max 값보다 큰지 확인
            if (map.get(key) > max) {
                // max값보다 크면 max값을 변경하고 answer에 입력
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
}
