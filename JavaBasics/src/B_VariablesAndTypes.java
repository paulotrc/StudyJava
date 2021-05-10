/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Class to demonstrate the about Variables and Types in Java
 */
public class B_VariablesAndTypes {

    /**
     * Create a main method that's static and no return to execute a code using or not the parameters.
     * @param args The params that's possible to use on a Java Execution Program by command-line
     *             For example: java -jar class and "some arguments"
     */
    public static void main(String[] args) {

        //Primitive valiables

        byte oneByte = 0;
        short oneShort = 01;
        int oneInt = 1234;
        long oneLong = 0L;
        float oneFloat = 0F;
        double oneDouble = 1.5;
        char oneChar = '0';
        boolean oneBoolean = true;

        System.out.println(oneByte);
        System.out.println(oneShort);
        System.out.println(oneInt);
        System.out.println(oneLong);
        System.out.println(oneFloat);
        System.out.println(oneDouble);
        System.out.println(oneChar);
        System.out.println(oneBoolean);


        //Object variables
        Byte otherOneByte = 0;
        Short otherOneShort = 01;
        Integer otherOneInt = 1234;
        Long otherOneLong = 0L;
        Float otherOneFloat = 0F;
        Double otherOneDouble = 1.5;
        Character otherOneChar = '0';
        Boolean otherOneBoolean = true;
        String oneString = "Test";

        System.out.println(otherOneByte);
        System.out.println(otherOneShort);
        System.out.println(otherOneInt);
        System.out.println(otherOneLong);
        System.out.println(otherOneFloat);
        System.out.println(otherOneDouble);
        System.out.println(otherOneChar);
        System.out.println(otherOneBoolean);
        System.out.println(oneString);

    }

}
