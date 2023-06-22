package nuevoejemplo;// nombre del paquete
import java.util.Scanner; //importar libreria para entrada de datos
public class Nuevoejemplo { //nombre de la clase principal
@SuppressWarnings("UnusedAssigment")
    public static void main(String[] args) {
        double num1, num2, resultado; //variables a utilizar
        int opcion;
        Scanner sn = new Scanner(System.in);//sn es el nombre del objeto y el system in es para que el usuario ingrese un dato
        
        System.out.print("Hola, soy un asistente virtual. \nPor favor ingrese un numero: ");
        num1 = sn.nextDouble();// sn llamas a scanner .nextdouble solo para dato double
        
        System.out.print("Ingrese el segundo numero: ");
        num2 =  sn.nextDouble();
        
        System.out.println("Los datos ingresados por el usuario son: "+num1+" y "+num2);//agregarle + y + al o la variable que este dentro
        
        System.out.println("ingrese un numero del 1 al 5 de la operacion que desea realizar");
        System.out.println("1. resta");
        System.out.println("2. multiplicacion");
        System.out.println("3. division");
        System.out.println("4. potencia de un numero");
        System.out.println("5. la suma de dos numeros");
        System.out.print("6. raiz cuadrada de un numero: ");
        opcion =sn.nextInt();
        switch(opcion){
            case 1: System.out.print("ingrese el primer numero:");
                     num1 = sn.nextDouble();
                    System.out.print("ingrese el segundo numero:");
                    num2= sn.nextDouble();
                    resultado= num1 - num2;
                    System.out.print("la resta de los dos numero es: "+resultado);
                    break;
                    
                    case 2: System.out.print("ingrese el primer numero:");
                     num1 = sn.nextDouble();
                    System.out.print("ingrese el segundo numero:");
                    num2= sn.nextDouble();
                    resultado= num1 * num2;
                    System.out.print("la multiplicacion de los dos numero es: "+resultado);
                    break;
                    
            
        }
    }
    
}
