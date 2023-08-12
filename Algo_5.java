import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a text : ");
        String text = scanner.nextLine();
        text = text.strip();

        if(text.length()>0){

            char[] charArray = text.toCharArray();
            String[] wordArray = new String[0];

            for(int i = 0;i<charArray.length;i++){
                //int x=0;
                String word="";
                
                String[] temp = new String[wordArray.length+1];
                for(int j=i;j<charArray.length;j++){
                    word+=charArray[i];
                    if(charArray[i]==' '|| j==charArray.length-1){
                        for(int z=0;z<wordArray.length;z++){
                            temp[z]=wordArray[z];
                        }
                        temp[temp.length-1]=word;
                        wordArray =temp;
                        break;
                    }
                    i++;

               }
            }
            String array = "New order of words = ";
            for(int i = 0 ;i<wordArray.length;i++){
            array+=wordArray[(wordArray.length-1)-i]+" ";
            }
        
            System.out.println(array+"\b ");
        }
        
    }
    
}
