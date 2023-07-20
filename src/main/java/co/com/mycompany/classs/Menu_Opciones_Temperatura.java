/**
 * The line `package co.com.mycompany.classs;` is declaring the package name for the current Java file.
 * It specifies that the file belongs to the `co.com.mycompany.classs` package. Packages are used to
 * organize related classes and provide a way to avoid naming conflicts between classes with the same
 * name in different packages.
 */
package co.com.mycompany.classs;

/**
 * The `import` statements are used to import classes from other packages into
 * the current Java file.
 */
import co.com.mycompany.methods.Solicitud_Temperatura;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Menu Opciones de Temperatura
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The `Menu_Opciones_Temperatura` class displays a menu of temperature
 * conversion options and performs the selected conversion based on user input.
 */
public class Menu_Opciones_Temperatura {

    /** 
     * The code `public Menu_Opciones_Temperatura(){ }` is a constructor for the
     * `Menu_Opciones_Temperatura` class.
    */
    public Menu_Opciones_Temperatura(){

    }

    /**
     * In the given code, `Solicitud_Temperatura st = new
     * Solicitud_Temperatura();` and `Continuar continuar = new Continuar();`
     * are creating instances of the classes `Solicitud_Temperatura` and
     * `Continuar` respectively.
     */
    Solicitud_Temperatura st = new Solicitud_Temperatura();
    Continuar continuar = new Continuar();

    /**
     * The `public void menu_opciones_temperatura()` method is defining a method called
     * `menu_opciones_temperatura` that has a `public` access modifier, does not return any value
     * (`void`), and does not take any parameters.
    */
    public void menu_opciones_temperatura(){

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
             * The code `Object menu_temperatura =
             * JOptionPane.showInputDialog(...)` is displaying a dialog box with
             * a list of options for temperature conversion. The user can select
             * one of the options from the list. The selected option is then
             * stored in the `menu_temperatura` variable of type `Object`.
             */
            Object menu_temperatura = JOptionPane.showInputDialog(
                    null,
                    "Seleccione la opción deseada.",
                    "CONVERTIDOR",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{
                        "Seleccione una opción",
                        "De Grado Celsius a Grado Fahrenheit",
                        "De Grado Celsius a Kelvin",
                        "De Grados Fahrenheit a Grados Celsius",
                        "De Grados Fahrenheit a Kelvin",
                        "De Kelvin a Grados Celsius",
                        "De Kelvin a Grados Fahrenheit"
                    },
                    "opcion 1");

            /**
             * The code `if (menu_temperatura == null) {
             * JOptionPane.showMessageDialog(null, "Programa Finalizado");
             * System.exit(0); }` is checking if the `menu_temperatura` variable
             * is null. If it is null, it means that the user has closed the
             * dialog box without selecting any option. In this case, a message
             * dialog is displayed with the message "Programa Finalizado"
             * (Program Finished) and the program is terminated using
             * `System.exit(0)`, which exits the Java Virtual Machine and
             * terminates the program execution.
             */
            if (menu_temperatura == null) {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                System.exit(0);
            }

            /**
             * The line `String opc = (String) menu_temperatura;` is casting the
             * `menu_temperatura` variable to a `String` type.
             */
            String opc = (String) menu_temperatura;

            /**
             * The `switch` statement is used to perform different actions based
             * on the value of the `opc` variable. It evaluates the value of
             * `opc` and executes the corresponding case block that matches the
             * value.
             */
            switch (opc) {
                case "Seleccione una opción" -> {
                    JOptionPane.showMessageDialog(
                            null,
                            "Por favor escoge una opción valida.");
                    menu_opciones_temperatura();
                }
                case "De Grado Celsius a Grado Fahrenheit" -> {
                    st.solicitud_temperatura(1.8, 32.0, "Grados Fahrenheit");
                    continuar.continuar_con();
                }
                case "De Grado Celsius a Kelvin" -> {
                    st.solicitud_temperatura(1.0, 273.15, "Kelvin");
                    continuar.continuar_con();
                }
                case "De Grados Fahrenheit a Grados Celsius" -> {
                    st.solicitud_temperatura_r(32.0, 0.555555555, "Grados Celsius");
                    continuar.continuar_con();
                }
                case "De Grados Fahrenheit a Kelvin" -> {
                    st.solicitud_temperatura_s(32.0, 0.555555555, 273.15, "Kelvin");
                    continuar.continuar_con();
                }
                case "De Kelvin a Grados Celsius" -> {
                    st.solicitud_temperatura_ks(273.15, "Grados Celsius");
                    continuar.continuar_con();
                }
                case "De Kelvin a Grados Fahrenheit" -> {
                    st.solicitud_temperatura_kf(273.15, 1.8, 32.0, "Grados Fahrenheit");
                    continuar.continuar_con();
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
