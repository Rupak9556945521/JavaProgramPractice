package day3arrays;

public class FindMissingNumberInArray {
    public static int findMisingNumber(int[] arr){
        int n= arr[arr.length-1];
        int sum = n*(n+1) / 2;
        int actualSum=0;

        for(int a : arr){
            actualSum+=a;
        }
        int missingNum= sum - actualSum;
        return missingNum;

    }
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,7};
        System.out.println("Missing number from the given array is "+findMisingNumber(arr));
    }
    
}
