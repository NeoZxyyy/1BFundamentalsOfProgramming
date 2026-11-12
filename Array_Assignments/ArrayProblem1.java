import java.util.Arrays; // Array Utility para ma access ung array class

public class ArrayProblem1 {
    public static void main(String[] args) { // Entry point ng JVM


        //  Values ng Variable/Array seats
        String [][]seats ={ {"Alice","Bob","Charlie"},{"David","Emma","Frank"}
        };

        /*

        i output neto si Frank
        i  re recall nung first '[]' ung row then ung next '[]' naman para sa column
        kaya [1][2] dahil nasa pangalawang row at third column nakalagay si frank.
        btw  starting from 0 ang bilang ng rows/columns

        */
        System.out.println(seats[1][2]);



        // re replace natin ang value ng nasa [0][1] from Bob to Vacant
        seats[0][1]  = "Vacant";

        // Array.deepToString para ma output lahat ng nasa array
        System.out.println(Arrays.deepToString(seats));

    }
}
