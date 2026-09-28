package day3arrays;
import java.util.Arrays;
public class ReverseAnArrayUsingTwoPointerTechnique {
    public static void main(String[] args){
        int[] arr={53,65,76,23,87,10};
        int left= 0;
        int right=arr.length-1;

        while (left<right) {
            int temp= arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reverse array is "+Arrays.toString(arr));
    }
    
}
