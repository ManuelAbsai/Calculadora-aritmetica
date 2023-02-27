/* Hacer un programa que muestre la siguiente lista de opciones: 1 sumar dos numeros (preguntar los dos numero), 2 Sacar el factorial, 
3 obtener el cociente de un numero dividido por 20, 4 obtener raiz cuadrada de un numero, 5 obtener la fecha y hora de hoy. 
6 salir, y si no es ninguna volver a preguntar.
 */
import java.util.*; 
import java.time.LocalDateTime;

public class Ejercicio7 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int opcionesNum = 0;
        // 1 variables para suma 
        float numeroSuma1 = 0;
        float numeroSuma2 = 0;
        // 2 variables de favtorial
        int numeroResultadoFacactorial = 1;
        int numeroEntradaFactorial = 0; 
        // 3 variables divisiÃ³n 
        float numeroDivision = 0; 
        // 4 Raiz cuadrada
        double entradaRaiz = 0;
        double resultadoRaiz = 0;
        
            opcionesNum = sc.nextInt();
            switch (opcionesNum) {
                case 1: System.out.println("Ingresa el primer número");
                    numeroSuma1 = sc.nextFloat();
                    System.out.println("Ingrese el segundo número");
                    numeroSuma2 = sc.nextFloat();
                    System.out.println("El resultado de la operaciÃ³n es: " + (numeroSuma1 + numeroSuma2) );
                    break;
                case 2: System.out.println( "Ingrese un número: ");
                    numeroEntradaFactorial = sc.nextInt();
                    for (int i =1; i <= numeroEntradaFactorial; i ++ ){
                        numeroResultadoFacactorial *= i;
                    }
                    System.out.println("El resultado de la opreaciÃ³n es: " + numeroResultadoFacactorial);
                    break;
                case 3: System.out.println(" Introduzca un número: ");
                    numeroDivision = sc.nextFloat();
                    System.out.println("El resultado de la operacion es: " + (numeroDivision / 20)); 
                    break;
                case 4: System.out.println(" Introduzca un número: ");
                    entradaRaiz = sc.nextFloat();
                    resultadoRaiz = Math.sqrt(entradaRaiz);
                    System.out.println("El resultado de la operación es: " + resultadoRaiz ); 
                    break; 
                case 5: LocalDateTime fechayHora = LocalDateTime.now(); 
                    System.out.println(fechayHora);
                    break;
                case 6: Perro mascota = new Perro ("vainilla", "amazul", 11);
                    System.out.println(mascota.descripcion());    
                
                    break;       
            }
        }
        while (opcionesNum <= 0 || opcionesNum >= 7); 
    }
