/*
Overloading a method with variable length arguments.
 */

public class OverloadingVarLengthArgs {
    static void firstVersionMethod(int... v) {
        System.out.println("firstVersionMethod (int ... v): " +
                "Numbers of arguments: " + v.length);
        System.out.println("Contents: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" argument " + i + ": " + v[i]);
        System.out.println();
    }

    static void secondVersionMethod(boolean... v) {
        System.out.println("secondVersionMethod (boolean ... v): " +
                "Numbers of arguments: " + v.length);
        System.out.println("Contents: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" argument " + i + ": " + v[i]);
        System.out.println();
    }

    static void thirdVersionMethod(String message, int... v) {
        System.out.println("firstVersionMethod (String message, int ... v): \n" +
                message + v.length);
        System.out.println("Contents: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" argument " + i + ": " + v[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        firstVersionMethod(1, 2, 3);
        thirdVersionMethod("Testing: ", 10, 20);
        secondVersionMethod(true, false, false);
    }
}
