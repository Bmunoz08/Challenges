/**
 * The line `package co.com.mycompany.methods;` is declaring the package name for the Java class. It is
 * specifying that the class belongs to the `co.com.mycompany.methods` package. Packages are used to
 * organize and group related classes and provide a way to avoid naming conflicts.
 */
package co.com.mycompany.methods;

/**
 * The `import` statements are used to import specific classes or packages from
 * the Java API (Application Programming Interface) into the current Java class.
 */
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Solcitando Masas
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The class "Solicitud_Masa" is responsible for handling user input and
 * displaying the converted mass using the "Intercambio_Masa" class.
 */
public class Solicitud_Masa {

    /**
     * The code `public Solicitud_Masa(){}` is a constructor for the `Solicitud_Masa` class. A
     * constructor is a special method that is called when an object of a class is created.
    */
    public Solicitud_Masa(){

    }

    /**
     * The line `Intercambio_Masa im = new Intercambio_Masa();` is creating a
     * new instance of the `Intercambio_Masa` class and assigning it to the
     * variable `im`. This allows the `Solicitud_Masa` class to access the
     * methods and properties of the `Intercambio_Masa` class.
     */
    Intercambio_Masa im = new Intercambio_Masa();

    /**
     * The function "solicitud_masa_m" takes in a weight and a name, prompts the
     * user to enter a mass to convert, sets the mass and conversion factor, and
     * displays the converted mass.
     *
     * @param peso The parameter "peso" represents the weight or conversion
     * factor for the mass conversion. It is used to calculate the converted
     * mass value.
     * @param nombre The parameter "nombre" is a String variable that represents
     * the unit of measurement for the converted mass.
     */
    public void solicitud_masa_m(double peso, String nombre) {
        try {
            /**
             * The line `Double masa =
             * Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa la masa
             * a convertir:"));` is prompting the user to enter a value for the
             * mass to be converted.
             */
            Double masa = Double.valueOf(JOptionPane.showInputDialog(
                    null,
                    "Ingresa la masa a convertir:"));

            /**
             * The lines `im.setMasa(masa);`, `im.setConversionM(peso);`, and
             * `Double cambio = im.getConversionM();` are setting the values for
             * the mass and conversion factor in the `Intercambio_Masa` class
             * and retrieving the converted mass value.
             */
            im.setMasa(masa);
            im.setConversionM(peso);
            Double cambio = im.getConversionM();

            /**
             * The line `JOptionPane.showMessageDialog(null, "Esta masa equivale
             * a " + cambio + " " + nombre);` is displaying a message dialog box
             * to the user. The dialog box will show the message "Esta masa
             * equivale a " followed by the value of the variable `cambio`,
             * followed by a space, and then the value of the variable `nombre`.
             */
            JOptionPane.showMessageDialog(null, "Esta masa equivale a " + cambio + " " + nombre);
        } /**
         * The `catch (HeadlessException | NumberFormatException e) { ... }`
         * block is a catch block that handles exceptions of type
         * `HeadlessException` and `NumberFormatException`.
         */
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }

    }

    /**
     * The function "solicitud_masa_d" takes in a weight and a name, prompts the
     * user to enter a mass to convert, sets the mass and conversion factor in
     * an object, and displays the converted mass.
     *
     * @param peso The parameter "peso" represents the weight or mass conversion
     * factor. It is used to convert the input mass to a different unit of
     * measurement.
     * @param nombre The parameter "nombre" is a String variable that represents
     * the unit of measurement for the converted mass.
     */
    public void solicitud_masa_d(double peso, String nombre) {
        try {

            /**
             * The line `Double masa =
             * Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa la masa
             * a convertir:"));` is prompting the user to enter a value for the
             * mass to be converted.
             */
            Double masa = Double.valueOf(JOptionPane.showInputDialog(
                    null,
                    "Ingresa la masa a convertir:"));
            /**
             * The lines `im.setMasa(masa);`, `im.setConversionD(peso);`, and
             * `Double cambio = im.getConversionD();` are setting the values for
             * the mass and conversion factor in the `Intercambio_Masa` class
             * and retrieving the converted mass value.
             */
            im.setMasa(masa);
            im.setConversionD(peso);
            Double cambio = im.getConversionD();

            /**
             * `JOptionPane.showMessageDialog(null, "Esta masa equivale a " +
             * cambio + " " + nombre);` is displaying a message dialog box to
             * the user. The dialog box will show the message "Esta masa
             * equivale a " followed by the value of the variable `cambio`,
             * followed by a space, and then the value of the variable `nombre`.
             */
            JOptionPane.showMessageDialog(null, "Esta masa equivale a " + cambio + " " + nombre);
        } /**
         * The `catch (HeadlessException | NumberFormatException e) { ... }`
         * block is a catch block that handles exceptions of type
         * `HeadlessException` and `NumberFormatException`.
         */
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }
    }

}
