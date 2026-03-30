import java.util.Scanner;
class minarr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.print("SMALLEST ELEMENT IN AN ARRAY:"+min);
    }
}