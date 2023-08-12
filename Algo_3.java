public class Algo_3 {
    public static void main(String[] args) {
        int [] nums ={10,20,30,40,50};
        int [] newNums = new int[nums.length];
        for(int i =0 ; i< newNums.length;i++  ){
            newNums[i]=nums[(nums.length-1)-i];
        }

        nums=newNums;
        
        String array = "New nums Array = ";
        for(int i = 0 ;i<nums.length;i++){
            array+=nums[i]+",";
        }
        
        System.out.println(array+"\b ");

    }
    
}
