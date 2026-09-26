package day2characterfrequencyandcounting;
import java.util.HashMap;
import java.util.Map;
/**
 * This Java method receives a string as input and returns a Map containing the frequency of each character.
 */

public class FindCharacterFrequencyUsingMap {
    public static Map<Character,Integer> findFrequency(String str){

        Map<Character,Integer> frequency= new HashMap<>();

        for(char ch: str.toCharArray()){
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }
        return frequency;

    }

    public static void main(String[] args){
        String str="rupakkumarbag";
        System.out.println(findFrequency(str));
    }
}