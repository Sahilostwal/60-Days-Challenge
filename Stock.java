// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class stock{
    public static int maxprofit(int[] arr){
    int maxprofit=0;
    int min=arr[0];
    int n=arr.length;
    for(int i=1;i<n;i++){
        int cost=arr[i]-min;
        maxprofit=Math.max(maxprofit,cost);
        min=Math.min(min,arr[i]);
    }
    return maxprofit;
    }
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(maxprofit(arr));
    }
}
