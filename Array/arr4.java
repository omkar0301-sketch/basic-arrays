import java.util.*;
public class arr4 {
   //function
   
   public static int GetLargest(int numbers[]){
    int largest = Integer.MIN_VALUE;

    for(int i=0;i<numbers.length; i++ ){
        if (largest<numbers[i]){
            largest = numbers[i];
        }
    }

    return largest;
   }
    
    public static void main(String args[]){
        int numbers[] = {4,5,6,7,8,134,990};

        System.out.println("largest value is :" + GetLargest(numbers));
    }
    
}
