/**
 * The line `package co.com.mycompany.classs;` is declaring the package name for the Java class. In
 * Java, packages are used to organize classes and prevent naming conflicts. The package name is
 * typically a hierarchical structure that starts with the company's domain name in reverse order,
 * followed by any sub-packages and the class name. In this case, the package name is
 * "co.com.mycompany.classs".
 */
package co.com.mycompany.classs;

/**
 * The lines `import java.awt.HeadlessException; import
 * javax.swing.JOptionPane;` are importing two classes from the Java AWT and
 * Swing libraries, respectively.
 */
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Menu Continuar
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The class "Continuar" contains the function "continuar_con" that displays a
 * dialog box asking the user if they want to continue exploring a converter
 * program, and based on their selection, either opens the converter menu,
 * displays a message that the program has finished, or displays an error
 * message.
 *
 */
public class Continuar {

    /**
     * The code `public Continuar(){ }` is a constructor for the `Continuar`
     * class.
     */
    public Continuar() {

    }

    /**
     * The code you provided is a method named `continuar_con()` inside the
     * `Continuar` class. Here is a breakdown of what the code does:
     */
    public void continuar_con() {

        /**
         * The `try {` block is used to enclose a section of code that may throw
         * an exception. It allows you to handle any exceptions that occur
         * within the block or propagate them to an outer `catch` block for
         * handling. In this specific code, the `try {` block is used to handle
         * any `HeadlessException` that may occur when displaying dialog boxes
         * using `JOptionPane`.
         */
        try {
            /**
             * The line `Menu menu = new Menu();` is creating a new instance of
             * the `Menu` class and assigning it to the variable `menu`. This
             * allows you to access the methods and properties of the `Menu`
             * class using the `menu` variable.
             */
            Menu menu = new Menu();
            /**
             * The code `int seleccion = JOptionPane.showOptionDialog(...)` is
             * displaying a dialog box with a question asking the user if they
             * want to continue exploring the converter program.
             */
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "¿Deseas continuar explorando nuestro convertidor?",
                    "Convertidor",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Sí", "No", "Cerrar"},
                    "Sí");

            /**
             * The code block you provided is a switch statement. It is used to
             * perform different actions based on the value of the variable
             * `seleccion`.
             */
            switch (seleccion) {
                case 0 ->
                    menu.convertidores();
                case 1 ->
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                case 2 ->
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                /**
                 * The line `default -> throw new AssertionError();` is part of
                 * a switch statement and is used as a fallback option.
                 */
                default ->
                    throw new AssertionError();
            }

        } /**
         * The `catch (HeadlessException e)` block is used to handle any
         * `HeadlessException` that may occur during the execution of the code
         * inside the `try` block.
         */
        catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }

    }

}
