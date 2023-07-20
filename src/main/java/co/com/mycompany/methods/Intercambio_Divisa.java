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
 * Intercambio de divisa
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The Intercambio_Divisa class is used for converting currency values based on
 * a given exchange rate.
 */
public class Intercambio_Divisa {

    /**
     * The code `public Intercambio_Divisa(){ }` is a constructor for the `Intercambio_Divisa` class. A
     * constructor is a special method that is called when an object of a class is created.
    */
    public Intercambio_Divisa(){

    }

    /**
     * The code `Menu menu = new Menu();` is creating a new instance of the
     * `Menu` class and assigning it to the variable `menu`. This allows the
     * current class to access and use the methods and properties of the `Menu`
     * class.
     */
    Menu menu = new Menu();
    /**
     * The lines `private Double conversion;` and `private Double moneda;` are
     * declaring private instance variables in the `Intercambio_Divisa` class.
     */
    private Double conversion;
    private Double moneda;

    /**
     * The function "getMoneda" returns a Double value.
     *
     * @return The method is returning a Double value.
     */
    public Double getMoneda() {
        return moneda;
    }

    /**
     * The function sets the value of a variable called "moneda" if the input is
     * valid, otherwise it displays an error message.
     *
     * @param moneda The parameter "moneda" is of type Double and represents the
     * value of a currency.
     */
    public void setMoneda(Double moneda) {
        try {

            if (moneda < 0) {
                JOptionPane.showMessageDialog(null, "Valor invalido, intenta nuevamente.");
                menu.convertidores();
            } else {
                this.moneda = moneda;
            }
        } /**
         * The `catch (HeadlessException e) { ... }` block is used to handle any
         * `HeadlessException` that may occur within the `try` block.
         */
        catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema " + e);
        }
    }

    /**
     * The function returns the conversion value as a Double.
     *
     * @return The method is returning a Double value.
     */
    public Double getConversion() {
        return conversion;
    }

    /**
     * The function sets the conversion value by multiplying the currency value
     * with a given exchange rate.
     *
     * @param divisa The parameter "divisa" is a Double value representing the
     * conversion rate between two currencies.
     */
    public void setConversion(Double divisa) {

        this.conversion = this.moneda * divisa;

    }

}
