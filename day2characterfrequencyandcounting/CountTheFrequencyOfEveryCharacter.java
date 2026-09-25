package day2characterfrequencyandcounting;

public class CountTheFrequencyOfEveryCharacter {
//     public static void printFrequency(String str) {

//     for (int i = 0; i < str.length(); i++) {

//     char currentChar = str.charAt(i);
//     int count = 0;
//     boolean alreadyCounted = false;

// // Check if character was already processed
//     for (int j = 0; j < i; j++) {
//     if (currentChar == str.charAt(j)) {
//     alreadyCounted = true;
//     break;
//        }
//     }

// // Skip if already counted
//     if (alreadyCounted) {
//     continue;
//     }

// // Count frequency
//     for (int k = 0; k < str.length(); k++) {
//     if (currentChar == str.charAt(k)) {
//     count++;
//     }
// }

//     System.out.println(currentChar + " -> " + count);
//     }
// }

//     public static void main(String[] args) {
//     String str = "seiilenium";
//     printFrequency(str);
    
//     }


public static void countFrequency(String str){
    for(int i=0;i<str.length();i++){
        char currentChar= str.charAt(i);
        boolean alreadyProcessed= false;
        int count=0;

       //Check if char is already proceed
        for(int j=0;j<i;j++){
            if(currentChar==str.charAt(j)){
                alreadyProcessed=true;
                break;
            }
        }
         // skip if already processed
        if(alreadyProcessed){
            continue;
        }
        //count character if not proceed
        for(int k=0;k<str.length();k++){
            if(currentChar == str.charAt(k)){
              count++;  
            }
        
        }

        System.out.println(currentChar+"-> "+count);
    }
}

    public static void main(String[] args){
        String str="rupakkumarbag";
        countFrequency(str);
    }
    
}


