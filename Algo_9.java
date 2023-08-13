import java.util.Scanner;

public class Algo_9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.print("input a single word : ");
            String word = scanner.next();
            if(!scanner.nextLine().trim().isEmpty()) continue;

            String reWord="";
            char[] charWord = word.toCharArray();
            for(int i = charWord.length;i>0;i--){
                reWord+= charWord[i-1]+"";
            }

            if(reWord.equals(word)) System.out.println(word+" is a palindrome.");
               
        }while(true);
        
    }
    
}
