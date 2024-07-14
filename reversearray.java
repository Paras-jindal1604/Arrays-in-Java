public class reversearray {
    public static void reverse(int a[]){
        int first = 0, last = a.length-1;

        while(first<last){
            int temp =a[last];
            a[last] = a[first];
            a[first] = temp;

            first++;
            last--;
        }
    }
   public static void main(String[] args) {
    int a[] = {2,4,6,8};

    reverse(a);
    
    for(int i=0;i<a.length;i++){
        System.out.print(a[i] + " ");
    }
    System.out.println();
   }
}
