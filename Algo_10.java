import java.util.Scanner;

public class Algo_10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.print("input a phone number : ");
            String number =scanner.nextLine();
            number = number.strip();
            if(number.length()==0){
                System.out.println("Telephone number can't be empty");
                continue;
            }
            int count1=0;
            int count2=0;
            int count3=0;
            char[] charNumber = number.toCharArray();
            for(int i = 0; i<charNumber.length;i++){
                if(!(charNumber.length ==14 || charNumber.length ==11)){
                    System.out.println("Invalid phone number");
                    break;
                }else if(!(Character.isDigit(charNumber[i]))&&!(charNumber[i]=='+' || charNumber[i]==' ' || charNumber[i]=='-') ){
                    System.out.println("Invalid phone number");
                    break;
            
                }else if(charNumber[0]=='+'&&!(charNumber[1]=='9'&&charNumber[2]=='4'&&charNumber[3]==' '&& charNumber[6]==' ')){
                    System.out.println("Invalid phone number");
                    break;
                }else if(charNumber[0]=='0'&&!(charNumber[3]=='-')){
                    System.out.println("Invalid phone number");
                    break;
                }
                if(charNumber[i]=='+')count1++;
                if(charNumber[i]==' ')count2++;
                if(charNumber[i]=='-')count3++;

                if(count1>1||count2>2){
                    System.out.println("Invalid phone number");
                    break;
                }

                if(count3>1){
                    System.out.println("Invalid phone number");
                    break;
                }
                
                if(i==charNumber.length-1) System.out.println("Number is validated");
                
                    
            }
            


        }while(true);
    }
    
}
