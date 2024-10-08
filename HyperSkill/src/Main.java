import java.util.*;

public class Main {
    // Method to read input from user and separate the integers
    public static void processInputAndCallFunctions() {
        Scanner scn = new Scanner(System.in);
        String inputString = scn.nextLine();
        String[] strArr = inputString.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int result = 0;
        if (intArr.length == 2) {
            result = calculate(intArr[0], intArr[1]);
            System.out.println(result);
        } else if (intArr.length == 3) {
            result = calculate(intArr[0], intArr[1], intArr[2]);
            System.out.println(result);
        }else{
            System.out.println("invalid input");
        }

    }
    public static int calculate(int a, int b) {
        return a * b;
    }

    public static int calculate(int a, int b, int c) {
        return (a + b) * c;
    }

    public static void main(String[] args) {
        processInputAndCallFunctions();
    }
}