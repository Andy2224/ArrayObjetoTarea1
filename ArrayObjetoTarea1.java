/*
Diseñe un algoritmo; de tal manera, que le permita crear una matriz de objetos
como una matriz de elementos de datos de tipo primitivo.
 */
package arrayobjetotarea1;
/**
 *
 * @author Ivan Andres Mogollon Sumarraga
 */
class Paper{
    public int falla;
    public String nombreFallas;
    Paper(int falla, String nombreFallas){
        this.falla=falla;
        this.nombreFallas=nombreFallas;
    }
}
public class ArrayObjetoTarea1 {

    public static void main(String[] args) {

     System.out.println("\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
     System.out.println("\t\t   Sede Latacunga\n");
     System.out.println("Nombre y Apellido: Andrés Mogollón S. ");
     System.out.println("Carrera: Ing.Automotriz");
     System.out.println("Materia: Programacion [7450] ");
     System.out.println("Fecha: 18/07/2020");
     System.out.println("\t\tArray de Objetos\n");

        Paper[]arreglo;
        arreglo=new Paper[11];
        arreglo[0]  =new  Paper  (103, "Vibracion de la Manivela");
        arreglo[1]  =new  Paper  (109, "Fallas Permanentes");
        arreglo[2]  =new  Paper  (112, "Fallas Intermitentes");
        arreglo[3]  =new  Paper  (115, "Fallo del tensor de cadena detectado");
        arreglo[4]  =new  Paper  (118, "fallo del tensor de cadena");
        arreglo[5]  =new  Paper  (121, "Se detectó un fallo del ajustador de pestañas colapsado");
        arreglo[6]  =new  Paper  (124, "Fallo de la tapa de leva detectado");
        arreglo[7]  =new  Paper  (127, "Fallo de piñon de cadena detectado");
        arreglo[8]  =new  Paper  (130, "Falla de chirrido del pistón");
        arreglo[9]  =new  Paper  (133, "Se detectó cojinete faltante");
        arreglo[10] =new  Paper  (136, "caso de referencia");
        for(int i=0;i<arreglo.length;i++)
            System.out.println("El Elemento: "+i+" pertenece a la falla-> "+
                    arreglo[i].falla+" que nos indica:  "+arreglo[i].nombreFallas);
    System.out.println("\n\t Sé un punto de referencia de calidad. ...");
    System.out.println("\t\t\t-Steve Jobs");
    }
}
