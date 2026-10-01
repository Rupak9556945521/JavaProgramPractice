package Day4StringManipulation;
import java.util.*;
public class CountOccuranceOfEachCharacter {

    public static void findOccuranceOfCharacter(String str){

        LinkedHashMap<Character,Integer> occurance= new LinkedHashMap<>();
        for(char ch: str.toCharArray()){
            occurance.put(ch,occurance.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: occurance.entrySet()){
            System.out.println(entry.getKey() + " = "+entry.getValue());
        }
    }
public static void main(String[] args) {
    String str="Rupakkumarbag";
    findOccuranceOfCharacter(str);
    
}
    
}
