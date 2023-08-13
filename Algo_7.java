import java.util.Arrays;
import java.util.Scanner;

public class Algo_7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.print("Enter a sentence = ");
            String sentence =scanner.nextLine();
            sentence =sentence.strip();
            if(sentence.length()>0){
                char[] charTexts =sentence.toCharArray();
                String[] names = new String[0];
                int[] noOfLetters = new int[0];
                for(int i = 0;i<charTexts.length;i++){
                    String[] temp1 = new String[names.length+1];
                    int[] temp2 = new int[noOfLetters.length+1];
                    String words="";
                    int count = 0;
                    for(int j = i;j<charTexts.length;j++){
                        words+=charTexts[j];
                        count++;
                        if(charTexts[j]==' '||j== charTexts.length-1){
                            for(int k =0;k<names.length;k++){
                                temp1[k]=names[k];
                                temp2[k]=noOfLetters[k];
                            }
                            temp1[temp1.length-1]=words;
                            if(j== charTexts.length-1){
                                temp2[temp2.length-1]=count;
                            } else{
                                temp2[temp2.length-1]=count-1;
                            }
                            
                            names=temp1;
                            noOfLetters=temp2;
                            break;
                        }
                        i++;

                    }
                }
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                int maxNumber =0;
                int minNumber=0;
                String longestWord="";
                String shortestWord ="";
                for(int i = 0;i<noOfLetters.length;i++){
                    if(noOfLetters[i]>=max) {
                        max=noOfLetters[i];
                        maxNumber=noOfLetters[i];
                        longestWord=names[i];                               
                    } 
                    if(noOfLetters[i]<=min) {
                        min=noOfLetters[i];
                        minNumber=noOfLetters[i];
                        shortestWord=names[i]; 
                                                          
                    }
                }
                System.out.println("the longest words from the sentence : "+longestWord+" \nthe respective lengths : "+maxNumber);
                System.out.println("the shortest words from the sentence : "+shortestWord+"\nthe respective lengths : "+minNumber);
                break;
            }
            System.out.println("Invalied sentence");
        }while(true);
    }
    
}
