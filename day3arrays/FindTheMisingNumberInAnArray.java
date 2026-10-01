package day3arrays;

public class FindTheMisingNumberInAnArray {
    public static int findMisingNumber(int[] arr){
        int n=arr.length+1;
        int totalSum= n*(n+1)/2;
        //int missingNumber;

        int addElement=0;

        for(int a:arr){
            addElement+=a;
        }
        return  totalSum-addElement;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,6,7,8};
        System.out.println("Missing element is "+findMisingNumber(arr));
    }
}
