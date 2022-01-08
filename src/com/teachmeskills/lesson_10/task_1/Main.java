package com.teachmeskills.lesson_10.task_1;

import static com.teachmeskills.lesson_10.task_1.Task1.*;

public class Main {
    public static void main(String[] args) {

        String test = "5554-ABC-5678-kek-1aa2b";
        System.out.println("Your document number: " + test);

        try {
            firstTask(test);
            secondTask(test);
            thirdTask(test);
        } catch (AbcException e) {
            System.out.println("No such sequence find! ABC or abc exception!");
        } catch (Triple5Exception e1) {
            System.out.println("No 555 find! 555 exception!");
        } catch (Ends1a2bException e2) {
            System.out.println("No 1a2b find! 1a2b exception!");
        }
    }
}
