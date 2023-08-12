public class Algo_2 {
    public static void main(String[] args) {
        int[] nums ={-5,2,7,10,58,-7,8,23};
        int x = Integer.MAX_VALUE;
        int y = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<x)x=nums[i];
            if(nums[i]>y) y=nums[i];
        }
        System.out.println("Max value = "+y+" Min Value = "+x);
    }
    
}
