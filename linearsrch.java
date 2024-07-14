public class linearsrch {
    public static int linearsearch(int a[], int key){
        for(int i=0; i<a.length; i++){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {2,4,6,8,10,12,14,16};
        int key = 15;

        int index = linearsearch(a, key);

        if(index == -1){
            System.out.println("element not found.");
        }else{
            System.out.println("element found at index = " + index);
        }
         
}
}