import java.util.*;
public class largesmallinarray {
    public static int getlargest(int a[]){
        int largest = Integer.MIN_VALUE;            // to get -infinity
        int smallest = Integer.MAX_VALUE;           // to get +infinity

        for(int i=0; i<a.length; i++){
            if(largest<a[i]){                       // agar koi bhi element -infinity se bda h to uski value mil jyegi
                largest = a[i];
            }
            if(smallest>a[i]){                      // agar koi bhi element +infinity se chhota h to uski value mil jyegi
                smallest = a[i];
            }
            
        }
        System.out.println("smallest value is: " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int a[] ={1,2,3,6,5,4};
        System.out.println("largest value is: " + getlargest(a));
    }
    
}
