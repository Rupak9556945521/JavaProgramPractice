package day3arrays;
import java.util.*;
public class RotateAnArrayByOnePosition {
    public static void rotateArray(int[] arr){
    int last=arr[arr.length-1];
    for(int i=arr.length-1;i>0;i--){
        arr[i]=arr[i-1];
    }
    arr[0]=last;

}
public static void main(String[] args) {
    int[] arr={34,23,64,76};
    System.out.println("Before rotation : "+Arrays.toString(arr));
    rotateArray(arr);
    System.out.println("After rotation: " + Arrays.toString(arr));
}
    
}
