
public class binarysrch {
    public static int binarysearch(int a[],int key){
        int start = 0, end = a.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            // comparisons
            if(a[mid] == key){
                return mid;
            }
            if(a[mid]>key){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {2,4,6,8,10,12,14};
        int key = 100;

        System.out.println(" element found at index: " + binarysearch(a, key));
    }
    
}
