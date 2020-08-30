/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Objects;

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

    public void setNameOfTheStudent(String nameOfTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
    }

    public void setUniversityRollNumberOfTheStudent(long universityRollNumberOfTheStudent) {
        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
    }

    public void setNumberOfBooksIssuedByTheStudent(int numberOfBooksIssuedByTheStudent) {
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
    }

    public Student(String nameOfTheStudent, long universityRollNumberOfTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
        this.numberOfBooksIssuedByTheStudent = 2;
    }

    @Override
    public String toString() {
        return "Name Of The Student:" + nameOfTheStudent + "University Roll Number Of The Student:" + universityRollNumberOfTheStudent +
                "Number Of Books Issued By The Student:" + numberOfBooksIssuedByTheStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getUniversityRollNumberOfTheStudent() == student.getUniversityRollNumberOfTheStudent() &&
                getNumberOfBooksIssuedByTheStudent() == student.getNumberOfBooksIssuedByTheStudent() &&
                getNameOfTheStudent().equals(student.getNameOfTheStudent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfTheStudent(), getUniversityRollNumberOfTheStudent(), getNumberOfBooksIssuedByTheStudent());
    }
}
