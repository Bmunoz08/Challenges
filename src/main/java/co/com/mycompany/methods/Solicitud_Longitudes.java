/**
 * The line `package co.com.mycompany.methods;` is declaring the package name for the Java class. It is
 * specifying that the class belongs to the `co.com.mycompany.methods` package. Packages are used to
 * organize and group related classes and provide a way to avoid naming conflicts.
 */
package co.com.mycompany.methods;

/**
 * The `import` statements are used to import classes from other packages into
 * the current Java class.
 */
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Solicitabndo longitudes
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The `Solicitud_Longitudes` class contains methods for prompting the user to
 * enter a length value, performing conversions, and displaying the converted
 * length.
 */
public class Solicitud_Longitudes {

    /**
     * The code `public Solicitud_Longitudes(){}` is a constructor for the `Solicitud_Longitudes`
     * class. A constructor is a special method that is called when an object of a class is created.
    */
    public Solicitud_Longitudes(){

    }

    /**
     * The line `Intercambio_Longitudes il = new Intercambio_Longitudes();` is
     * creating a new instance of the `Intercambio_Longitudes` class and
     * assigning it to the variable `il`. This allows the `Solicitud_Longitudes`
     * class to access the methods and variables of the `Intercambio_Longitudes`
     * class.
     */
    Intercambio_Longitudes il = new Intercambio_Longitudes();

    /**
     * The function "solicitud_longitudes_m" takes in an equivalent value and a
     * name, prompts the user to enter a length, performs a conversion, and
     * displays the converted length.
     *
     * @param equivalente The parameter "equivalente" is a double value that
     * represents the conversion factor from the inputted length to the desired
     * length unit. It is used to calculate the converted length.
     * @param nombre The parameter "nombre" is a String that represents the unit
     * of measurement for the converted length.
     */
    public void solicitud_longitudes_m(double equivalente, String nombre) {
        try {
            /**
             * The line `Double longitud =
             * Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa la
             * longitud a convertir:"));` is prompting the user to enter a value
             * for the length to be converted.
             */
            Double longitud = Double.valueOf(JOptionPane.showInputDialog(
                    null,
                    "Ingresa la longitud a convertir:"));

            /**
             * The code `il.setLongitud(longitud);` is setting the value of the
             * `longitud` variable in the `Intercambio_Longitudes` class to the
             * value of the `longitud` variable in the `Solicitud_Longitudes`
             * class.
             */
            il.setLongitud(longitud);
            il.setConversionm(equivalente);
            Double cambio = il.getConversionm();

            /**
             * The line `JOptionPane.showMessageDialog(null, "Esta longitud
             * equivale a " + cambio + " " + nombre);` is displaying a message
             * dialog box to the user. The message displayed in the dialog box
             * is "Esta longitud equivale a " followed by the value of the
             * `cambio` variable, followed by a space, followed by the value of
             * the `nombre` variable. This is used to show the converted length
             * to the user.
             */
            JOptionPane.showMessageDialog(null, "Esta longitud equivale a " + cambio + " " + nombre);
        } /**
         * The `catch (HeadlessException | NumberFormatException e)` block is
         * used to handle any exceptions that may occur during the execution of
         * the code within the `try` block.
         */
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }

    }

    /**
     * The function "solicitud_longitudes_d" takes in a conversion factor and a
     * unit name, prompts the user to enter a length value, and displays the
     * converted length using the conversion factor and unit name.
     *
     * @param equivalente The parameter "equivalente" is a double value that
     * represents the conversion factor for the length unit being converted. It
     * is used to calculate the converted length value.
     * @param nombre The parameter "nombre" is a String that represents the unit
     * of measurement for the converted length.
     */
    public void solicitud_longitudes_d(double equivalente, String nombre) {

        try {
            /**
             * The line `Double longitud =
             * Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa la
             * longitud a convertir:"));` is prompting the user to enter a value
             * for the length to be converted. The
             * `JOptionPane.showInputDialog()` method displays an input dialog
             * box where the user can enter a value. The entered value is then
             * converted to a `Double` object using the `Double.valueOf()`
             * method and assigned to the variable `longitud`.
             */
            Double longitud = Double.valueOf(JOptionPane.showInputDialog(
                    null,
                    "Ingresa la longitud a convertir:"));

            /**
             * The code `il.setLongitud(longitud);` is setting the value of the
             * `longitud` variable in the `Intercambio_Longitudes` class to the
             * value of the `longitud` variable in the `Solicitud_Longitudes`
             * class.
             */
            il.setLongitud(longitud);
            il.setConversiond(equivalente);
            Double cambio = il.getConversiond();

            /**
             * `JOptionPane.showMessageDialog(null, "Esta longitud equivale a "
             * + cambio + " " + nombre);` is displaying a message dialog box to
             * the user. The message displayed in the dialog box is "Esta
             * longitud equivale a " followed by the value of the `cambio`
             * variable, followed by a space, followed by the value of the
             * `nombre` variable. This is used to show the converted length to
             * the user.
             */
            JOptionPane.showMessageDialog(null, "Esta longitud equivale a " + cambio + " " + nombre);
        } /**
         * The `catch (HeadlessException | NumberFormatException e)` block is
         * used to handle any exceptions that may occur during the execution of
         * the code within the `try` block.
         */
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }

    }

}
