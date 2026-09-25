public class ReverseEachWordOfSentence {

    public static void main(String[] args){
        String str= "Java selenium automation";
        String[] words= str.split(" ");

        for(String word: words){
            String reverse="";
        
            for(int i=word.length()-1;i>=0;i--){
                reverse = reverse + word.charAt(i);

            }
            System.out.print(reverse+ " ");
        }

        
        
    }
    
}
