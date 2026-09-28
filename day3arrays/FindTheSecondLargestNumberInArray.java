package day3arrays;

public class FindTheSecondLargestNumberInArray {
    public static void main(String[] args){
        int[] arr={43,54,66,77,23,44,98};
        int largest= Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest && num<largest){
                secondLargest=num;
            }
            
        }
        if(secondLargest== Integer.MIN_VALUE){
                System.out.println("No second Largest Number found");
            }
            else {
                System.out.println("Second largest number is :"+secondLargest);
            }
    }
    
}
