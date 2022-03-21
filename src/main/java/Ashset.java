import java.util.*;
public class Ashset {
    public static void  hashset(int []nums,int target){
       Set<Integer>hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(target-nums[i])){
                int value = target-nums[i];
                System.out.println(value+","+nums[i]);


            }
            hs.add(nums[i]);

        }
        return ;
    }
    public static void main(String [] args){
        int[] nums = {  7, 2, 5, 3, 1,5,9 };
        int target = 10;

        hashset(nums,target);
    }
}
