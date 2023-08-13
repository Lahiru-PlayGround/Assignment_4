public class Algo_8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        String numbers ="Intersecttion  = ";
        for(int i =0;i<numA.length;i++){
            for(int j =0;j<numA.length;j++){
                if(numA[i]==numB[j]){
                    numbers+=numA[i]+",";
                    break;
                }      
            }    
        }

        String numbers2 ="union =";
        for(int i =0;i<numA.length;i++){
            for(int j =0;j<numA.length;j++){
                if(numA[i]==numB[j]){
                    break;
                    
                }if(j==numA.length-1)numbers2+=numA[i]+",";     
            }
            numbers2+=numB[i]+",";
        }

        String numbers3 ="Relative Complement A\\B =";
        for(int i =0;i<numA.length;i++){
            for(int j =0;j<numA.length;j++){
                if(numA[i]==numB[j]){
                    break;
                    
                }if(j==numA.length-1)numbers3+=numA[i]+",";     
            }
        }

        String numbers4 ="Relative Complement B\\A =";
        for(int i =0;i<numA.length;i++){
            for(int j =0;j<numB.length;j++){
                if(numB[i]==numA[j]){
                    break;
                    
                }if(j==numB.length-1)numbers4+=numB[i]+",";     
            }
        }

        String numbers5 ="Symmetric Difference =";
        for(int i =0;i<numA.length;i++){
            for(int j =0;j<numB.length;j++){
                if(numB[i]==numA[j]){
                    break;
                    
                }if(j==numB.length-1)numbers5+=numB[i]+",";     
            }
            for(int j =0;j<numA.length;j++){
                if(numA[i]==numB[j]){
                    break;
                    
                }if(j==numA.length-1)numbers5+=numA[i]+",";     
            }
        }
        
        System.out.println(numbers+"\b ");
        System.out.println(numbers2+"\b ");
        System.out.println(numbers3+"\b ");
        System.out.println(numbers4+"\b ");
        System.out.println(numbers5+"\b ");

    }
    
}
