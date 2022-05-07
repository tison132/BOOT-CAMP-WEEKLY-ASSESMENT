import java.util.*;

class flower_bed {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int k=scan.nextInt();
        flower(n,arr,k);
    }
    public static void flower(int n,int arr[],int k){
        int count=0;
        for(int i=0;i<n;i++){
            if(i==0){
                if(arr[i]==0 && arr[i+1]==0){
                    count++;
                }
            }
            if(i==n-1){
                if(arr[i]==0 && arr[i-1]==0){
                    count++;
                }
            }
            if(i>0 && i<n-1){
                if(arr[i]==0 && arr[i-1]==0 && arr[i+1]==0){
                    count++;
                }
            }
        }
        if(count>=k){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
