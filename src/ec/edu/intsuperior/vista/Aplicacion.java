/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;


import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Eriik
 */
public class Aplicacion {
    public static void main(String[] args) {
    
    }
    public static void añobisiesto(){
          Scanner sc = new Scanner(System.in);
        int año;
        System.out.println("Introduzca año: ");
        año = sc.nextInt();
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            System.out.println("Es un año bisiesto");
            
        } else {
            System.out.println("No es un año bisiesto");
   
        }
            
        }
    public static void totaldeventas(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de ventas");
        int numVentas=sc.nextInt();
         int sumaVentas=0;
        for (int i=0;i<numVentas;i++){
             System.out.println("Introduce el precio de la venta "+(i+1));
            int venta=sc.nextInt();
             sumaVentas=sumaVentas+venta;
             
        }
           System.out.println(sumaVentas);
     }   
    public static void dialaboral(){
        Scanner leer= new Scanner (System.in);
        
        System.out.println("Introduce un dia de la semana");
        String dia= leer.next();
        
        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia de descanso");
            default:
                System.out.println("Introduce un dia de la semana");
        }
    }
    public static void conversordeTemperatura(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en celsius");
        double celsius = leer.nextDouble();
        double fahrenheit = (celsius * 9/5)+ 32;
        System.out.println("La temperatura en Fahrenheit es"+ fahrenheit);
        
    }    
    public static void CalculadoraIMC(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su peso en kilogramos:");
        int peso = leer.nextInt();
        System.out.println("Ingrese su altura en metros:");
        int altura = leer.nextInt();
        int imc = peso / (altura * altura);
        System.out.println("Su IMC es" + imc);
    }    
    public static void ConversordeMoneda(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en dólares:");
        double dolares = leer.nextDouble();
        double tasaCambio = 19.8;
        double pesos = dolares * tasaCambio;
        System.out.println("$" + dolares + " dólares equivalen a $" + pesos + " pesos");
    }
    public static void nombreYsueldodeEmpleado(){
   
        Scanner leer = new Scanner(System.in);
  
        
        String[] empleados = new String[4];
        double[] sueldos = new double[4];
        
        String nombreMayor;
        double mayorSueldo;

        int i = 0;

        
        System.out.println("Lectura de nombres y sueldos de empleados: ");                                        
        System.out.print("Empleado " + (i + 1) + ": ");
        empleados[i] = leer.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = leer.nextDouble();

        
        mayorSueldo = sueldos[i];
        nombreMayor = empleados[i];

        
        for (i = 1; i < empleados.length; i++) {
            leer.nextLine(); 
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = leer.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = leer.nextDouble();
            
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayor = empleados[i];
            }
        }

      
        System.out.println("Empleado con mayor sueldo: " + nombreMayor );                                         
        System.out.println("Sueldo: " + mayorSueldo);
    }
    public static void contarNumerodePalabras(){
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Introduce una frase: ");
        frase = leer.nextLine();
        StringTokenizer st = new StringTokenizer(frase);
        System.out.println("Numero de palabras: " + st.countTokens());
    }
    public static void pasarNumerosaRomanos(){
         Scanner leer = new Scanner(System.in);
      int N;
      do {
             System.out.print("Introduce un número entre 1 y 3999: ");
             N = leer.nextInt();
      } while (N < 1 || N > 3999);
      System.out.println(N + " en numeros romanos -> " + convertirANumerosRomanos(N));                            
  }
    public static String convertirANumerosRomanos(int numero) {
      int i, miles, centenas, decenas, unidades;
      String romano = "";
      

      miles = numero / 1000;
      centenas = numero / 100 % 10;
      decenas = numero / 10 % 10;
      unidades = numero % 10;

      
      for (i = 1; i <= miles; i++) {
             romano = romano + "M";
      }

      
      if (centenas == 9) {
          romano = romano + "CM";
      } else if (centenas >= 5) {
                 romano = romano + "D";
                 for (i = 6; i <= centenas; i++) {
                      romano = romano + "C";
                 }
      } else if (centenas == 4) {
                 romano = romano + "CD";
      } else {
                 for (i = 1; i <= centenas; i++) {
                      romano = romano + "C";
             }
      }

      
      if (decenas == 9) {
          romano = romano + "XC";
      } else if (decenas >= 5) {
                 romano = romano + "L";
                 for (i = 6; i <= decenas; i++) {
                      romano = romano + "X";
                 }
      } else if (decenas == 4) {
                 romano = romano + "XL";
      } else {
                 for (i = 1; i <= decenas; i++) {
                      romano = romano + "X";
                 }
      }

      
      if (unidades == 9) {
          romano = romano + "IX";
      } else if (unidades >= 5) {
                 romano = romano + "V";
                 for (i = 6; i <= unidades; i++) {                                                           
                      romano = romano + "I";
                 }
      } else if (unidades == 4) {
                 romano = romano + "IV";
      } else {
                 for (i = 1; i <= unidades; i++) {
                      romano = romano + "I";
                 }
      }
      return romano;
    }
    public static void numeroNarcisista(){
        Scanner leer = new Scanner(System.in);
        int N, aux, cifra, numeroCifras = 0;
        double suma;

       
        do {
            System.out.print("Introduce un número entero positivo:");
            N = leer.nextInt();
            if (N <= 0) {
                System.out.println("Error. tiene que ser un número positivo");
            }
        } while (N <= 0);

        
        aux = N;
        while (aux != 0) {
            numeroCifras++;
            aux /= 10;
        }

        suma = 0; 
        aux = N;
        while (aux != 0) {      
            cifra = aux % 10;  
            suma = suma + Math.pow(cifra, numeroCifras);        
            aux /= 10;     
        }

        if (suma == N) { 
            System.out.println("Es un numero narcisista");
        } else {
            System.out.println("No es un numero narcisista");
        }
    }
    public static void verificarNumeroCapicúa(){
        int N, aux, inverso = 0, cifra;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Introduce un numero >= 10: ");
            N = leer.nextInt();
        } while (N < 10);
        aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
        if(N == inverso){
            System.out.println("Es capicúa");
        }else{
            System.out.println("No es capicúa");
        }
    }
    public static void alturaPersonas(){
         Scanner leer = new Scanner(System.in);
        int i, N;
        int contMas = 0, contMenos = 0;
        double media = 0;
  
        
        do{
            System.out.print("Número de personas: ");                                                             
            N = leer.nextInt();
        }while(N<=0);
  
        
        double[] alto = new double[N];
  
        
        System.out.println("Lectura de la altura de las personas: ");
        for (i = 0; i < N; i++) {
            System.out.print("persona " + (i+1) + " = ");
            alto[i] = leer.nextDouble();
            media = media + alto[i];                         
        }
  
        media = media / N;
  
       
        for (i = 0; i < alto.length; i++) {
            if (alto[i] > media){ 
                contMas++;
            } else if (alto[i] < media){ 
                contMenos++;
            }
        }
  
      
        System.out.println("Estatura media: " + media);
        System.out.println("Personas con una estatura superior a la media: " + contMas);
        System.out.println("Personas con una estatura inferior a la media: " + contMenos);    
    }
    public static void millasAkilometros(){
        Scanner leer = new Scanner(System.in);
        int millas;
        double km;
        System.out.println("Convertir millas a kilometros");
        do{
            System.out.println("Introduce millas (0 para finalizar: ");
            millas = leer.nextInt();
            
            if(millas !=0){
                km = millas * 1.6093;
                System.out.printf("%d millas equivalen a %.2f km %n", millas, km);
            }
        }while (millas != 0);
        
    }
    public static void calculadoraPolaca(){
         Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
       
        double operando1;
        double operando2;
        double resultado=0;
  
      
        System.out.println("Escribe el operando 1");
        operando1=leer.nextDouble();
         
        System.out.println("Escribe el signo de operacion");
        String operacion = leer.next();
         
        System.out.println("Escribe el operando 2");
        operando2=leer.nextDouble();
  
        
        switch (operacion){
            case "+":
                resultado=operando1+operando2;
                break;
            case "-":
                resultado=operando1-operando2;
                break;
            case "*":
                resultado=operando1*operando2;
                break;
            case "/":
                resultado=operando1/operando2;
                break;
            case "^":
                resultado=(int)Math.pow(operando1, operando2);
                break;
            case "%":
                resultado=operando1%operando2;
                break;
        }
  
        System.out.println( operando1+" "+operacion+" "+operando2+" = "+resultado);
    }
    public static void circunferencia(){
        int radio;
        final double PI = 3.1416;
        double longitud, area, volumen;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el radio");
        radio = leer.nextInt();
        longitud = 2*PI*radio;
        area = PI*radio*radio;
        volumen = 4/3*PI*Math.pow(radio,3);
        System.out.println("longitud: " + longitud);
        System.out.println("Area: " + area);
        System.out.println("volumen: " + volumen);
    }
    public static void cuentenumerosPositivos(){
        int cuenta = 0;
		int suma = 0;
		int positivos = 0;
		int negativos = 0;
		int A = 0;

		Scanner leer = new Scanner(System.in);

		do {
			System.out.println("Escribe un número: ");
			A = leer.nextInt();
			cuenta++; 
			if (A >= 0)
				positivos++; 
			else
				negativos--;
			suma = suma + A;

		} while (cuenta < 10);
		System.out.println("La suma es: " + suma);
		System.out.println("El número de positivos es: " + positivos);
		System.out.println("El número de negativos es: " + negativos);
    }
    public static void hipotenusaTriangulo(){
        Scanner leer = new Scanner(System.in);
        double cateto1, cateto2;
        System.out.println("Por favor Introduzaca longitud del primer cateto: ");
        cateto1 = leer.nextDouble();
        System.out.println("Ingres la longitud del segundo cateto: ");
        cateto2 = leer.nextDouble();
        System.out.println("Hipotenusa -> " + Math.pow(cateto1, cateto2) + Math.pow(cateto2, 2));
    }
    public static void decimalAbinario(){
        
        int numero, exp, digito;
        double binario;
        Scanner leer = new Scanner(System.in);

        do{ 
            System.out.print("Introduce un numero entero >= 0: ");                                                
            numero = leer.nextInt();
        }while(numero < 0);

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;           
                binario = binario + digito * Math.pow(10, exp);                                                   
                exp++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
    }
    public static void notadeEstudiante(){
                Scanner leer = new Scanner(System.in);
        int n;
        double nota, suma = 0, mayor, menor;;
       
        System.out.println("Nota media, mayor y menor de una clase");
        System.out.println("--------------------------------------");

        do {
            System.out.print("Introduce cual es el numero de alumnos: ");
            n = leer.nextInt();  
        } while (n <= 0);

        System.out.print("Nota del alumno 1: ");
        nota = leer.nextDouble(); 
       
        suma = suma + nota; 
       
        mayor = nota; 
        menor = nota;
       
        for (int i = 2; i <= n; i++) {    
            System.out.print("Nota del alumno " + i + ": ");
            nota = leer.nextDouble();
            suma = suma + nota;
            if (nota > mayor){ 
                mayor = nota;
            } else if (nota < menor) {
                menor = nota;
            }
        }

     
        System.out.printf("Nota media: %.2f %n" , suma/n);
        System.out.println("La mayor nota ha sido un " + mayor);
        System.out.println("La menor nota ha sido un " + menor);

    }
    public static void cuaotasApagar(){
         Scanner leer = new Scanner(System.in);
    double cuota;
    int mensualidades;
    double totalPagado = 0;

    System.out.println("El programa calcula la cuota correspondiente al pago mensual y el total a pagar al final de la financiación  por la compra de un producto.");

    System.out.print("Introduce la primera cuota a pagar: ");
    cuota = leer.nextDouble();
    System.out.print("Introduce el número de meses de financiación: ");
    mensualidades = leer.nextInt();
    
    for (int i=1; i <= mensualidades; i++){
      System.out.println("Cuota "+ i +": "+ cuota);
      totalPagado = totalPagado + cuota;
      cuota = cuota;
    } 

    System.out.println("Total pagado por el producto: " + (int)totalPagado);
    }
    public static void Incognito(){
      Scanner leer = new Scanner(System.in);
    int numeroAleatorio;
    int intento;
    int contador = 10;
    
    numeroAleatorio = (int) (Math.random()*100+1);
    System.out.println("Te atreves a adivinar un número aleatorio entre el 1 y 100. "
        + "solo Tienes 10 intentos.");
    System.out.println();
   
    do {
      System.out.println("Número contador: " + contador);
      System.out.print("Introduce el número que tu creas posible: ");
      intento = leer.nextInt();
      if (intento > numeroAleatorio) {
        System.out.println("El número que buscas es menor, te quedan "
            + (contador-1) + " intentos: ");
      } else if (intento < numeroAleatorio){
        System.out.println("El número que buscas es mayor, te quedan "
            + (contador-1) + " intentos: ");
      } else {
        System.out.print("¡CORRECTO! "+ numeroAleatorio + " era el número que tanto estabas "
            + "buscando, has necesitado " + (10 - (contador-1)) +" intentos.");
      }
      contador--;
    } while (intento != numeroAleatorio && contador > 0);
    if (contador == 0) {
      System.out.println("Tristemente has perdido. El numero aleatorio era " + numeroAleatorio);
    }
}
}
  
  
