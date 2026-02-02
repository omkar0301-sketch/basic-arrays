public class maxSA3 {
    public static void kadanes(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int crrSum = 0;

        for(int i =0; i<numbers.length; i++){
           crrSum = crrSum + numbers[i];
           if(crrSum<0){
            crrSum = 0;
           } 

           maxSum = Math.max(crrSum,maxSum);


        }
        System.out.println("our maximum subarray sum  is :" + maxSum);

    }
    public static void main (String args[]){
        int numbers[] = {-2,-3,4,-1,2,1,-5,-3};
        kadanes(numbers);

    }
}
    

