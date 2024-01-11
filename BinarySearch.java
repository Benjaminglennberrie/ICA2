

public class BinarySearch {

    public static void main(String[] args) {

        // What number are you looking for?
        int FindNum = 51;

        // Create an array with a size of 52 like a deck of cards
        int[] myArray = new int[52];

        // Populate the array with numbers from 1 to 52
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }

        // Print the array
        System.out.print("\nArray elements: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        // Initialize the search range
        int low = 0;
        int high = myArray.length - 1;

        // Do the searching
        while (low <= high) {

            int mid = (low + high) / 2;
            int midValue = myArray[mid];

            System.out.println("\n\nAt the beginning of the while loop, midValue is: " + midValue);

            // If number found, print the result and exit
            if (midValue == FindNum) {
                System.out.println("Number found: " + FindNum);
                break;
            }

            System.out.println("That isn't the number!... Adjusting search range... \n");

            // If the number is less than midValue, adjust the high end of the search range
            if (FindNum < midValue) {
                high = mid - 1;
            }

            // If the number is greater than midValue, adjust the low end of the search range
            if (FindNum > midValue) {
                low = mid + 1;
            }

        }
    }
}
