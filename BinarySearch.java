import java.util.*;
public class BinarySearch{
    public static int binarysearch(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int numbers[] = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }
            Arrays.sort(numbers);
            int key = sc.nextInt();
            System.out.println("The index of the key is: " + binarysearch(numbers, key));
        }
    }
}
