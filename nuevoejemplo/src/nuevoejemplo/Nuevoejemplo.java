package nuevoejemplo;// nombre del paquete
import java.util.Scanner; //importar libreria para entrada de datos
public class Nuevoejemplo { //nombre de la clase principal
@SuppressWarnings("UnusedAssigment")
    public static void main(String[] args) {
        double num1, num2, resultado; //variables a utilizar
        Scanner sn = new Scanner(System.in);//sn es el nombre del objeto y el system in es para que el usuario ingrese un dato
        
        System.out.println("Hola, soy un asistente virtual. \nPor favor ingrese un numero");
        num1 = sn.nextDouble();// sn llamas a scanner .nextdouble solo para dato double
        
        System.out.println("Ingrese el segundo numero");
        num2 =  sn.nextDouble();
        
        System.out.println("Los datos ingresados por el usuario son: "+num1+" y "+num2);//agregarle + y + al o la variable que este dentro
    }
    
}
