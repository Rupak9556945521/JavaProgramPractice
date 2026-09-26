package day2characterfrequencyandcounting;
import java.util.*;

public class RemoveDuplicateCharacter {
    public static String removeDuplicateChar(String str){
        LinkedHashSet<Character> set= new LinkedHashSet<>();
        for(char c: str.toCharArray()){
            set.add(c);
        }
        StringBuilder sb= new StringBuilder();
        for(Character c: set){
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args){

        String str="programming";
        System.out.println("Before removing : "+str);
        System.out.println("After removing :"+removeDuplicateChar(str));
    }
}
