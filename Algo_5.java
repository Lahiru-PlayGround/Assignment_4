
import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.print("Enter a text : ");
            String text = scanner.nextLine();
            text = text.strip();

            if(text.length()>0){
                String array = "New sequence of characters = ";
                char[] charArray = text.toCharArray();

                for(int i = charArray.length-1;i>=0;i--){
                    if(charArray[i]==' ') continue;
                    array+=charArray[i];
                }
                System.out.println(array);
                break;
            }
            
        System.out.println("Enter valid characters");
        }while(true);
        
    }
    
}
