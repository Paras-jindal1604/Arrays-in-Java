public class maxsubarraysum {                                       // BRUTE FORCE METHOD
    public static void maxSubarraySum(int a[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                currSum = 0;
                for(int k=i;k<=j;k++){
                    currSum += a[k];
                }
                
                if(maxSum<currSum){
                    maxSum = currSum;
                }
                System.out.println(currSum);
            }
        }
        System.out.println("max sum: "+ maxSum);
    }
    public static void main(String[] args) {
        int a[]= {2,4,6,8,10};
        maxSubarraySum(a);
    }
    
}
