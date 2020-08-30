/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;

public class FrontDesk {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("Name of the Book:" + book.getNameOfTheBook());
        System.out.println("Name of the Author of the Book:" + book.getAuthorOfTheBook());
        System.out.println("ISBN Number of the Book:" + book.getThirteenDigitIsbnNumberOfTheBook());
        book.setNameOfTheBook("Pride and Prejudice");
        book.setAuthorOfTheBook("Jane Austen");
        book.setThirteenDigitIsbnNumberOfTheBook("0123456789123");
    }
}
