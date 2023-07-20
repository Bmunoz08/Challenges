/**
 * The line `package co.com.mycompany.methods;` is declaring the package name for the Java class. It is
 * specifying that the class belongs to the `co.com.mycompany.methods` package. Packages are used to
 * organize and group related classes and provide a way to avoid naming conflicts.
 */
package co.com.mycompany.methods;

/**
 * The `import` statements are used to import specific classes or packages from
 * external libraries into the current Java class.
 */
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Solcitando temperatura
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The class "Solicitud_Temperatura" is responsible for handling user input and
 * displaying the converted temperature using the "Intercambio_Temperatura"
 * class.
 */
public class Solicitud_Temperatura {

    /**
     * The above code is defining a constructor for a class called "Solicitud_Temperatura".
    */
    public Solicitud_Temperatura(){

    }

    /**
     * The line `Intercambio_Temperatura it = new Intercambio_Temperatura();` is
     * creating a new instance of the `Intercambio_Temperatura` class and
     * assigning it to the variable `it`. This allows the
     * `Solicitud_Temperatura` class to access the methods and properties of the
     * `Intercambio_Temperatura` class.
     */
    Intercambio_Temperatura it = new Intercambio_Temperatura();

    /**
     * The function "solicitud_temperatura" takes in a multiple, a sum, and a
     * name as parameters, prompts the user to enter a temperature, converts the
     * temperature using the given multiple and sum, and displays the converted
     * temperature with the given name.
     *
     * @param multiplo A double value representing the conversion factor from
     * Celsius to Fahrenheit or Kelvin.
     * @param suma The parameter "suma" is used to calculate the sum of the
     * temperature value and a constant value.
     * @param nombre The name of the temperature unit (e.g. "Celsius",
     * "Fahrenheit", "Kelvin").
     */
    public void solicitud_temperatura(Double multiplo, Double suma, String nombre) {
        try {
            /**
             * The line `Double temperatura =
             * Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa la
             * temperatura a convertir:"));` is prompting the user to enter a
             * temperature value and storing it in the variable `temperatura`.
             */
            Double temperatura = Double.valueOf(JOptionPane.showInputDialog(
                    null,
                    "Ingresa la temperatura a convertir:"));
            /**
             * The code `it.setTemperatura(temperatura);` is setting the value
             * of the temperature in the `Intercambio_Temperatura` object `it`
             * to the value of the variable `temperatura`.
             */
            it.setTemperatura(temperatura);
            it.setCambioCFK(multiplo, suma);
            Double cambio = it.getCambioCFK();
            /**
             * The line `JOptionPane.showMessageDialog(null, "Tu temperatura es
             * " + cambio + " " + nombre);` is displaying a message dialog box
             * to the user. The dialog box will show the message "Tu temperatura
             * es " followed by the value of the variable `cambio`, a space, and
             * the value of the variable `nombre`. This is used to inform the
             * user of the converted temperature.
             */
            JOptionPane.showMessageDialog(null, "Tu temperatura es " + cambio + " " + nombre);
        } // The `catch (HeadlessException | NumberFormatException e)` block is used to handle any
        // exceptions that may occur during the execution of the code within the corresponding `try`
        // block.
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }

    }

    /**
     * The function "solicitud_temperatura_r" takes user input for a
     * temperature, performs a conversion using a given formula, and displays
     * the converted temperature with a specified unit of measurement.
     *
     * @param resta A value used to subtract from the temperature before
     * multiplying it by the multiplo value.
     * @param multiplo The "multiplo" parameter is a Double value that
     * represents the factor by which the temperature will be multiplied during
     * the conversion process.
     * @param nombre The parameter "nombre" is a String that represents the unit
     * of measurement for the temperature.
     */
    public void solicitud_temperatura_r(Double resta, Double multiplo, String nombre) {
        try {
            /**
             * The line `Double temperatura =
             * Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa la
             * temperatura a convertir:"));` is prompting the user to enter a
             * temperature value and storing it in the variable `temperatura`.
             */
            Double temperatura = Double.valueOf(JOptionPane.showInputDialog(
                    null,
                    "Ingresa la temperatura a convertir:"));
            /**
             * The code `it.setTemperatura(temperatura);` is setting the value
             * of the temperature in the `Intercambio_Temperatura` object `it`
             * to the value of the variable `temperatura`.
             */
            it.setTemperatura(temperatura);
            it.setCambioFC(resta, multiplo);
            Double cambio = it.getCambioFC();
            /**
             * The line `JOptionPane.showMessageDialog(null, "Tu temperatura es
             * " + cambio + " " + nombre);` is displaying a message dialog box
             * to the user. The dialog box will show the message "Tu temperatura
             * es " followed by the value of the variable `cambio`, a space, and
             * the value of the variable `nombre`. This is used to inform the
             * user of the converted temperature.
             */
            JOptionPane.showMessageDialog(null, "Tu temperatura es " + cambio + " " + nombre);
        } /**
         * The `catch (HeadlessException | NumberFormatException e)` block is
         * used to handle any exceptions that may occur during the execution of
         * the code within the corresponding `try` block.
         */
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }

    }

    /**
     * This Java function prompts the user to enter a temperature, converts it
     * using a given formula, and displays the converted temperature with the
     * specified unit of measurement.
     *
     * @param resta A value used for subtraction in the temperature conversion
     * formula.
     * @param multiplo The "multiplo" parameter is used to calculate the
     * conversion factor for the temperature conversion. It represents the value
     * by which the temperature should be multiplied to convert it to the
     * desired unit.
     * @param suma The parameter "suma" is used to calculate the temperature
     * conversion. It represents the value that needs to be added to the
     * temperature in order to convert it to the desired unit.
     * @param nombre The parameter "nombre" is a String that represents the unit
     * of measurement for the temperature.
     */
    public void solicitud_temperatura_s(Double resta, Double multiplo, Double suma, String nombre) {
        try {
            /**
             * The line `Double temperatura =
             * Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa la
             * temperatura a convertir:"));` is prompting the user to enter a
             * temperature value and storing it in the variable `temperatura`.
             */
            Double temperatura = Double.valueOf(JOptionPane.showInputDialog(
                    null,
                    "Ingresa la temperatura a convertir:"));

            /**
             * The code `it.setTemperatura(temperatura);` is setting the value
             * of the temperature in the `Intercambio_Temperatura` object `it`
             * to the value of the variable `temperatura`.
             */
            it.setTemperatura(temperatura);
            it.setCambioFK(resta, multiplo, suma);
            Double cambio = it.getCambioFK();

            /**
             * The line `JOptionPane.showMessageDialog(null, "Tu temperatura es
             * " + cambio + " " + nombre);` is displaying a message dialog box
             * to the user. The dialog box will show the message "Tu temperatura
             * es " followed by the value of the variable `cambio`, a space, and
             * the value of the variable `nombre`. This is used to inform the
             * user of the converted temperature.
             */
            JOptionPane.showMessageDialog(null, "Tu temperatura es " + cambio + " " + nombre);
        } /**
         * The `catch (HeadlessException | NumberFormatException e)` block is
         * used to handle any exceptions that may occur during the execution of
         * the code within the corresponding `try` block.
         */
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }

    }

    /**
     * The function "solicitud_temperatura_ks" takes user input for a
     * temperature, converts it using a given value, and displays the converted
     * temperature with a given unit.
     *
     * @param resta The parameter "resta" is of type Double and represents the
     * value by which the temperature will be converted. It is used to calculate
     * the converted temperature in the method.
     * @param nombre The parameter "nombre" is a String variable that represents
     * the name of the temperature unit being converted to.
     */
    public void solicitud_temperatura_ks(Double resta, String nombre) {
        try {
            /**
             * The line `Double temperatura =
             * Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa la
             * temperatura a convertir:"));` is prompting the user to enter a
             * temperature value and storing it in the variable `temperatura`.
             */
            Double temperatura = Double.valueOf(JOptionPane.showInputDialog(
                    null,
                    "Ingresa la temperatura a convertir:"));

            /**
             * The code `it.setTemperatura(temperatura);` is setting the value
             * of the temperature in the `Intercambio_Temperatura` object `it`
             * to the value of the variable `temperatura`.
             */
            it.setTemperatura(temperatura);
            it.setCambioKC(resta);
            Double cambio = it.getCambioKC();

            /**
             * The line `JOptionPane.showMessageDialog(null, "Tu temperatura es
             * " + cambio + " " + nombre);` is displaying a message dialog box
             * to the user. The dialog box will show the message "Tu temperatura
             * es " followed by the value of the variable `cambio`, a space, and
             * the value of the variable `nombre`. This is used to inform the
             * user of the converted temperature.
             */
            JOptionPane.showMessageDialog(null, "Tu temperatura es " + cambio + " " + nombre);
        } /**
         * The above code is using a try-catch block to handle two types of
         * exceptions: HeadlessException and NumberFormatException. If either of
         * these exceptions is thrown within the try block, a message dialog box
         * will be displayed with the error message.
         */
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }

    }

    /**
     * This Java function prompts the user to enter a temperature, converts it
     * using a formula, and displays the converted temperature with a specified
     * unit of measurement.
     *
     * @param resta The value to subtract from the temperature before
     * multiplying by the multiplo value and adding the suma value.
     * @param multiplo The "multiplo" parameter is used to calculate the
     * conversion factor for converting the temperature from Kelvin to
     * Fahrenheit.
     * @param suma The parameter "suma" is used to calculate the conversion from
     * Kelvin to Fahrenheit. It represents the value that needs to be added to
     * the result of the multiplication of the temperature by a certain factor.
     * @param nombre The name of the temperature unit (e.g., "Kelvin" or
     * "Fahrenheit").
     */
    public void solicitud_temperatura_kf(Double resta, Double multiplo, Double suma, String nombre) {
        try {
            /**
             * The above code is prompting the user to enter a temperature value
             * and storing it in a variable called "temperatura" as a Double
             * data type.
             */
            Double temperatura = Double.valueOf(JOptionPane.showInputDialog(
                    null,
                    "Ingresa la temperatura a convertir:"));

            /**
             * The code is setting the temperature value using the
             * `setTemperatura` method of an object `it`. It then sets the
             * `cambioKF` value using the `setCambioKF` method, passing in three
             * parameters: `resta`, `multiplo`, and `suma`. Finally, it
             * retrieves the `cambioKF` value using the `getCambioKF` method and
             * assigns it to a `Double` variable `cambio`.
             */
            it.setTemperatura(temperatura);
            it.setCambioKF(resta, multiplo, suma);
            Double cambio = it.getCambioKF();

            /**
             * The above code is displaying a message dialog box with the
             * message "Tu temperatura es " followed by the value of the
             * variable "cambio" and the value of the variable "nombre".
             */
            JOptionPane.showMessageDialog(null, "Tu temperatura es " + cambio + " " + nombre);
        } /**
         * The above code is using a try-catch block to handle two types of
         * exceptions: HeadlessException and NumberFormatException. If either of
         * these exceptions is thrown within the try block, a message dialog box
         * will be displayed with the error message.
         */
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }

    }
}
