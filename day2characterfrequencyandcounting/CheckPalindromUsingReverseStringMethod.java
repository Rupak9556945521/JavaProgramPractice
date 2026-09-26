package day2characterfrequencyandcounting;

public class CheckPalindromUsingReverseStringMethod {
    public static boolean isPalindrom(String str){

        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse= reverse+str.charAt(i);
        }
        return str.equals(reverse);
    }
    public static void main(String[] args){
        String str="madam";
        System.out.println(str +" is "+ isPalindrom(str));
    }
}
