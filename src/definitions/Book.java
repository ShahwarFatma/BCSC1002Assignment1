/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String nameOfTheBook;
    private String authorOfTheBook;
    private String thirteenDigitIsbnNumberOfTheBook;

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public String getAuthorOfTheBook() {
        return authorOfTheBook;
    }

    public String getThirteenDigitIsbnNumberOfTheBook() {
        return thirteenDigitIsbnNumberOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public void setAuthorOfTheBook(String authorOfTheBook) {
        this.authorOfTheBook = authorOfTheBook;
    }

    public void setThirteenDigitIsbnNumberOfTheBook(String thirteenDigitIsbnNumberOfTheBook) {
        this.thirteenDigitIsbnNumberOfTheBook = thirteenDigitIsbnNumberOfTheBook;
    }

    public Book() {
        this.nameOfTheBook = "Great Expectations";
        this.authorOfTheBook = "Charles Dickens";
        this.thirteenDigitIsbnNumberOfTheBook = "9876543210765";
    }

    @Override
    public String toString() {
        return "Name Of The Book:" + getNameOfTheBook() + "Author Of The Book:" + getAuthorOfTheBook() + "Thirteen Digit ISBN Number Of The Book:" + getThirteenDigitIsbnNumberOfTheBook();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getNameOfTheBook().equals(book.getNameOfTheBook()) &&
                getAuthorOfTheBook().equals(book.getAuthorOfTheBook()) &&
                getThirteenDigitIsbnNumberOfTheBook().equals(book.getThirteenDigitIsbnNumberOfTheBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfTheBook(), getAuthorOfTheBook(), getThirteenDigitIsbnNumberOfTheBook());
    }
}
