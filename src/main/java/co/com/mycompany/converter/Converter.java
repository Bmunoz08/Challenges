/**
 * The line `package co.com.mycompany.converter;` is declaring the package name for the current Java
 * file. It is specifying that the current file belongs to the `co.com.mycompany.converter` package.
 * This helps organize and categorize the code into different packages, making it easier to manage and
 * locate files within a project.
 */
package co.com.mycompany.converter;

/**
 * The `import` statements in Java are used to bring in classes or packages from
 * other packages or libraries into the current file.
 */
import co.com.mycompany.classs.Menu;
import javax.swing.JOptionPane;

/**
 * Main
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The Converter class is the main class that executes the program and displays
 * an error message if an exception occurs.
 */
public class Converter {

    /**
     * The code `public Converter(){}` is defining a constructor for the
     * `Converter` class. A constructor is a special method that is called when
     * an object of a class is created.
     */
    public Converter() {

    }

    /**
     * The main function creates an instance of the Menu class and calls its
     * convertidores method, while handling any exceptions that may occur.
     *
     * @param args The args parameter is a value defined by Java, it represents
     * the arguments of the main.
     */
    public static void main(String[] args) {

        /**
         * The code is creating a try-catch block in Java.
         */
        try {
            /**
             * The code `Menu m = new Menu();` creates a new instance of the
             * `Menu` class and assigns it to the variable `m`.
             */
            Menu m = new Menu();
            m.convertidores();
        } /**
         * The `catch (Exception e)` block is used to catch any exceptions that
         * may occur during the execution of the code within the `try` block.
         */
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sitema " + e);
        }

    }
}
