/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

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
}
