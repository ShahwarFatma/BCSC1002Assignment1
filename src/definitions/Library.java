/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] booksCurrentlyAvailable;

    public Library(Book[] booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }

    public Book[] getBooksCurrentlyAvailable() {
        return booksCurrentlyAvailable;
    }

    public void setBooksCurrentlyAvailable(Book[] booksThatAreCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    @Override
    public String toString() {
        return "Books Currently Available:" + Arrays.toString(booksCurrentlyAvailable);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksCurrentlyAvailable(), library.getBooksCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksCurrentlyAvailable());
    }
}
