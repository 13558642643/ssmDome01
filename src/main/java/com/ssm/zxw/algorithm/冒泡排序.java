package com.ssm.zxw.algorithm;

public class 冒泡排序 {
    public static void main(String[] args) {
        int nums[] = {1,124,123,543,123,1255,121,1,7867,1312,7568,123124,6345};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                int a = nums[i];
                int b = nums[j];
                if(a < b){
                    nums[i] = b;
                    nums[j] = a;
                }
            }
        }
        for(int i : nums){
            System.out.print(i + ",");
        }
    }
    public static int[] getOrderIntArray(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                int a = nums[i];
                int b = nums[j];
                if(a < b){
                    nums[i] = b;
                    nums[j] = a;
                }
            }
        }
        return nums;
    }
}
