package day2characterfrequencyandcounting;

public class CheckPalindromUsingRecursion {
    public static boolean isPalindrom(String str){

        if(str.length() <=1){
            return true;
        }
        if(str.charAt(0)!= str.charAt(str.length()-1)){
            return false;
        }

        return isPalindrom(str.substring(1,str.length()-1));
    }

    public static void main(String[] args){
        String str="madam";
        System.out.print(str+ " is "+isPalindrom(str));
    }
}
