/*
    마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
    completion의 길이는 participant의 길이보다 1 작습니다.
    참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
    참가자 중에는 동명이인이 있을 수 있습니다.
*/
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        // 오름차순으로 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        //completion 길이 안에 들어가는지 확인
        for (int i = 0; i < completion.length; i++) {
            //participant와 completion 각각 배열에서 다른 값이 있는지 확인
            if (!participant[i].equals(completion[i])) {
                return participant[i]; //다른 값 가지고 나오기
            }
        }
        return participant[i]; // 완주하지 못한 선수가 가장 끝에 있을 때
    }
}