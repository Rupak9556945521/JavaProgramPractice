package day2characterfrequencyandcounting;

public class CheckStringCharacters2 {
    public static boolean isContainsCharacterOnly(String str){
        for(char ch: str.toCharArray()){
            if(!Character.isLetter(ch)){
                return false;
            }
        }
        return true;
    }
    public static boolean isLetterPresent(String str,char target){
        for(char ch: str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String str="rupakkumarbag";
        char target='g';

        System.out.println(str+" contains only letter "+isContainsCharacterOnly(str));
        System.out.println(str+" contains "+target+ ": "+isLetterPresent(str, target));
    }
    
}
