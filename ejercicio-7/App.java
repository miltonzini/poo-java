public class App {
    /**
 * Crea una clase que represente un aeropuerto. / ok
 *
 * Un aeropuerto se define por:
 *
 * - Id / ok
 * - Nombre / ok
 * - Anio inauguracion / ok
 * - Capacidad / ok
 *
 * El id sera autoincrementado. / ok
 *
 * Encapsula todos sus atributos / ok
 *
 * Crea dos constructores, uno vacio y otro con todos los atributos excepto el id. / ok
 *
 * No se pueden crear instancias de aeropuertos. / ok
 *
 * Las operaciones que se deben implementar todas sus clases hijas son:
 * - gananciasTotales: se le pasa una cantidad y no devuelve nada. / ok
 *
 * Crea una clase que represente a un aeropuerto publico. / ok
 *
 * Además de los atributos de un aeropuerto, se define por:
 * - financiacion / ok
 * - numero de trabajadores discapacitados / ok
 *
 * Encapsula todos sus atributos / ok
 *
 * Crea dos constructores, uno vacio y por defecto / ok
 *
 * Las operaciones que se deben implementar:
 * - gananciasTotales: Dada una cantidad, se le sumara la financiacion y 1000€ por cada trabajador discapacitado  / ok
 *
 * Crea una clase que represente a un aeropuerto privado.  / ok
 *
 * Además de los atributos de un aeropuerto, se define por:
 * - numero de socios / ok
 *
 * Encapsula todos sus atributos / ok
 *
 * Crea dos constructores, uno vacio y otro por defecto
 *
 * Las operaciones que se deben implementar:
 * - gananciasTotales: dada una cantidad, se dividira entre el numero de socios. / ok
 */

    public static void main(String[] args) {

        PublicAirport firstAirport = new PublicAirport("BUE-EZ", 1980, 20000, 10,16);
        PrivateAirport secondAirport = new PrivateAirport("CBA-CB", 1995, 5000, 8);

        System.out.println(firstAirport);
        System.out.println(secondAirport);

        firstAirport.totalEarnings(20000);
        secondAirport.totalEarnings(20000);

    }
}
