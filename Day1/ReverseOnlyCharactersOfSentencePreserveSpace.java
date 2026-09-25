

public class ReverseOnlyCharactersOfSentencePreserveSpace {
    public static void main(String[] args){
        String str="I love java";

        String rev="";

        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.print(rev);
    }
}
