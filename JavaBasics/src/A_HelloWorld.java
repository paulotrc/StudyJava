
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Class to demonstrate the first step to learn Java
 */
public class A_HelloWorld {

    /**
     * Create a main method that's static and no return to execute a code using or not the parameters.
     * @param args The params that's possible to use on a Java Execution Program by command-line
     *             For example: java -jar class and "some arguments"
     */
    public static void main(String[] args) {

        //Just use of print without break line;
        System.out.print("Hello World");

        //Just breaking a line on console
        System.out.println();

        //Using String format, some ordinary specifiers are String (%s), Decimal (%d), Floating (%f) and Boolean (%b)
        System.out.printf("There is a Hello in this %s", "World");
        System.out.println();

        System.out.printf("There is a %d chars in Hello World", 11);
        System.out.println();

        System.out.printf("There is no poiting float number like %f to define how many chars are in Hello World", 2.5f);
        System.out.println();

        System.out.printf("There is a doubt about this is %b or %b in a simple Hello World", true, false);
        System.out.println();

        //Just use of print with break line;
        System.out.println("Hello World!");


    }

}
