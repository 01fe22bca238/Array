/**
 * The Array class finds the biggest number in a given array of integers.
 */
/**
 * The Array class is a placeholder for the actual implementation of an array.
 */
class Array{
    // The `public static void main(String[] args)` method is the entry point of a Java program. It is
    // the method that is executed when the program is run. It takes an array of strings as input
    // arguments, which can be used to pass command-line arguments to the program. In this specific
    // code, the `main` method is used to find the biggest number in the given array.
    public static void main(String[] args){
        // The code `int number,Biggest_no,size=10;` declares three integer variables `number`,
        // `Biggest_no`, and `size`, and initializes `size` to 10.
        int number,Biggest_no,size=10;
        int[] Array={10,20,30,40,78,98,14,100,25,15};
        Biggest_no = Array[0];
       // The code `for (number=1;number<size;number++)` is a for loop that iterates over the elements
       // of the array.
        for (number=1;number<size;number++) {
            if (Array[number] > Biggest_no) {
                Biggest_no = Array[number];
            }
        }
         // The line `System.out.println("Biggest Number in Given Array:" + Biggest_no);` is printing
         // the message "Biggest Number in Given Array:" followed by the value of the variable
         // `Biggest_no`. It is used to display the biggest number found in the given array to the
         // console.
            System.out.println("Biggest Number in Given Array:" + Biggest_no);

    }
}






 