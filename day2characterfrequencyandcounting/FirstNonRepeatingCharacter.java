package day2characterfrequencyandcounting;
import java.util.*;
public class FirstNonRepeatingCharacter {
    public static char findNonRepeatChar(String str){
        Map<Character,Integer> frequency = new HashMap<>();

        for(char ch: str.toCharArray()){
            frequency.put(ch,frequency.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character,Integer> entry: frequency.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '\0';
    }
    public static void main(String[] args){
        String str="programming";
        System.out.println("First non repeating character "+findNonRepeatChar(str));
    }
}
