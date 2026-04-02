import java.util.Scanner;
class EOcountarr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int evencount=0,oddcount=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }

        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
}