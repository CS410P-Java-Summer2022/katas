package edu.pdx.cs410J.Room2;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

    public static String compute(String str) {
        StringBuilder result = new StringBuilder();
        boolean divisible = false;

        int num = Integer.parseInt(str);

        if(num % 3 == 0) {
            result.append("Foo");
            divisible = true;
        }

        if(num % 5 == 0) {
            result.append("Bar");
            divisible = true;
        }

        if(num % 7 == 0) {
            result.append("Qix");
            divisible = true;
        }

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '3') {
                result.append("Foo");
            }
            else if(str.charAt(i) == '5') {
                result.append("Bar");
            }
            else if(str.charAt(i) == '7') {
                result.append("Qix");
            }
            else if(str.charAt(i) == '0') {
                result.append("*");
            }
            else if(!divisible) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        try {
            if(args.length < 1) {
                throw new IllegalArgumentException("Missing command line arguments");
            }

            System.out.println(compute(args[0]));
        } catch(Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
