/**
 * The line `package co.com.mycompany.methods;` is declaring the package that this Java class belongs
 * to. In this case, the class belongs to the `co.com.mycompany.methods` package. Packages are used to
 * organize and group related classes and interfaces together.
 */
package co.com.mycompany.methods;

/**
 * The `import` statements are used to import classes and interfaces from other
 * packages into the current Java class.
 */
import co.com.mycompany.classs.Menu;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Intercambio de Tiempo
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The `Intercambio_Tiempo` class is a Java class that performs conversions
 * between different units of time.
 */
public class Intercambio_Tiempo {

    /**
     * The code `public Intercambio_Tiempo(){}` is a constructor for the `Intercambio_Tiempo` class. A
     * constructor is a special method that is called when an object of a class is created.
    */
    public Intercambio_Tiempo(){

    }

    /**
     * The line `Menu menu = new Menu();` is creating a new instance of the
     * `Menu` class and assigning it to the variable `menu`. This allows the
     * current class to access and use the methods and properties of the `Menu`
     * class.
     */
    Menu menu = new Menu();
    /**
     * The lines `private Double convertidoM; private Double convertidoD;
     * private Double tiempo;` are declaring private instance variables in the
     * `Intercambio_Tiempo` class.
     */
    private Double convertidoM;
    private Double convertidoD;
    private Double tiempo;

    /**
     * The function returns the value of the variable "convertidoM" as a Double.
     *
     * @return The method is returning a Double value, which is stored in the
     * variable convertidoM.
     */
    public Double getConvertidoM() {
        return convertidoM;
    }

    /**
     * The function sets the value of the variable "convertidoM" by multiplying
     * the current value of "tiempo" with the input parameter "convertidoM".
     *
     * @param convertidoM The parameter "convertidoM" is a Double value that
     * represents the conversion factor for converting the time value to a
     * different unit of measurement.
     */
    public void setConvertidoM(Double convertidoM) {
        this.convertidoM = this.tiempo * convertidoM;
    }

    /**
     * The function returns the value of the "tiempo" variable as a Double.
     *
     * @return The method is returning a Double value.
     */
    public Double getTiempo() {
        return tiempo;
    }

    /**
     * The function sets the value of the "tiempo" variable, but displays an
     * error message if the value is negative.
     *
     * @param tiempo The tiempo parameter is a Double value representing the
     * time.
     */
    public void setTiempo(Double tiempo) {
        try {
            if (tiempo < 0) {
                JOptionPane.showMessageDialog(null, "Valor no valido, intenta de nuevo.");
                menu.convertidores();
            } else {
                this.tiempo = tiempo;
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
     * The function "getConvertidoD" returns a Double value.
     *
     * @return The method is returning a Double value.
     */
    public Double getConvertidoD() {
        return convertidoD;
    }

    /**
     * The function sets the value of "convertidoD" by dividing the value of
     * "tiempo" by the input parameter "convertidoD".
     *
     * @param convertidoD The parameter "convertidoD" is a Double value that is
     * used to calculate the value of the instance variable "convertidoD".
     */
    public void setConvertidoD(Double convertidoD) {
        this.convertidoD = this.tiempo / convertidoD;
    }

}
