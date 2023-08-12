public class Algo_4 {
    public static void main(String[] args) {
        int [] nums ={10,20,30,40,50,60};
        int [] newNums = new int[nums.length];
        for(int i =0 ; i< newNums.length/2;i++  ){
            int x=0;
            x=nums[i];
            nums[i]=nums[(nums.length-1)-i];
            nums[(nums.length-1)-i]=x;
        }
        String array = "New nums Array = ";
        for(int i = 0 ;i<nums.length;i++){
            array+=nums[i]+",";
        }
        
        System.out.println(array+"\b ");

    }
    
}
