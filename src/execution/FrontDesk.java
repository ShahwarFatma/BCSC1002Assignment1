/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;

import java.util.Arrays;
import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("Name of the Book:" + book.getNameOfTheBook());
        System.out.println("Name of the Author of the Book:" + book.getAuthorOfTheBook());
        System.out.println("ISBN Number of the Book:" + book.getThirteenDigitIsbnNumberOfTheBook());
        book.setNameOfTheBook("Pride and Prejudice");
        book.setAuthorOfTheBook("Jane Austen");
        book.setThirteenDigitIsbnNumberOfTheBook("0123456789123");
        System.out.println(book.toString());
        Student student = new Student("Rahil Sinha", 87976543);
        System.out.println("Number of Books issued by the Student:" + student.getNumberOfBooksIssuedByTheStudent());
        System.out.println("Names of Books issued by the Student:" + Arrays.toString(student.getNamesOfTheBooksIssuedByTheStudent()));
        student.setNameOfTheStudent("Naaz Islam");
        student.setUniversityRollNumberOfTheStudent(19040031);
        student.setNumberOfBooksIssuedByTheStudent(1);
        System.out.println(student.toString());

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-=-=--=-=-Welcome To The Front Desk-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Please Enter your choice between 1 to 4: ");
            int studentChoice = scanner.nextInt();
            switch (studentChoice) {
                case 1: {
                    System.out.println("Please enter your name: ");
                    String nameOfTheStudent (scanner.nextLine());
                    System.out.println("Please enter your University roll number: ");
                    long universityRollNumberOfTheStudent (scanner.nextLong());
                    System.out.println("Which book do you want to issue?");
                    String nameOfTheBook (scanner.nextLine());
                    System.out.println("Thank you for Issuing the Book.");
                    break;
                }
                case 2:
                    System.out.println("Please enter the name of the book you want to return.");
                    String bookName (scanner.nextLine());
                    System.out.println("Thank you for Returning the Book.");
                    break;
                case 3:
                    System.out.println("Here are the books issued by you.");
                default:
                    System.out.println("Sorry! You have entered wrong choice");
                    break;
            }

            while (studentChoice != 4) ;
            scanner.close();
        }

    }
}
