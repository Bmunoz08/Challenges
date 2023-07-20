/**
 * The line `package co.com.mycompany.classs;` is declaring the package name for the Java class. In
 * Java, packages are used to organize classes and prevent naming conflicts. The package name is
 * typically a reversed domain name to ensure uniqueness. In this case, the package name is
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
 * Menu General
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The Menu class provides a menu interface for selecting different types of
 * converters (currency, length, mass, time, temperature) and redirects to the
 * corresponding converter classes.
 */
public class Menu {

    /**
     * The code `public Menu(){}` is a constructor for the `Menu` class. A constructor is a special
     * method that is called when an object of a class is created.
    */
    public Menu(){

    }

    /**
     * The `public void convertidores()` method is a public method that does not return any value
     * (`void`). It is responsible for displaying a menu interface for selecting different types of
     * converters (currency, length, mass, time, temperature) and redirecting to the corresponding
     * converter classes.
    */
    public void convertidores() {

        /**
         * The lines `Menu_Opciones_Moneda mom = new Menu_Opciones_Moneda();
         * Menu_Opciones_Longitudes mol = new Menu_Opciones_Longitudes();
         * Menu_Opciones_Masa masa = new Menu_Opciones_Masa();
         * Menu_Opciones_Tiempo mot = new Menu_Opciones_Tiempo();
         * Menu_Opciones_Temperatura temperatura = new
         * Menu_Opciones_Temperatura();` are creating instances of different
         * classes: `Menu_Opciones_Moneda`, `Menu_Opciones_Longitudes`,
         * `Menu_Opciones_Masa`, `Menu_Opciones_Tiempo`, and
         * `Menu_Opciones_Temperatura`.
         */
        Menu_Opciones_Moneda mom = new Menu_Opciones_Moneda();
        Menu_Opciones_Longitudes mol = new Menu_Opciones_Longitudes();
        Menu_Opciones_Masa masa = new Menu_Opciones_Masa();
        Menu_Opciones_Tiempo mot = new Menu_Opciones_Tiempo();
        Menu_Opciones_Temperatura temperatura = new Menu_Opciones_Temperatura();

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
             * The code `Object menu_principal =
             * JOptionPane.showInputDialog(...)` is displaying a dialog box with
             * a list of options for the user to select from. The selected
             * option is then stored in the `menu_principal` variable.
             */
            Object menu_principal = JOptionPane.showInputDialog(
                    null,
                    "Seleccione un convertidor:",
                    "CONVERTIDOR",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{
                        "Seleccione una opción",
                        "Convertidor de moneda",
                        "Convertidor de longitud",
                        "Convertidor de masa",
                        "Convertidor de tiempo",
                        "Convertidor de temperatura"
                    },
                    "opcion 1");

            /**
             * The code `if (menu_principal == null) {
             * JOptionPane.showMessageDialog(null, "Programa Finalizado");
             * System.exit(0); }` is checking if the `menu_principal` variable
             * is `null`. If it is `null`, it means that the user closed the
             * dialog box without selecting any option. In this case, a message
             * dialog is displayed with the message "Programa Finalizado"
             * (Program Finished) and the program is terminated using
             * `System.exit(0)`, which exits the Java Virtual Machine.
             */
            if (menu_principal == null) {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                System.exit(0);
            }

            /**
             * The line `String opc = (String) menu_principal;` is casting the
             * `menu_principal` variable to a `String` type. The
             * `menu_principal` variable is initially of type `Object` because
             * it stores the selected option from the dialog box. By casting it
             * to a `String`, it allows the program to compare the selected
             * option with different string values in the `switch` statement.
             */
            String opc = (String) menu_principal;

            /**
             * The `switch` statement is used to perform different actions based
             * on the value of the `opc` variable. It evaluates the value of
             * `opc` and executes the corresponding case block.
             */
            switch (opc) {
                case "Seleccione una opción" -> {
                    JOptionPane.showMessageDialog(
                            null,
                            "Por favor escoge una opcion valida"
                    );

                    convertidores();
                }
                case "Convertidor de moneda" -> {
                    mom.menu_convertidor_moneda();
                }
                case "Convertidor de longitud" -> {
                    mol.menu_convertidor_longitudes();
                }
                case "Convertidor de masa" -> {
                    masa.menu_convertidor_masa();
                }
                case "Convertidor de tiempo" -> {
                    mot.menu_opciones_tiempo();
                }
                case "Convertidor de temperatura" -> {
                    temperatura.menu_opciones_temperatura();
                }
                /**
                 * The line `default -> throw new AssertionError();` is the
                 * default case in the switch statement. It is executed when
                 * none of the previous cases match the value of the `opc`
                 * variable.
                 */
                default ->
                    throw new AssertionError();
            }
        } /**
         * The `catch (HeadlessException e) { ... }` block is used to handle any
         * `HeadlessException` that may occur when displaying dialog boxes using
         * `JOptionPane`.
         */
        catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }
    }

}
