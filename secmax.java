import java.util.Scanner;
class secmax{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
            else if(arr[i]>secmax && arr[i]!=max){
                secmax=arr[i];
            }
        }
        System.out.print(secmax);
    }
}