public class traprwater {
    public static int trappingrainwater(int h[]){
        int n = h.length;

        // calculate left max boundary - in array form
        int leftMax[] = new int[n];
        leftMax[0] = h[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(h[i], leftMax[i-1]);
        }

        // calculate right max boundary - in array form
        int rightMax[] = new int[n];
        rightMax[n-1] = h[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(h[i], rightMax[i+1]);
        }

        int trappedwater = 0;
        // loop
        for(int i=0; i<n; i++){

            // waterLevel = min ( left max bound , right max bound )
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterLevel - h[i]
            trappedwater += waterLevel - h[i];
        }
        
       
        return trappedwater;
    }
    public static void main(String[] args) {
        int h[] = {4,2,0,6,3,2,5};
        System.out.println(trappingrainwater(h));

    }
    
}
