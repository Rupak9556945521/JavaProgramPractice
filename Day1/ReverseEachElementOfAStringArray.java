//Interview-Friendly Method Using Enhanced For Loop
public class ReverseEachElementOfAStringArray {
    public static void main(String[] args){
        String[] strArr= {"Rupak","Kumar","Bag"};

        for(String str: strArr){
            String reverse= new StringBuffer(str).reverse().toString();
            System.out.print(reverse+" ");
        }
    }
}
