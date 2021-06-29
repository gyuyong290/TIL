package level1;

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>(participant.length);

        for(int i=0; i < participant.length; i++){
            int value = map.get(participant[i]) != null ? map.get(participant[i]) : 0;
            map.put(participant[i], value + 1);
        }

        for(int i=0; i< completion.length; i++){
            int value = map.get(completion[i]);
            if(value == 1){
                map.remove(completion[i]);
            }else{
                map.put(completion[i], value-1);
            }
        }

        answer = map.keySet().iterator().next();
        return answer;
    }
}