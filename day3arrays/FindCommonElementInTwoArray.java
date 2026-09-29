package day3arrays;
import java.util.*;
public class FindCommonElementInTwoArray {
    public static void main(String[] args){
        int[] a={34,21,5,6,12,8,13};
        int[] b={21,32,4,6,5,13,12};

        HashSet<Integer> set= new HashSet<>();
        LinkedHashSet<Integer> common= new LinkedHashSet<>();

        for(int n: a){
            set.add(n);
        }

        for(int n:b){
            if(set.contains(n)){
                common.add(n);
            }
        }
        System.out.println("Common elements are : "+common);
    }
    
}
