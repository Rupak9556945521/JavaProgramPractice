package Day5;

public class FindDuplicateInAnArray {
    public static void findDuplicateElement(int[] arr){

        System.out.println("Duplicate Elements are ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={34,53,23,5,65,65,23,23};
        findDuplicateElement(arr);
    }
    
}
