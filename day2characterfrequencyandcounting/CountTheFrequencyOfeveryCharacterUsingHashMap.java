package day2characterfrequencyandcounting;
import java.util.*;
public class CountTheFrequencyOfeveryCharacterUsingHashMap {

    public static HashMap<Character,Integer> countChar(String str){
        HashMap<Character,Integer> map= new HashMap<>();
        for(char ch: str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return map;
    }
    public static void main(String[] args){

        String str= "rupakkumarbag";
        System.out.println(countChar(str));
    }
}
