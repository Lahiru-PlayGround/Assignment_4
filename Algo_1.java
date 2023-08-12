import java.util.Scanner;

public class Algo_1{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        long num1 = 0;
        do{
            System.out.print("Enter Possitive number : ");
            num1 = scanner.nextLong();
            if(num1>=0) break;
            System.out.println("Invalid Number, Input vallid Number");   
        }while(true);

        long num2=0;
        long num3=1;
        String num4="Fibonacci sequence upto Number "+num1+" = "+num3+","+num3+",";
        if(num1==num2){
            System.out.println("There is no Fibonacci sequence for number 0");

        }else{
             do{
                num2 = num3-num2;
                num3+=num2;
                if(num3>num1) break;
                num4 +=num3+",";

            }while(true);
            System.out.println(num4+"\b ");
        }
              
    }
}