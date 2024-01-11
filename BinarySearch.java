public class BinarySearch {




    public static void main(String[] args) {



        //What Number you looking for?
        int FindNum = 16;
        // Create an array with a size of 52 like a deck of cards
        int[] myArray = new int[52];



        // Populate the array with numbers from 1 to 52
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }

        // Print the array
        System.out.print("Array elements: ");
        for (int i = 0; i < myArray.length; i++) {
           System.out.print(myArray[i] + " ");
        }



        //Assign "Num" to the number of elements in the array.
        int NumOfArrayElements = myArray.length;
        int HalfOfNumOfArrayElements = 52;

        //Assign CurrentNumber to Number being halfed over and over
        int CurrentNumber = NumOfArrayElements;

        //New line
        System.out.println("\n ");

        int kill = 0;
        //Do the searching
        while (CurrentNumber != FindNum) {

            System.out.println(CurrentNumber);
            kill +=1;

            System.out.println("Not Found!... Halfing array... \n \n ");
            int PreviousMax = HalfOfNumOfArrayElements;
            HalfOfNumOfArrayElements /= 2;


            //IF NUMBER I'M LOOKING FOR IS LESS THAN CURRENT NUMBER
            if (CurrentNumber > FindNum) {

                int[] NewArray = new int[HalfOfNumOfArrayElements];

                for (int i = 0; i < (HalfOfNumOfArrayElements) - 1; i++) {
                    myArray[i] = i + 1;
                }
                // Print the array
                System.out.print("Array elements: ");
                for (int i = 0; i < NewArray.length; i++) {
                    System.out.print(myArray[i] + " ");
                }
                CurrentNumber = NewArray.length;
            }

            System.out.println(CurrentNumber);


            if (CurrentNumber < FindNum) {

                int[] NewArray = new int[PreviousMax];

                for (int i = CurrentNumber; i < (PreviousMax) - 1; i++) {
                    NewArray[i] = i + 1;
                }
                // Print the array
                System.out.print("Array elements: ");
                for (int i = 0; i < NewArray.length; i++) {
                    System.out.print(myArray[i] + " ");
                }
                CurrentNumber = NewArray.length;
            }
        if (kill == 6) {
            System.exit(0);
        }
        }
        System.out.print("Searching stopped because Current Number is " + CurrentNumber + " and Number Trying to be found is also " + FindNum +" :-)");
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