package day3arrays;

public class FindTheLargestAndSmallestNumberInArray {
    public static void main(String[] args){
        int[] arr= {34,-6,98,19,21,10,6};
        int smallest=arr[0];
        int largest=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest number in the given array is "+smallest);
        System.out.println("Largest number in the given array is "+largest);
    }
    
}
