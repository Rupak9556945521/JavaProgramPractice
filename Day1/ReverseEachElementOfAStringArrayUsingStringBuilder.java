import java.util.Arrays;

public class ReverseEachElementOfAStringArrayUsingStringBuilder {
    public static void main(String[] args){
        String str[]={"Java","Selennium","Automation","Salesforce"};

        for(int i=0; i<str.length;i++){
            str[i] = new StringBuilder(str[i]).reverse().toString();
        }
        System.out.println(Arrays.toString(str));
    }
}
