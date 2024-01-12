public class BinarySearchOptimized {

    public static void main(String[] args) {

        // What numbers are you looking for?
        int[] findNums = {18, 5, 7};

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

            int oneFourth = low + (high - low) / 4;
            int twoFourths = low + 2 * (high - low) / 4;
            int threeFourths = low + 3 * (high - low) / 4;

            int oneFourthValue = myArray[oneFourth];
            int twoFourthsValue = myArray[twoFourths];
            int threeFourthsValue = myArray[threeFourths];

            System.out.println("\n\nAt the beginning of the while loop, oneFourthValue is: " + oneFourthValue);
            System.out.println("At the beginning of the while loop, twoFourthsValue is: " + twoFourthsValue);
            System.out.println("At the beginning of the while loop, threeFourthsValue is: " + threeFourthsValue);

            // If numbers found, print the results and exit
            if (contains(findNums, oneFourthValue)) {
                System.out.println("Number found at oneFourth: " + oneFourthValue);
                break;
            } else if (contains(findNums, twoFourthsValue)) {
                System.out.println("Number found at twoFourths: " + twoFourthsValue);
                break;
            } else if (contains(findNums, threeFourthsValue)) {
                System.out.println("Number found at threeFourths: " + threeFourthsValue);
                break;
            }

            System.out.println("None of the numbers found!... Adjusting search range... \n");

            // If the numbers are less than oneFourthValue, adjust the high end of the search range
            if (findNums[0] < oneFourthValue) {
                high = oneFourth - 1;
            }
            // If the numbers are between oneFourthValue and twoFourthsValue, adjust the range accordingly
            else if (findNums[0] < twoFourthsValue) {
                low = oneFourth + 1;
                high = twoFourths - 1;
            }
            // If the numbers are between twoFourthsValue and threeFourthsValue, adjust the range accordingly
            else if (findNums[0] < threeFourthsValue) {
                low = twoFourths + 1;
                high = threeFourths - 1;
            }
            // If the numbers are greater than threeFourthsValue, adjust the low end of the search range
            else {
                low = threeFourths + 1;
            }
        }
    }

    private static boolean contains(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
