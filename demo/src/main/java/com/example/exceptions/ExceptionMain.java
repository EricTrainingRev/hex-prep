package com.example.exceptions;

/*
 * Checked Exceptions must be handled in your code, either directly in the code block where the
 * exception can happen, or by using the "throws" keyword to duck the exception which tells the
 * compiler you will handle the exception somewhere elese in your code (like where you call the
 * method you are ducking)
 * 
 * Unchecked Exceptions do not need to be handled in your code: these exceptions will still brick your
 * code if they are not handled, but the compiler does not force you to handle them.
 * 
 */

public class ExceptionMain {
    public static void main(String[] args) {
        throwingCheckedExceptionInTryCatch();
        try {
            throwingCheckedExceptionDuckingTheIssue();
        } catch (CustomCheckedException e) {
            System.out.println(e.getMessage());
        }
        breakEverything();

    }

    public static void throwingCheckedExceptionInTryCatch(){
        try {
            throw new CustomCheckedException("This must be handled");
        } catch (CustomCheckedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void throwingCheckedExceptionDuckingTheIssue() throws CustomCheckedException{
        throw new CustomCheckedException("This must be handled");
    }

    public static void breakEverything(){
        System.out.println(10/0);
    }

}
