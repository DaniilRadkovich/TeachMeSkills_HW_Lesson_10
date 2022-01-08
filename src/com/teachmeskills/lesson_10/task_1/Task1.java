package com.teachmeskills.lesson_10.task_1;

public class Task1 {

    public static void firstTask(String test) throws AbcException {
        int num1 = test.indexOf("abc");
        int num2 = test.indexOf("ABC");
        if (num1 == -1 && num2 == -1) {
            throw new AbcException();
        } else {
            System.out.println("In this line there is such sequence!");
        }
    }

    public static void secondTask(String test) throws Triple5Exception {
        boolean bool = test.startsWith("555");
        if (bool) {
            System.out.println("This line starts with 555");
        } else {
            throw new Triple5Exception();
        }
    }

    public static void thirdTask(String test) throws Ends1a2bException {
        boolean bool = test.endsWith("1a2b");
        if (bool) {
            System.out.println("This line ends with 1a2b");
        } else {
            throw new Ends1a2bException();
        }
    }
}
