/**
 * The line `package co.com.mycompany.classs;` is declaring the package name for the current Java file.
 * It specifies the location of the file within the project's directory structure. In this case, the
 * file is located in the `classs` package under the `co.com.mycompany` package.
 */
package co.com.mycompany.classs;

/**
 * The `import` statements at the beginning of the code are used to import
 * classes from external packages.
 */
import javax.swing.JOptionPane;
import co.com.mycompany.methods.Solicitud_Dinero;
import java.awt.HeadlessException;

/**
 * Menu Opciones de Moneda
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The class "Menu_Opciones_Moneda" provides a menu for converting currency
 * between different options.
 */
public class Menu_Opciones_Moneda {

    /**
     * The code `public Menu_Opciones_Moneda(){}` is a constructor for the class
     * `Menu_Opciones_Moneda`. A constructor is a special method that is called when an object of a
     * class is created.
    */
    public Menu_Opciones_Moneda(){

    }

    /**
     * In the given code, `Solicitud_Dinero datos = new Solicitud_Dinero();` and
     * `Continuar continuar = new Continuar();` are creating instances of the
     * classes `Solicitud_Dinero` and `Continuar` respectively.
     */
    Solicitud_Dinero datos = new Solicitud_Dinero();
    Continuar continuar = new Continuar();

    /**
     * The method `menu_convertidor_moneda()` is defining the functionality of the menu for converting
     * currency between different options. It is a public method, which means it can be accessed from
     * other classes. The method does not return any value (`void`), but it performs several actions
     * based on the user's selection from the menu.
    */
    public void menu_convertidor_moneda() {

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
             * The code `Object menu_peso_colombiano =
             * JOptionPane.showInputDialog(...)` is displaying a dialog box with
             * a list of options for the user to select. The selected option
             * will be stored in the variable `menu_peso_colombiano` as an
             * `Object` type.
             */
            Object menu_peso_colombiano = JOptionPane.showInputDialog(
                    null,
                    "Seleccione la opción deseada.",
                    "CONVERTIDOR",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{
                        "Seleccione una opción",
                        "De Pesos a Dólar",
                        "De Pesos a Euro",
                        "De Pesos a Libras",
                        "De Pesos a Yen",
                        "De Pesos a Won Coreano",
                        "Dólar a Pesos",
                        "Euro a Pesos",
                        "Libras a Pesos",
                        "Yen a Pesos",
                        "Won Coreano a Pesos"
                    },
                    "opcion 1");

            /**
             * The code `if (menu_peso_colombiano == null) {
             * JOptionPane.showMessageDialog(null, "Programa Finalizado");
             * System.exit(0); }` is checking if the variable
             * `menu_peso_colombiano` is null. If it is null, it means that the
             * user closed the dialog box without selecting any option. In this
             * case, a message "Programa Finalizado" (Program Finished) is
             * displayed using a dialog box, and the program is terminated by
             * calling `System.exit(0)`, which exits the Java Virtual Machine.
             */
            if (menu_peso_colombiano == null) {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                System.exit(0);
            }

            /**
             * The line `String opc = (String) menu_peso_colombiano;` is casting
             * the variable `menu_peso_colombiano` from type `Object` to type
             * `String`. This is done because the `menu_peso_colombiano`
             * variable is storing the selected option from a dialog box, which
             * is returned as an `Object` type. By casting it to `String`, it
             * can be used in the switch statement to determine the selected
             * option and execute the corresponding code block.
             */
            String opc = (String) menu_peso_colombiano;

            /**
             * The `switch` statement is used to select one of many code blocks
             * to be executed based on the value of the variable `opc`. In this
             * case, the variable `opc` stores the selected option from the
             * dialog box.
             */
            switch (opc) {
                case "Seleccione una opción" -> {
                    JOptionPane.showMessageDialog(
                            null,
                            "Por favor escoge una opción valida.");
                    menu_convertidor_moneda();
                }
                case "De Pesos a Dólar" -> {
                    datos.solicitud_dinero(0.00024, "Dolares");
                    continuar.continuar_con();
                }
                case "De Pesos a Euro" -> {
                    datos.solicitud_dinero(0.00022, "Euros");
                    continuar.continuar_con();
                }
                case "De Pesos a Libras" -> {
                    datos.solicitud_dinero(0.00019, "Libras");
                    continuar.continuar_con();
                }
                case "De Pesos a Yen" -> {
                    datos.solicitud_dinero(0.033, "Yenes");
                    continuar.continuar_con();
                }
                case "De Pesos a Won Coreano" -> {
                    datos.solicitud_dinero(0.31, "Wons Coreanos");
                    continuar.continuar_con();
                }
                case "Dólar a Pesos" -> {
                    datos.solicitud_dinero(4099.00, "Pesos");
                    continuar.continuar_con();
                }
                case "Euro a Pesos" -> {
                    datos.solicitud_dinero(4605.98, "Pesos");
                    continuar.continuar_con();
                }
                case "Libras a Pesos" -> {
                    datos.solicitud_dinero(5383.22, "Pesos");
                    continuar.continuar_con();
                }
                case "Yen a Pesos" -> {
                    datos.solicitud_dinero(29.82, "Pesos");
                    continuar.continuar_con();
                }
                case "Won Coreano a Pesos" -> {
                    datos.solicitud_dinero(9.22, "Pesos");
                    continuar.continuar_con();
                }
                /**
                 * The line `default -> throw new AssertionError();` is the
                 * default case in the switch statement. It is executed when
                 * none of the previous cases match the value of the variable
                 * `opc`.
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
