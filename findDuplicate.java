public class findDuplicate {
    public static void findDuplicates(int[] arr){
        int n=arr.length;
        int[] dupi=new int[n];
        
        for(int i=0;i<n-1;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                dupi[i]=arr[i];
            }
        }
       for(int i=0;i<n;i++){
        if(dupi[i]!=0){
            System.out.print(dupi[i] + " ");
        }

       }
        
    }
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        
        findDuplicates(arr);

    }
}
