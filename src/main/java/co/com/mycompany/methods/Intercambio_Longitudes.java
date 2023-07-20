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
import co.com.mycompany.classs.Menu;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Intercambio de Longitudes
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The class "Intercambio_Longitudes" is a Java class that performs conversions
 * between different units of length.
 */
public class Intercambio_Longitudes {

    /**
     * The code `public Intercambio_Longitudes(){}` is a constructor for the `Intercambio_Longitudes`
     * class. A constructor is a special method that is called when an object of a class is created.
    */
    public Intercambio_Longitudes(){

    }

    // The line `Menu menu = new Menu();` is creating a new instance of the `Menu` class and assigning
    // it to the variable `menu`. This allows the current class (`Intercambio_Longitudes`) to access
    // the methods and properties of the `Menu` class.
    Menu menu = new Menu();
    /**
     * The lines `private Double conversionm;`, `private Double conversiond;`,
     * and `private Double longitud;` are declaring private instance variables
     * in the Java class `Intercambio_Longitudes`.
     */
    private Double conversionm;
    private Double conversiond;
    private Double longitud;

    /**
     * The function returns the value of the variable "longitud" as a Double.
     *
     * @return The method is returning a Double value, which represents the
     * longitude.
     */
    public Double getLongitud() {
        return longitud;
    }

    /**
     * The function sets the value of the "longitud" variable, but displays an
     * error message if the value is negative.
     *
     * @param longitud The parameter "longitud" is a Double value representing
     * the longitude.
     */
    public void setLongitud(Double longitud) {
        try {

            if (longitud < 0) {
                JOptionPane.showMessageDialog(null, "Valor invalido, intenta nuevamente.");
                menu.convertidores();
            } else {
                this.longitud = longitud;
            }
        } /**
         * The `catch (HeadlessException e) { ... }` block is a catch block that
         * handles any `HeadlessException` that may occur within the `try`
         * block.
         */
        catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }
    }

    /**
     * The function returns the value of the conversionm variable as a Double.
     *
     * @return The method is returning a Double value.
     */
    public Double getConversionm() {
        return conversionm;
    }

    /**
     * The function sets the value of the conversionm variable by multiplying
     * the longitud variable with the given equivalente value.
     *
     * @param equivalente The parameter "equivalente" is a Double value that
     * represents the conversion factor between two units of measurement.
     */
    public void setConversionm(Double equivalente) {

        this.conversionm = this.longitud * equivalente;

    }

    /**
     * The function returns a Double value representing a conversion.
     *
     * @return The method is returning a Double value.
     */
    public Double getConversiond() {
        return conversiond;
    }

    /**
     * The function sets the value of the conversiond variable by dividing the
     * longitud variable by the input parameter conversiond.
     *
     * @param conversiond The parameter "conversiond" is a Double value that
     * represents the conversion factor for converting the "longitud" variable.
     */
    public void setConversiond(Double conversiond) {

        this.conversiond = this.longitud / conversiond;
    }

}
