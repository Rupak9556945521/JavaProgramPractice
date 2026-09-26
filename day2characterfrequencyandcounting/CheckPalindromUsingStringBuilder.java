package day2characterfrequencyandcounting;

public class CheckPalindromUsingStringBuilder {

    public static boolean isPalindrom(String str){
        String reverse= new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }

    public static void main(String[] args){
        String str="madam";
        System.out.println(str+" is "+isPalindrom(str));
    }
}
