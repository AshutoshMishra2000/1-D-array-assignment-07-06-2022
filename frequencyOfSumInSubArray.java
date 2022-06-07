import java.util.ArrayList;

public class frequencyOfSumInSubArray {
    public static void main(String[] args) {
        int arr[]={6,6,6,5,7,4,5,6,7};
        int count=0;
        int frequencySum=18;
        int k=3;
       
        int sum=0;
       
        for(int i=0;i<k;i++){
sum+=arr[i];
if(sum==frequencySum){
    count++;
}

        }
      

        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            if(sum==frequencySum){
                count++;
            }
          
        }

     System.out.println("Frequency of sum "+count);
    }
}
