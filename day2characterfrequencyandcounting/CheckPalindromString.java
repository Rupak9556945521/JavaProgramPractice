package day2characterfrequencyandcounting;

public class CheckPalindromString {

    public static boolean isPalindrom(String str){

        int left=0;
        int right=str.length()-1;
        boolean palindrom;
        while (left<right) {
            if(str.charAt(left)!= str.charAt(right)){
            return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String str= "madami";
        System.out.println(str+ " is a palindrom "+isPalindrom(str));
    }
}
