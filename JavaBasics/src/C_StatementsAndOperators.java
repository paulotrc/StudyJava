/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Class to demonstrate the about Variables and Types in Java
 */
public class C_StatementsAndOperators {
    /**
     * Create a main method that's static and no return to execute a code using or not the parameters.
     * @param args The params that's possible to use on a Java Execution Program by command-line
     *             For example: java -jar class and "some arguments"
     */
    public static void main(String[] args) {

        //Conditionals
        //If | if else

        int number = 2;
        boolean test = number == 2;

        if(test){
            System.out.println("It's true.");
        }

        if(!test){
            System.out.println("It's true.");
        }else{
            System.out.println("It's false.");
        }

        //And Ternary Operator
        String toPrint = test ? "It's true." : "It's false.";
        System.out.println(toPrint);

        int pickOne = 10;
        int pickTwo = 20;
        int pickThree = 8;
        boolean resultEq;

        resultEq = pickOne < pickTwo; // pickOne smaller than pick two?
        System.out.println("1 "+resultEq);

        resultEq = pickOne > pickTwo;// pickOne bigger than pick two?
        System.out.println("2 " +resultEq);

        resultEq = pickOne <= 4; // pickOne smaller or equal than pick two?
        System.out.println("3 " +resultEq);

        resultEq = pickTwo >= 6; // pickOne bigger or equal than pick two?
        System.out.println("4 " +resultEq);

        resultEq = pickOne == pickTwo; // pickOne equal to pick two?
        System.out.println("5 " +resultEq);

        resultEq = pickOne != pickTwo; // pickOne not equal to pick two?
        System.out.println("6 " +resultEq);

        resultEq = pickOne > pickTwo || pickOne < pickTwo; // pickOne bigger than pick two Logical or pickOne smaller than pick two ?
        System.out.println("7 " +resultEq);

        resultEq = 3 < pickOne && pickOne < 6; // three bigger than pickOne Logical and pickOne smaller than six ?
        System.out.println("8 " +resultEq);

        resultEq = !resultEq; // Logical not or negative result
        System.out.println("9 " +resultEq);

        resultEq = pickOne > pickTwo || pickOne < pickThree || pickThree > pickTwo || pickOne < pickThree;
        System.out.println("10 " +resultEq);

        resultEq = pickThree < pickOne && pickThree < pickTwo;
        System.out.println("11 " +resultEq);



    }
}
