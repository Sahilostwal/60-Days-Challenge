// https://leetcode.com/problems/remove-duplicates-from-sorted-array/


public class remove_duplicate {
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int remove(int[] arr){
        
        if(arr.length==0){
            return 0;
        }
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];

            }
        }
        return i+1;
    } 
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.print(remove(arr));
        System.out.println();
        display(arr);
    }
}
