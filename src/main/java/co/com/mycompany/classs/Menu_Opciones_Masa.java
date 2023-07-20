/**
 * The line `package co.com.mycompany.classs;` is declaring the package name for the current Java file.
 * It specifies the directory structure in which the file is located. In this case, the file is located
 * in the `classs` package within the `co.com.mycompany` package. Packages are used to organize and
 * group related classes and provide a way to avoid naming conflicts.
 */
package co.com.mycompany.classs;

/**
 * The `import` statements are used to import classes from other packages into
 * the current Java file.
 */
import co.com.mycompany.methods.Solicitud_Masa;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Menu Opciones de Masa
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The class "Menu_Opciones_Masa" provides a menu for converting between
 * different units of mass.
 */
public class Menu_Opciones_Masa {

    /**
     * The code `public Menu_Opciones_Masa(){}` is a constructor for the class `Menu_Opciones_Masa`. A
     * constructor is a special method that is called when an object of a class is created.
    */
    public Menu_Opciones_Masa(){

    }

    /**
     * In the given code, `Solicitud_Masa masa = new Solicitud_Masa();` and
     * `Continuar continuar = new Continuar();` are creating instances of the
     * classes `Solicitud_Masa` and `Continuar` respectively.
     */
    Solicitud_Masa masa = new Solicitud_Masa();
    Continuar continuar = new Continuar();

    /**
     * The `public void menu_convertidor_masa()` method is defining a menu for converting between
     * different units of mass. It displays a dialog box with a list of options for the user to select.
     * Based on the user's selection, it performs the corresponding conversion using the
     * `Solicitud_Masa` class and then prompts the user to continue or exit the program using the
     * `Continuar` class.
    */
    public void menu_convertidor_masa() {

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
             * The code `Object menu_masa = JOptionPane.showInputDialog(...)` is
             * displaying a dialog box with a list of options for the user to
             * select. The selected option is stored in the variable `menu_masa`
             * as an `Object` type.
             */
            Object menu_masa = JOptionPane.showInputDialog(
                    null,
                    "Seleccione la opción deseada.",
                    "CONVERTIDOR",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{
                        "Seleccione una opción",
                        "De Kilogramo a Tonelada",
                        "De Kilogramo a Gramo",
                        "De Kilogramo a Libra",
                        "De Tonelada a Kilogramo",
                        "De Gramo a Kilogramo",
                        "De Libra a Kilogramo"
                    },
                    "opcion 1");

            /**
             * The code block `if (menu_masa == null) {
             * JOptionPane.showMessageDialog(null, "Programa Finalizado");
             * System.exit(0); }` is checking if the user has clicked the cancel
             * button or closed the dialog without selecting any option from the
             * menu. If the condition is true, it displays a message "Programa
             * Finalizado" (Program Finished) using a JOptionPane dialog and
             * then exits the program by calling `System.exit(0)`, which
             * terminates the Java Virtual Machine.
             */
            if (menu_masa == null) {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                System.exit(0);
            }

            /**
             * The line `String opc = (String) menu_masa;` is casting the
             * selected option from the menu, which is stored as an `Object`
             * type, to a `String` type. This allows the selected option to be
             * used in the switch statement to determine the appropriate action
             * to take based on the user's selection.
             */
            String opc = (String) menu_masa;

            /**
             * The `switch` statement is used to perform different actions based
             * on the value of the variable `opc`. It evaluates the value of
             * `opc` and executes the corresponding case block that matches the
             * value.
             */
            switch (opc) {
                case "Seleccione una opción" -> {
                    JOptionPane.showMessageDialog(
                            null,
                            "Por favor escoge una opción valida.");
                    menu_convertidor_masa();
                }
                case "De Kilogramo a Tonelada" -> {
                    masa.solicitud_masa_d(1000, "Toneladas");
                    continuar.continuar_con();
                }
                case "De Kilogramo a Gramo" -> {
                    masa.solicitud_masa_m(1000, "Gramos");
                    continuar.continuar_con();
                }
                case "De Kilogramo a Libra" -> {
                    masa.solicitud_masa_m(2.205, "Libras");
                    continuar.continuar_con();
                }
                case "De Tonelada a Kilogramo" -> {
                    masa.solicitud_masa_m(1000, "Kilogramos");
                    continuar.continuar_con();
                }
                case "De Gramo a Kilogramo" -> {
                    masa.solicitud_masa_d(1000, "Kilogramos");
                    continuar.continuar_con();
                }
                case "De Libra a Kilogramo" -> {
                    masa.solicitud_masa_d(2.205, "Kilogramos");
                    continuar.continuar_con();
                }
                /**
                 * The line `default -> throw new AssertionError();` is the
                 * default case in the switch statement. It is executed when
                 * none of the previous cases match the value of `opc`.
                 */
                default ->
                    throw new AssertionError();
            }

        } /**
         * The `catch (HeadlessException e)` block is used to handle any
         * `HeadlessException` that may occur during the execution of the code
         * within the `try` block.
         */
        catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }

    }

}
