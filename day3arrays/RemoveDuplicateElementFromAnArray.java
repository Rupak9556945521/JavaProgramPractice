package day3arrays;
import java.util.*;

public class RemoveDuplicateElementFromAnArray {
    public static Set<Integer> findUniqueValues(int[] arr){
        Set<Integer> unique= new LinkedHashSet<>();

        for(int n: arr){
            unique.add(n);
        }
        return unique;
    }
    public static void main(String[] args){
        int[] arr={11,43,32,11,56,10,20,43,56,22};
        
        System.out.println("Unique values are : "+findUniqueValues(arr));
    }
    
}
