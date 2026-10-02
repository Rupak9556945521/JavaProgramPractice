package Day5;

import java.util.ArrayList;
import java.util.*;

public class FindCommonElementsInTwoArraysUsingAnList {

    public static int[] findCommonElement(int[] arr1,int[] arr2){
        List<Integer> commonElements= new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    commonElements.add(arr1[i]);
                }
            }
        }
        int[] commonElement= new int[commonElements.size()];
        for(int i=0; i<commonElement.length;i++){
            commonElement[i]= commonElements.get(i);
        }
        return commonElement;

    }
    public static void main(String[] args){
        int[] array1={53,23,54,65,76,12,34,54};
        int[] array2={64,55,23,12,76,78,64,33};
        int[] results= findCommonElement(array1, array2);
        System.out.println("Common elements of two arrays are : ");
        for(int a: results){
            System.out.println(a);
        }
    }
    
}
