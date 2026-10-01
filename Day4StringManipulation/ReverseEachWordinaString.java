package Day4StringManipulation;

public class ReverseEachWordinaString {
    public static String reverseEachWord(String str){
        String[] words= str.split(" ");


        StringBuilder result= new StringBuilder();
        for(String word: words){
            StringBuilder sb= new StringBuilder(word);
            result.append(sb.reverse()+" ");
        }
        return result.toString();
    }
    public static void main(String[] args){
        String str="java automation programming";
        System.out.println("Reversing each word : "+reverseEachWord(str));
    }
}
