public class BinarySearch {
    public static void main(String[] args) {

        //What Number you looking for?
        int FindNum = 13;
        // Create an array with a size of 52 like a deck of cards
        int[] myArray = new int[52];

        // Populate the array with numbers from 1 to 52
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }

        // Print the array
        System.out.print("Array elements: ");
        for (int i = 0; i < myArray.length; i++) {
            // System.out.print(myArray[i] + " ");
        }
        int Num = myArray.length;

        int HalfOfArray = myArray[(Num/2)-1];

        System.out.println(myArray[(Num/2)-1]);


        System.out.println("\n ");

        while (HalfOfArray != FindNum) {

            System.out.println("Not Found!");

            if (HalfOfArray > FindNum) {

                for (int i = 0; i < (myArray.length / 2) - 1; i++) {
                    myArray[i] = i + 1;
                }

            }
            // Print the array
            System.out.print("Array elements: ");
            for (int i = 0; i < (myArray.length / 2) - 1; i++) {
                System.out.print(myArray[i] + " ");
            }
        }

    }


}





//BINARY-SEARCH(A, n, T)
//        1 L = 0
//        2 R = n − 1
//        3 while L ≤ R
//        4 m = b(L + R)/2c
//        5 if A[m] < T
//6 L = m + 1
//        7 elseif A[m] > T
//        8 R = m − 1
//        9 else
//        10 return m
//        11 return −1 // invalid, not found