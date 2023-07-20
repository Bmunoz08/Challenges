/**
 * The line `package co.com.mycompany.classs;` is declaring the package name for the Java class. It
 * specifies the location of the class within the project's directory structure. In this case, the
 * class is being declared in the `co.com.mycompany.classs` package.
 */
package co.com.mycompany.classs;

/**
 * The `import` statements are used to import classes from other packages into
 * the current Java class.
 */
import co.com.mycompany.methods.Solicitud_Tiempo;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Menu Opciones de Tiempo
 *
 * @version 1.0
 * @author BRAYAN
 */
/**
 * The `Menu_Opciones_Tiempo` class displays a menu of time conversion options
 * and performs the selected conversion based on user input.
 */
public class Menu_Opciones_Tiempo {

    /**
     * The code `public Menu_Opciones_Tiempo(){}` is a constructor for the `Menu_Opciones_Tiempo`
     * class. A constructor is a special method that is called when an object of a class is created.
    */
    public Menu_Opciones_Tiempo(){

    }

   /**
    * The `public void menu_opciones_tiempo()` method is defining a method called
    * `menu_opciones_tiempo()` in the `Menu_Opciones_Tiempo` class. This method does not return any
    * value (`void`) and is declared as `public`, which means it can be accessed from other classes.
   */ 
   public void menu_opciones_tiempo() {



        /**
         * The code `Solicitud_Tiempo st = new Solicitud_Tiempo();` creates a
         * new instance of the `Solicitud_Tiempo` class and assigns it to the
         * variable `st`. This allows you to access the methods and properties
         * of the `Solicitud_Tiempo` class.
         */
        Solicitud_Tiempo st = new Solicitud_Tiempo();
        Continuar continuar = new Continuar();

        /**
         * The `try {` block is used to enclose a section of code that may throw
         * an exception. It allows you to handle any exceptions that occur
         * within the block or propagate them to an outer `catch` block for
         * handling. In this specific code, the `try {` block is used to handle
         * any `HeadlessException` that may occur when displaying dialog boxes
         * using `JOptionPane`.
         */
        try {
            /**
             * The code `Object menu_tiempo = JOptionPane.showInputDialog(...)`
             * displays a dialog box with a list of options for the user to
             * choose from. The selected option is stored in the `menu_tiempo`
             * variable.
             */
            Object menu_tiempo = JOptionPane.showInputDialog(
                    null,
                    "Seleccione la opción deseada.",
                    "CONVERTIDOR",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{
                        "Seleccione una opción",
                        "De Segundos a Minutos",
                        "De Segundos a Horas",
                        "De Segundos a Días",
                        "De Minutos a Segundos",
                        "De Minutos a Horas",
                        "De Minutos a Días",
                        "De Hora a Segundos",
                        "De Hora a Minutos",
                        "De Hora a Días",
                        "De Día a Segundos",
                        "De Día a Minutos",
                        "De Día a Horas",
                        "De Año a Segundos",
                        "De Año a Minutos",
                        "De Año a Horas",
                        "De Año a Días"
                    },
                    "opcion 1");

            /**
             * The code `if (menu_tiempo == null) {
             * JOptionPane.showMessageDialog(null, "Programa Finalizado");
             * System.exit(0); }` is checking if the user has clicked the cancel
             * button or closed the dialog box without selecting any option.
             */
            if (menu_tiempo == null) {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                System.exit(0);
            }

            /**
             * The line `String opc = (String) menu_tiempo;` is casting the
             * selected option from the `menu_tiempo` variable to a `String`
             * type. The `menu_tiempo` variable is of type `Object` because it
             * is returned by the `JOptionPane.showInputDialog()` method, which
             * returns an `Object` representing the selected option.
             */
            String opc = (String) menu_tiempo;

            /**
             * The `switch` statement is used to perform different actions based
             * on the value of the `opc` variable. It evaluates the value of
             * `opc` and executes the corresponding case block that matches the
             * value.
             */
            switch (opc) {
                case "Seleccione una opción" -> {
                    JOptionPane.showMessageDialog(
                            null,
                            "Por favor escoge una opción valida.");
                    menu_opciones_tiempo();
                }
                case "De Segundos a Minutos" -> {
                    st.solicitud_tiempo_d(60.0, "Minutos");
                    continuar.continuar_con();
                }
                case "De Segundos a Horas" -> {
                    st.solicitud_tiempo_d(3600.0, "Horas");
                    continuar.continuar_con();
                }
                case "De Segundos a Días" -> {
                    st.solicitud_tiempo_d(86400.0, "Días");
                    continuar.continuar_con();
                }
                case "De Minutos a Segundos" -> {
                    st.solicitud_tiempo_m(60.0, "Segundos");
                    continuar.continuar_con();
                }
                case "De Minutos a Horas" -> {
                    st.solicitud_tiempo_d(60.0, "Horas");
                    continuar.continuar_con();
                }
                case "De Minutos a Días" -> {
                    st.solicitud_tiempo_d(0.000694444, "Días");
                    continuar.continuar_con();
                }
                case "De Hora a Segundos" -> {
                    st.solicitud_tiempo_m(3600.0, "Segundos");
                    continuar.continuar_con();
                }
                case "De Hora a Minutos" -> {
                    st.solicitud_tiempo_m(60.0, "Minutos");
                    continuar.continuar_con();
                }
                case "De Hora a Días" -> {
                    st.solicitud_tiempo_d(0.0416667, "Días");
                    continuar.continuar_con();
                }
                case "De Día a Segundos" -> {
                    st.solicitud_tiempo_m(864000.0, "Segundos");
                    continuar.continuar_con();
                }
                case "De Día a Minutos" -> {
                    st.solicitud_tiempo_m(1440.0, "Minutos");
                    continuar.continuar_con();
                }
                case "De Día a Horas" -> {
                    st.solicitud_tiempo_m(24.0, "Horas");
                    continuar.continuar_con();
                }
                case "De Año a Segundos" -> {
                    st.solicitud_tiempo_m(31557600.0, "Segundos");
                    continuar.continuar_con();
                }
                case "De Año a Minutos" -> {
                    st.solicitud_tiempo_m(525600.0, "Minutos");
                    continuar.continuar_con();
                }
                case "De Año a Horas" -> {
                    st.solicitud_tiempo_m(8760.0, "Horas");
                    continuar.continuar_con();
                }
                case "De Año a Días" -> {
                    st.solicitud_tiempo_m(365.0, "Días");
                    continuar.continuar_con();
                }
                /**
                 * The line `default -> throw new AssertionError();` is the
                 * default case in the switch statement. It is executed when
                 * none of the previous cases match the value of the `opc`
                 * variable.
                 */
                default ->
                    throw new AssertionError();
            }
        } /**
         * The `catch (HeadlessException e)` block is used to handle any
         * `HeadlessException` that may occur when displaying dialog boxes using
         * `JOptionPane`.
         */
        catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema" + e);
        }
    }

}
