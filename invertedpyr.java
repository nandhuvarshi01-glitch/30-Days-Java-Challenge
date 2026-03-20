class invertedpyr{
    public static void main(String[] args){
        int n=5;
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i+(2*i-1);j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}