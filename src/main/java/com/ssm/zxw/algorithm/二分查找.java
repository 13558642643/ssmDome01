package com.ssm.zxw.algorithm;

public class 二分查找 {
    public static void main(String[] args) {
        int nums[] = {214,124,51234,643,684567,12313,235,34,123123,5324,2343532,4235436,47456,8,1,23,432};
        nums = 冒泡排序.getOrderIntArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i +"——"+nums[i]);
        }
        int num = 5324;
        int a = getNumsKey(nums,num);
        System.out.println("数字【"+num+"】的下标是："+a);
    }


    /**
     * 获取数组中num的下标位置
     * @param nums
     * @param num
     * @return
     */
    public static int getNumsKey(int[] nums,int num){
        int low = 0;
        int high = nums.length -1;
        while (low < high){
            int mid = (low + high) /2;
            if(nums[mid] == num){
                return mid;
            }else if(nums[mid] < num){
                low = mid;
            }else if(nums[mid] > num){
                high = mid;
            }
        }
        return -1;
    }
}
