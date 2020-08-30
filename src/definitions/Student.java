/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String nameOfTheStudent;
    private long universityRollNumberOfTheStudent;
    private int numberOfBooksIssuedByTheStudent;
    private Book[] namesOfTheBooksIssuedByTheStudent;

    public String getNameOfTheStudent() {
        return nameOfTheStudent;
    }

    public long getUniversityRollNumberOfTheStudent() {
        return universityRollNumberOfTheStudent;
    }

    public int getNumberOfBooksIssuedByTheStudent() {
        return numberOfBooksIssuedByTheStudent;
    }

    public Book[] getNamesOfTheBooksIssuedByTheStudent() {
        return namesOfTheBooksIssuedByTheStudent;
    }
}
