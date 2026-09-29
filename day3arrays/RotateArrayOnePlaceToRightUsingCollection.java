package day3arrays;
import java.util.*;
public class RotateArrayOnePlaceToRightUsingCollection {

public static void main(String[] args){

    Integer[] arr={23,54,12,54,56,64};
    
    List<Integer> list= new ArrayList<>(Arrays.asList(arr));
    System.out.println("Before rotation "+list);
    
    Collections.rotate(list,1);

    System.out.println("After rotation "+list);
}
    
}
