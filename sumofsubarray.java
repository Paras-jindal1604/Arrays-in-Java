public class sumofsubarray {
    public static void printsubarray(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            
            for(int j=i;j<a.length;j++){
               
                for(int k=i;k<=j;k++){
                    
                    System.out.print(a[k]+" ");
                    sum = sum + a[k];
                        
                }
                System.out.println();
               
            }
            System.out.println();
        }
        System.out.println("sum: " + sum);
        
    }
    public static void main(String[] args) {
        int a[] = {2,4,6,8,10};
        printsubarray(a);
    }
}
