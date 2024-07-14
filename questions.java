public class questions {
    public static boolean duplicateElement(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    return true;
                }
                
            }
        }
        return false;
    }

    public static void triplets(int a[]){
       
        for(int i=1;i<a.length;i++){
            for(int j=i+1; j<a.length; j++){
                for(int k =j+1;k<a.length;k++){
                     
                        if( a[i]+a[j]+a[k] == 0){
                            System.out.println( "(" + a[i]+ "," + a[j] + "," + a[k] + ")");
                        }

                    }
                }
            }
        }
      
    public static void main(String[] args) {
        int a[] = {-1,2,3,-5,2,1,-3};
        System.out.println(duplicateElement(a));
       
    }
    
}
