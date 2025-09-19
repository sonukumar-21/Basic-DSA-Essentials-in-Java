public class LargestNumber {
    public static int findLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; 
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {3, 5, 7, 2, 8, -1};
        int largest = findLargest(numbers);
        System.out.println("The largest number is: " + largest);
    }
}   