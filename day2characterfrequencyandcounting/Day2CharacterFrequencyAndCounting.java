package day2characterfrequencyandcounting;

public class Day2CharacterFrequencyAndCounting {
    public static int countChar(String str, char target){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String str="Selenium";
        char target='e';
        System.out.println(str+" have "+countChar(str, target)+" times "+target);
    }
}