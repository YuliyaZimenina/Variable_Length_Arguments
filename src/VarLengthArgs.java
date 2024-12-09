/*
Demonstration of the use of a variable length
argument in a program.
 */

public class VarLengthArgs {
    // This method takes a variable length argument.
    static void varLengthArgTest(int ... v){
        System.out.println("Number of arguments: " + v.length);
        System.out.println("Contents: " );
        for (int i = 0; i < v.length; i++)
            System.out.println(" argument " + ": " + v[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        /*
        The method varLengthArgTest() can be called with
        a variable number of arguments.
         */
        varLengthArgTest(10); // with one argument
        varLengthArgTest(1, 2, 3); // with two arguments
        varLengthArgTest(); // without arguments
    }
}