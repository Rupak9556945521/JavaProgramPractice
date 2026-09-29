package day3arrays;
import  java.util.*;

public class FindFrequencyOfEachElementInArray {
	public static HashMap<Integer, Integer> findFrequency(int[] arr) {
		HashMap<Integer,Integer> map= new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
    
		return map;
	}

    public static void main(String[] args){
        int[] arr= {23,53,13,23,23,53,56};
        System.out.println("Frequency "+findFrequency(arr));
    }
}
