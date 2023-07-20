/**
 * The line `package co.com.mycompany.methods;` is declaring the package name for the Java class. It is
 * specifying the directory structure where the class file will be located. In this case, the class is
 * part of the `methods` package within the `co.com.mycompany` package.
 */
package co.com.mycompany.methods;

/**
 * The `import` statements are used to import specific classes or packages from
 * the Java API. In this case, the code is importing the `HeadlessException`
 * class from the `java.awt` package and the `JOptionPane` class from the
 * `javax.swing` package.
 */
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Solicitando tiempo
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The class "Solicitud_Tiempo" is responsible for handling user input and
 * displaying the converted time in either minutes or days.
 */
public class Solicitud_Tiempo {

    /**
     * The code `public Solicitud_Tiempo(){}` is a constructor for the `Solicitud_Tiempo` class. A
     * constructor is a special method that is called when an object of a class is created.
    */
    public Solicitud_Tiempo(){

    }

    /**
     * The line `Intercambio_Tiempo it = new Intercambio_Tiempo();` is creating
     * a new instance of the `Intercambio_Tiempo` class and assigning it to the
     * variable `it`. This allows the `Solicitud_Tiempo` class to access the
     * methods and variables of the `Intercambio_Tiempo` class.
     */
    Intercambio_Tiempo it = new Intercambio_Tiempo();

    /**
     * The function "solicitud_tiempo_m" takes a time value and a unit name as
     * input, converts the time to a specified unit, and displays the converted
     * time.
     *
     * @param solicitud The parameter "solicitud" is of type Double and
     * represents the conversion factor for converting the input time to the
     * desired unit of time.
     * @param nombre The parameter "nombre" is a String variable that represents
     * the name of the unit of time being converted.
     */
    public void solicitud_tiempo_m(Double solicitud, String nombre) {

        try {
            /**
             * The line `Double tiempo =
             * Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa el
             * tiempo a convertir:"));` is prompting the user to enter a time
             * value to be converted.
             */
            Double tiempo = Double.valueOf(JOptionPane.showInputDialog(
                    null,
                    "Ingresa el tiempo a convertir:"));
            /**
             * The lines `it.setTiempo(tiempo);`,
             * `it.setConvertidoM(solicitud);`, and `Double cambio =
             * it.getConvertidoM();` are accessing methods and variables of the
             * `Intercambio_Tiempo` class.
             */
            it.setTiempo(tiempo);
            it.setConvertidoM(solicitud);
            Double cambio = it.getConvertidoM();

            /**
             * The line `JOptionPane.showMessageDialog(null, "Tu tiempo equivale
             * a " + cambio + " " + nombre);` is displaying a message dialog box
             * to the user. The message displayed in the dialog box is "Tu
             * tiempo equivale a " followed by the value of the variable
             * `cambio`, followed by a space, followed by the value of the
             * variable `nombre`. This line is used to show the converted time
             * to the user.
             */
            JOptionPane.showMessageDialog(null, "Tu tiempo equivale a " + cambio + " " + nombre);
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
     * The function `solicitud_tiempo_d` takes a time value and a unit of time
     * as input, converts the time value to the specified unit, and displays the
     * converted value.
     *
     * @param solicitud The parameter "solicitud" is of type Double and
     * represents the conversion factor for the time conversion. It is used to
     * convert the input time to the desired unit of time.
     * @param nombre The parameter "nombre" is a String variable that represents
     * the name of the unit of time being converted.
     */
    public void solicitud_tiempo_d(Double solicitud, String nombre) {

        try {
            // The line `Double tiempo = Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa el
            // tiempo a convertir:"));` is prompting the user to enter a time value to be converted.
            // The `JOptionPane.showInputDialog()` method displays an input dialog box where the user
            // can enter a value. The entered value is then converted to a `Double` using the
            // `Double.valueOf()` method and assigned to the variable `tiempo`.
            Double tiempo = Double.valueOf(JOptionPane.showInputDialog(
                    null,
                    "Ingresa el tiempo a convertir:"));

            /**
             * The lines `it.setTiempo(tiempo);`,
             * `it.setConvertidoD(solicitud);`, and `Double cambio =
             * it.getConvertidoD();` are accessing methods and variables of the
             * `Intercambio_Tiempo` class.
             */
            it.setTiempo(tiempo);
            it.setConvertidoD(solicitud);
            Double cambio = it.getConvertidoD();
            /**
             * `JOptionPane.showMessageDialog(null, "Tu tiempo equivale a " +
             * cambio + " " + nombre);` is displaying a message dialog box to
             * the user. The message displayed in the dialog box is "Tu tiempo
             * equivale a " followed by the value of the variable `cambio`,
             * followed by a space, followed by the value of the variable
             * `nombre`. This line is used to show the converted time to the
             * user.
             */
            JOptionPane.showMessageDialog(null, "Tu tiempo equivale a " + cambio + " " + nombre);
        } // The `catch (HeadlessException | NumberFormatException e) { ... }` block is used to handle
        // any exceptions that may occur during the execution of the code within the `try` block.
        catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }

    }

}
