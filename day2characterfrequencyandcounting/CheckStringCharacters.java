package day2characterfrequencyandcounting;

public class CheckStringCharacters {
    public static boolean containsOnlyLetters(String str){
        for(char ch: str.toCharArray()){
            if(!Character.isLetter(ch)){
                return false;
            }
        }
        return true;
    }

    public static boolean containsCharacter(String str, char target){
        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        String str="Hello";
        char target='e';

        System.out.println(str+" contains only letters: "+containsOnlyLetters(str));
        System.out.println(str+" contains character '"+target+"': "+containsCharacter(str, target));
    }
}