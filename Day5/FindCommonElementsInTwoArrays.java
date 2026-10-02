package Day5;

public class FindCommonElementsInTwoArrays {
    public static int[] findCommonElement(int[] arr1,int[] arr2){

        int[] commonElement= new int[Math.min(arr1.length,arr2.length)];
        int index=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    commonElement[index++]= arr1[i];
                }
            }
        }
        return commonElement;
    }
    public static void main(String[] args){
        int[] array1={74,23,54,65,32,21,98};
        int[] array2={23,54,65,22,66,54,66};
        int[] result= findCommonElement(array1, array2);
        System.out.println("Common Elements are : ");
        for(int num: result){
            System.out.println(num+ " ");
        }
    }
    
}
