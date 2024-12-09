/*
Using a variable length argument with standard arguments
 */
public class VarLengthArgsWithParameters {
    /*
    In this method, message is a normal parameter,
    and v is a variable length parameter.
     */
    static void varLengthArgTest(String message, int... v) {
        System.out.println(message + v.length);
        System.out.println("Contents: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" argument " + ": " + v[i]);
        System.out.println();
    }

    public static void main(String[] args) {
varLengthArgTest("One argument in a variable length parameter: " ,10);
varLengthArgTest("Three arguments in a variable length parameter: ", 1,2,3);
varLengthArgTest("Without arguments in a variable length parameter: ");
    }
}
