// https://leetcode.com/problems/find-the-duplicate-number/

class Duplicate{
    public static int findDuplicate(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,1,4,2};
        System.out.println(findDuplicate(arr));
    }
}