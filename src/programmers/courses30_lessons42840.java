package programmers;

import java.util.ArrayList;
import java.util.Arrays;

/*

https://programmers.co.kr/learn/courses/30/lessons/42840?language=java#
코딩테스트 연습 > 완전탐색 > 모의고사


문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
입출력 예
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
입출력 예 설명
입출력 예 #1

수포자 1은 모든 문제를 맞혔습니다.
수포자 2는 모든 문제를 틀렸습니다.
수포자 3은 모든 문제를 틀렸습니다.
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

입출력 예 #2

모든 사람이 2문제씩을 맞췄습니다.

*/
public class courses30_lessons42840 {

    public int[] solution(int[] answers) {
        int[] answer = {};

        // 1. 학생들의 점수를 초기화
        int[] score = {0, 0, 0};
        ArrayList<Integer> maxScore = new ArrayList<>();

        // 2. 학생들마다 패턴을 셋팅
        int[][] patterns = {
                {1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // 3. 학생의 수만큼 점수 계산
        for (int i = 0; i < answers.length; i++) {
            if (patterns[0][i % 5] == answers[i]) {
                score[0]++;
            }

            if (patterns[1][i % 8] == answers[i]) {
                score[1]++;
            }

            if (patterns[2][i % 10] == answers[i]) {
                score[2]++;
            }
        }

        // 4. 정렬을 하고 가장 큰 값(고득점)을 찾는다.
        int[] sortScore = score.clone();
        Arrays.sort(sortScore);
        int max = sortScore[2];

        // 5. 학생들 점수를 고득점과 비교해서 고득점이면 maxScore에 넣는다
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                maxScore.add(i + 1);
            }
        }

        // 6. 리턴값인 answer에 maxScore를 차례로 넣는다
        answer = new int[maxScore.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = maxScore.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {

        courses30_lessons42840 t = new courses30_lessons42840();
        int[] answers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(t.solution(answers)));

    }

}
