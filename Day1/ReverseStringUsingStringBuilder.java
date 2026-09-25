public class ReverseStringUsingStringBuilder {
    public static void main(String[] args){

        String str="Selenium";
        StringBuilder sb= new StringBuilder();
        
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        
        System.out.println("Reverse string is :"+sb.toString());

    }
}
