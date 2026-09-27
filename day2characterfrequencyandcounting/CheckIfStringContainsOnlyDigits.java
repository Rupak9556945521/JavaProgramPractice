package day2characterfrequencyandcounting;

public class CheckIfStringContainsOnlyDigits {
    public static boolean isContainsOnlyDigit(String str){
        for(char ch: str.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str="12345";
        System.out.println(str+" contains only digit "+isContainsOnlyDigit(str));
    }
    
}
