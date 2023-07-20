/**
 * The line `package co.com.mycompany.methods;` is declaring the package that this Java class belongs
 * to. In this case, the class belongs to the `co.com.mycompany.methods` package. Packages are used to
 * organize and group related classes and interfaces together.
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
 * Intercambio de Masa
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The Intercambio_Masa class is used for converting mass measurements and
 * includes methods for setting and getting the conversion factors and mass
 * value.
 */
public class Intercambio_Masa {

    /**
     * The code `public Intercambio_Masa(){}` is a constructor for the `Intercambio_Masa` class. A
     * constructor is a special method that is called when an object of a class is created.
    */
    public Intercambio_Masa(){

    }

    /**
     * The line `Menu menu = new Menu();` is creating a new instance of the
     * `Menu` class and assigning it to the variable `menu`. This allows the
     * current class (`Intercambio_Masa`) to access the methods and properties
     * of the `Menu` class.
     */
    Menu menu = new Menu();
    /**
     * The lines `private Double conversionM;`, `private Double conversionD;`,
     * and `private Double masa;` are declaring private instance variables in
     * the `Intercambio_Masa` class.
     */
    private Double conversionM;
    private Double conversionD;
    private Double masa;

    /**
     * The function returns the value of the conversionM variable as a Double.
     *
     * @return The method is returning a Double value, which is the value of the
     * variable conversionM.
     */
    public Double getConversionM() {
        return conversionM;
    }

    /**
     * The function sets the value of conversionM by multiplying the value of
     * masa with the provided conversionM value.
     *
     * @param conversionM The conversionM parameter is a Double value that
     * represents the conversion factor for converting the mass (masa) to a
     * different unit of measurement.
     */
    public void setConversionM(Double conversionM) {
        this.conversionM = this.masa * conversionM;
    }

    /**
     * The function returns the value of the variable "masa" as a Double.
     *
     * @return The method is returning a Double value, which is the value of the
     * variable "masa".
     */
    public Double getMasa() {
        return masa;
    }

    /**
     * The function sets the value of the "masa" variable, but displays an error
     * message if the value is negative.
     *
     * @param masa The parameter "masa" is a Double type variable that
     * represents the value of mass.
     */
    public void setMasa(Double masa) {
        try {
            if (masa < 0) {
                JOptionPane.showMessageDialog(null, "Valor invalido, intenta nuevamente.");
                menu.convertidores();
            } else {
                this.masa = masa;
            }
        } /**
         * The `catch (HeadlessException e) { ... }` block is a catch block that
         * handles any `HeadlessException` that may occur in the `try` block.
         */
        catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }
    }

    /**
     * The function returns a Double value representing a conversion factor.
     *
     * @return The method is returning a Double value.
     */
    public Double getConversionD() {
        return conversionD;
    }

    /**
     * The function sets the value of conversionD by dividing the value of masa
     * by the input parameter conversionD.
     *
     * @param conversionD The parameter "conversionD" is a Double type variable
     * that represents the conversion factor for converting the "masa" variable
     * to a different unit of measurement.
     */
    public void setConversionD(Double conversionD) {
        this.conversionD = this.masa / conversionD;
    }

}
