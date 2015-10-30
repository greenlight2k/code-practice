import java.util.Arrays;

public class FizzBuzz {

    public static void main(String[] args) {
        String[] out = fizzBuzz(9, 16); // call FizzBuzz with values (9, 16)

        System.out.println(Arrays.toString(out)); // Output result
    }

    public static String[] fizzBuzz(int start, int end) {

        // Create the return array of size (end - start)
        String[] output = new String[end - start];

        // Array index counter
        int index = 0;

        // Variable for each item inside the array
        String item;

        // Loop initializes at (i = start), while (i < end)
        for (int i = start; i < end; i++) {

            // check if i is a multiple of 3 AND 5 -> item is "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) item = "FizzBuzz";

            // check if i is a multiple of 3 -> item is "Fizz"
            else if (i % 3 == 0) item = "Fizz";

            // check if i is a multiple of 5 -> item is "Buzz"
            else if (i % 5 == 0) item = "Buzz";

            // else -> item is the number (Converted to String)
            else item = String.valueOf(i);

            // add item to array and increase the index
            output[index++] = item;
        }

        // return the resulting array
        return output;
    }

}
