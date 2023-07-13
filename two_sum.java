// https://leetcode.com/problems/two-sum/

import java.util.*;

class two_sum{
    public static void sum(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print(i + " " + j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,3};
        int target=6;
        sum(arr, target);
    }
}
