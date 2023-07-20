/**
 * The line `package co.com.mycompany.classs;` is declaring the package name for the current Java file.
 * It specifies the directory structure in which the file is located. In this case, the file is located
 * in the `classs` package under the `co.com.mycompany` package. Packages are used to organize and
 * group related classes and provide a namespace to avoid naming conflicts.
 */
package co.com.mycompany.classs;

/**
 * The `import` statements are used to import classes from other packages into
 * the current Java file.
 */
import co.com.mycompany.methods.Solicitud_Longitudes;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Menu Opciones de Longitudes
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The `Menu_Opciones_Longitudes` class provides a menu for converting lengths
 * between different units.
 */
public class Menu_Opciones_Longitudes {

   /**
    * The code `public Menu_Opciones_Longitudes(){}` is a constructor for the
    * `Menu_Opciones_Longitudes` class. A constructor is a special method that is called when an object
    * of a class is created.
    */
    public Menu_Opciones_Longitudes(){

    }

    /**
     * In the given code, `Solicitud_Longitudes longitudes = new
     * Solicitud_Longitudes();` and `Continuar continuar = new Continuar();` are
     * creating instances of the classes `Solicitud_Longitudes` and `Continuar`
     * respectively.
     */
    Solicitud_Longitudes longitudes = new Solicitud_Longitudes();
    Continuar continuar = new Continuar();

    /**
     * The `public void menu_convertidor_longitudes()` method is defining a menu for converting lengths
     * between different units. It displays a dialog box with a dropdown menu containing a list of
     * options for converting lengths. The user can select one of the options from the dropdown menu.
     * Based on the selected option, the method calls different methods from the `Solicitud_Longitudes`
     * class to perform the length conversion. After the conversion is done, it calls the
     * `continuar_con()` method from the `Continuar` class to ask the user if they want to continue
     * with another conversion.
    */
    public void menu_convertidor_longitudes() {

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
             * The code `Object menu_longitudes =
             * JOptionPane.showInputDialog(...)` displays a dialog box with a
             * dropdown menu containing a list of options. The user can select
             * one of the options from the dropdown menu. The selected option is
             * then stored in the variable `menu_longitudes` as an `Object`
             * type.
             */
            Object menu_longitudes = JOptionPane.showInputDialog(
                    null,
                    "Seleccione la opción deseada.",
                    "CONVERTIDOR",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{
                        "Seleccione una opción",
                        "De Metros a Centimetros",
                        "De Metros a Kilometros",
                        "De Metros a Milimetros",
                        "De Centimetros a Metros",
                        "De Kilometros a Metros",
                        "De Milimetros a Metros"
                    },
                    "opcion 1");

            /**
             * The code `if (menu_longitudes == null)` checks if the user has
             * clicked the cancel button or closed the dialog box without
             * selecting any option. If this condition is true, it means that
             * the user wants to exit the program. In that case, the code
             * displays a message "Programa Finalizado" (Program Finished) using
             * `JOptionPane.showMessageDialog()` and then terminates the program
             * using `System.exit(0)`.
             */
            if (menu_longitudes == null) {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                System.exit(0);
            }

            /**
             * The line `String opc = (String) menu_longitudes;` is casting the
             * selected option from the dropdown menu to a `String` type and
             * storing it in the variable `opc`. This allows the program to
             * compare the selected option with different cases in the switch
             * statement.
             */
            String opc = (String) menu_longitudes;

            /**
             * The `switch` statement is used to perform different actions based
             * on the value of the variable `opc`. In this case, the value of
             * `opc` is compared with different cases, and the corresponding
             * code block is executed if a match is found.
             */
            switch (opc) {
                case "Seleccione una opción" -> {
                    JOptionPane.showMessageDialog(
                            null,
                            "Por favor escoge una opción valida.");
                    menu_convertidor_longitudes();
                }
                case "De Metros a Centimetros" -> {
                    longitudes.solicitud_longitudes_m(100, "centimetros");
                    continuar.continuar_con();
                }
                case "De Metros a Kilometros" -> {
                    longitudes.solicitud_longitudes_d(1000, "kilometros");
                    continuar.continuar_con();
                }
                case "De Metros a Milimetros" -> {
                    longitudes.solicitud_longitudes_m(1000, "milimetros");
                    continuar.continuar_con();
                }
                case "De Centimetros a Metros" -> {
                    longitudes.solicitud_longitudes_d(100, "metros");
                    continuar.continuar_con();
                }
                case "De Kilometros a Metros" -> {
                    longitudes.solicitud_longitudes_m(1000, "metros");
                    continuar.continuar_con();
                }
                case "De Milimetros a Metros" -> {
                    longitudes.solicitud_longitudes_d(1000, "metros");
                    continuar.continuar_con();
                }
                /**
                 * The `default -> throw new AssertionError();` code block is
                 * the default case in the switch statement. It is executed when
                 * none of the previous cases match the value of `opc`.
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
