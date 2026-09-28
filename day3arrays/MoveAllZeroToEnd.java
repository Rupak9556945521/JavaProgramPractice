package day3arrays;
import java.util.*;
public class MoveAllZeroToEnd {
    public static int[] moveAllZeroToEndOfTheArray(int[] arr){
        int index=0;

        for(int num:arr){
            if(arr[index]!=0){
                arr[index]=num;
                index++;
            }
        }
        while (index<arr.length) {
            arr[index]=0;
            index++;
        }
        return arr;
    }

    public static void main(String[] args){
        int arr[]= {32,12,4,0,4,0,2,0};
        System.out.println("Arrays before moving zeros: "+Arrays.toString(arr));
        System.out.println("Array after moving all zeros to end : "+Arrays.toString(moveAllZeroToEndOfTheArray(arr)));
    }
    
}
