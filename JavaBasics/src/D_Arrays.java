/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Class to demonstrate the about Arrays and your types in Java
 */
public class D_Arrays {

    /**
     * Create a main method that's static and no return to execute a code using or not the parameters.
     * @param args The params that's possible to use on a Java Execution Program by command-line
     *             For example: java -jar class and "some arguments"
     */
    public static void main(String[] args) {

        //Simple type of arrays

        //An Integer or int not initialized
        int[] arrint;

        //An Integer or int initialized with none content
        int[] arrintNone = {};

        //An Integer or int initialized with none content defining how size it will start
        int[] arrintContentDefiningSize = new int[10];

        //An Integer or int initialized with content coma separated or single
        int[] arrintContent = {8,6,1};
        int[] arrintContentSingle = {7};

        //String array
        String[] arrStr = {"String test"};

        //Char array
        char[] arrChar = {'A'};

        //Char array
        Object[] arrObj = {'A', 0, "Test", 3.5d, 3.14};

    }
}
