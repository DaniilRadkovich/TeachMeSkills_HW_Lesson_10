package com.teachmeskills.lesson_10.task_2;


public class Passwords {

    public static void logIn(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() > 20) {
            throw new WrongLoginException("Wrong login length!");
        }
        if (login.contains(" ")) {
            throw new WrongLoginException("Wrong login!");
        }

        if (password.length() > 20 || password.contains(" ")) {
            throw new WrongPasswordException("Wrong password!");
        }

        char ch;
        boolean isNumberHere = false;

        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                isNumberHere = true;
            }
        }
        if (!isNumberHere) {
            throw new WrongPasswordException("No numbers in password!");
        }

        if (password.equals(confirmPassword)){
            System.out.println("You are logged in!");
        } else {
            throw new WrongPasswordException("Passwords are not equal!");
        }
    }
}
