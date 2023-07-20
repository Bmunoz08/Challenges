/**
 * The line `package co.com.mycompany.methods;` is declaring the package name for the Java class. It is
 * used to organize classes into different namespaces or modules. In this case, the class
 * `Intercambio_Temperatura` is part of the `co.com.mycompany.methods` package.
 */
package co.com.mycompany.methods;

/**
 * Intercambio de Temperatura
 *
 * @version 1.0;
 * @author BRAYAN
 */
/**
 * The Intercambio_Temperatura class provides methods to convert temperature
 * between Celsius, Fahrenheit, and Kelvin.
 */
public class Intercambio_Temperatura {

    /**
     * The code `public Intercambio_Temperatura(){}` is a constructor for the `Intercambio_Temperatura`
     * class. A constructor is a special method that is called when an object of a class is created.
    */
    public Intercambio_Temperatura(){

    }

    /**
     * These lines are declaring private instance variables in the
     * `Intercambio_Temperatura` class.
     */
    private Double cambioCFK;
    private Double cambioFC;
    private Double cambioFK;
    private Double cambioKC;
    private Double cambioKF;
    private Double temperatura;

    /**
     * The getCambioCFK() function returns the value of the cambioCFK variable
     * as a Double.
     *
     * @return The method is returning a Double value, which is the value of the
     * variable "cambioCFK".
     */
    public Double getCambioCFK() {
        return cambioCFK;
    }

    /**
     * The function calculates the value of cambioCFK by multiplying the
     * temperature by a given multiple and adding a given sum.
     *
     * @param multiplo The multiplo parameter is a Double value that is used to
     * multiply the temperatura variable.
     * @param suma The parameter "suma" is a Double value that represents the
     * amount to be added to the result of the multiplication.
     */
    public void setCambioCFK(Double multiplo, Double suma) {
        this.cambioCFK = (this.temperatura * multiplo) + suma;
    }

    /**
     * The getCambioFC() function returns the value of the cambioFC variable as
     * a Double.
     *
     * @return The method is returning a Double value, which is the value of the
     * variable cambioFC.
     */
    public Double getCambioFC() {
        return cambioFC;
    }

    /**
     * The function calculates the cambioFC value by subtracting a given value
     * from the temperature and then multiplying it by another given value.
     *
     * @param resta The parameter "resta" is a Double value that represents the
     * value to be subtracted from the current temperature.
     * @param multiplo The "multiplo" parameter is a value that will be
     * multiplied with the difference between the current temperature and the
     * "resta" value. The result will be assigned to the "cambioFC" variable.
     */
    public void setCambioFC(Double resta, Double multiplo) {
        this.cambioFC = (this.temperatura - resta) * multiplo;
    }

    /**
     * The getCambioFK() function returns the value of the cambioFK variable as
     * a Double.
     *
     * @return The method is returning a Double value.
     */
    public Double getCambioFK() {
        return cambioFK;
    }

    /**
     * The function calculates the value of cambioFK based on the current
     * temperature, a subtraction, a multiplication, and an addition.
     *
     * @param resta The value to be subtracted from the temperature before
     * performing the calculation.
     * @param multiplo The multiplo parameter is a value that is used to
     * multiply the difference between the temperatura and resta.
     * @param suma The parameter "suma" is a Double value that represents the
     * amount to be added to the result of the calculation.
     */
    public void setCambioFK(Double resta, Double multiplo, Double suma) {
        this.cambioFK = (this.temperatura - resta) * multiplo + suma;
    }

    /**
     * The getCambioKC() function returns the value of the cambioKC variable as
     * a Double.
     *
     * @return The method is returning a Double value, which is the value of the
     * variable "cambioKC".
     */
    public Double getCambioKC() {
        return cambioKC;
    }

    /**
     * The function "setCambioKC" subtracts a given value from the current
     * temperature and assigns the result to the variable "cambioKC".
     *
     * @param resta The parameter "resta" is a Double value that represents the
     * amount to be subtracted from the "temperatura" variable.
     */
    public void setCambioKC(Double resta) {
        this.cambioKC = this.temperatura - resta;
    }

    /**
     * The getCambioKF() function returns the value of the cambioKF variable as
     * a Double.
     *
     * @return The method is returning a Double value, which is the value of the
     * variable cambioKF.
     */
    public Double getCambioKF() {
        return cambioKF;
    }

    /**
     * The function calculates the value of cambioKF based on the current
     * temperature, a subtraction, a multiplication, and an addition.
     *
     * @param resta The value to subtract from the current temperature
     * (this.temperatura).
     * @param multiplo The "multiplo" parameter is a value that will be
     * multiplied with the difference between the current temperature and the
     * value of "resta".
     * @param suma The parameter "suma" represents a value that will be added to
     * the result of the calculation.
     */
    public void setCambioKF(Double resta, Double multiplo, Double suma) {
        this.cambioKF = (this.temperatura - resta) * multiplo + suma;
    }

    /**
     * The function "getTemperatura" returns the value of the variable
     * "temperatura" as a Double.
     *
     * @return The method is returning a Double value, which is the temperature.
     */
    public Double getTemperatura() {
        return temperatura;
    }

    /**
     * The function sets the value of the "temperatura" variable.
     *
     * @param temperatura The parameter "temperatura" is of type Double, which
     * means it can hold decimal values. It is used to set the value of the
     * "temperatura" variable in the class.
     */
    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

}
