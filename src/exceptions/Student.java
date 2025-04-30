package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Student {
    public void doSomething() {
        try {
            File file = new File("test.txt");
            FileReader fileReader = new FileReader(file);
            System.out.println("Printing from inside try");
        } catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }


        System.out.println("Printing file contents");
        System.out.println("Doing some more work");

    }

    public void doSomething2() {
        try {
            File file = new File("test.txt");
            FileReader fileReader = new FileReader(file);
            System.out.println("Printing from inside try");

            if(true) {
                throw new SQLException();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println("Some problem happened");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        System.out.println("Printing file contents");
        System.out.println("Doing some more work");

    }

    public void doSomething3() {
        // Good practice: Always catch specific exceptions
        try {
            File file = new File("test.txt");
            FileReader fileReader = new FileReader(file);
            System.out.println("Printing from inside try");

            if(true) {
                throw new SQLException();
            }
        } catch (Exception ex) { // Not a good practice
            System.out.println("Some problem happened");
        }


        System.out.println("Printing file contents");
        System.out.println("Doing some more work");

    }

    public int findAverage() {
        Student st = null;
        st.findAverage();

        return 0;
    }

    public void doSomething4() {
        FileReader fileReader;
        try {
//           File file = new File("test.txt");
//           fileReader = new FileReader(file);
            if(false) {
                throw new FileNotFoundException();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Something went wrong");
        } finally { // Will be called, no matter what
            System.out.println("Calling from finally");
        }

        // Add that line here
    }

    public void doSomething5()  {

        try {
            File file = new File("test.txt");
            FileReader fileReader = new FileReader(file);

            if(true) {
                throw new SQLException();
            }

        } catch(FileNotFoundException ex) {
            System.out.println("asdsa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Diff between final, finally and finalize
    // Diff between throw and throws
}
