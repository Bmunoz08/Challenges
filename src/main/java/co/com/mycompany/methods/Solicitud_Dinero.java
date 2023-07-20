/**
 * The line `package co.com.mycompany.methods;` is declaring the package name for the Java class. It is
 * specifying that the class belongs to the `co.com.mycompany.methods` package. Packages are used to
 * organize and group related classes and provide a way to avoid naming conflicts.
 */
package co.com.mycompany.methods;

/**
 * The `import` statements are used to import classes from the `java.awt` and
 * `javax.swing` packages.
 */
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Solicitando Dinero
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The class "Solicitud_Dinero" is used to request a currency conversion and
 * display the converted amount.
 */
public class Solicitud_Dinero {

    /**
     * The code `public Solicitud_Dinero(){}` is a constructor for the `Solicitud_Dinero` class. A
     * constructor is a special method that is called when an object of a class is created.
    */
    public Solicitud_Dinero(){

    }

    /**
     * The line `Intercambio_Divisa id = new Intercambio_Divisa();` is creating
     * a new instance of the `Intercambio_Divisa` class and assigning it to the
     * variable `id`. This allows the `Solicitud_Dinero` class to access the
     * methods and properties of the `Intercambio_Divisa` class.
     */
    Intercambio_Divisa id = new Intercambio_Divisa();

    /**
     * The function "solicitud_dinero" takes in a currency value and a name,
     * prompts the user to enter an amount of money to convert, and displays the
     * converted amount with the given currency name.
     *
     * @param divisa The divisa parameter represents the exchange rate for
     * converting the currency. It is a double value.
     * @param nombre The parameter "nombre" is a String that represents the name
     * of the currency.
     */
    public void solicitud_dinero(double divisa, String nombre) {

        try {
            /**
             * The code snippet is prompting the user to enter a value
             * representing an amount of money to convert. The entered value is
             * then converted to a `Double` using the `Double.valueOf()` method.
             */
            Double moneda = Double.valueOf(JOptionPane.showInputDialog(
                    null,
                    "Ingresa la cantidad de dinero a convertir:"));

            /**
             * The code `id.setMoneda(moneda); id.setConversion(divisa); Double
             * cambio = id.getConversion();` is setting the values of the
             * `moneda` and `divisa` variables in the `Intercambio_Divisa` class
             * and then retrieving the converted amount using the
             * `getConversion()` method.
             */
            id.setMoneda(moneda);
            id.setConversion(divisa);
            Double cambio = id.getConversion();

            /**
             * The line `JOptionPane.showMessageDialog(null, "Tienes $" + cambio
             * + " " + nombre);` is displaying a message dialog box to the user.
             */
            JOptionPane.showMessageDialog(null, "Tienes $" + cambio + " " + nombre);
        } /**
         * The `catch (HeadlessException | NumberFormatException e)` block is
         * used to handle exceptions that may occur during the execution of the
         * code within the `try` block.
         */
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }
    }

}
