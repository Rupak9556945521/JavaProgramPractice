package day3arrays;
import java.util.*;
public class NonRepeatedCharacterinaString {
    public static Character findFirstNotRepeatChar(String str){
        LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();

        for(char ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer>  entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args){
        String str="swwiss";
        System.out.println("First non repeated character is : "+findFirstNotRepeatChar(str));
    }
}
