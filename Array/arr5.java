public class arr5  {

    public static int binarySearch(int numbers[] , int key){
        int start = 0 , end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end ) / 2;

            //comparison

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {4,8,9,10,15,19,20,34};
        int key = 9;

        System.out.println("index for the key is ;" + binarySearch(numbers , key));
    }
    
}
