import java.lang.Math;
class Solution {

    int minMax(int arr[],int l,int u,boolean min){
              
        if(l>=u) return arr[l];
        int m = l + (u - l) / 2;

        int x=minMax(arr,l,m,true);
        int y=minMax(arr,m+1,u,false);  

        if(min){
            return Math.min(x,y);        
        }
        else{
            return Math.max(x,y);       
        }
    }
    public int minMaxGame(int[] nums) {
        return minMax(nums,0,nums.length-1,true);
    }
}
