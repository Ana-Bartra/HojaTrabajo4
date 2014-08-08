/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 2
 * Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 *Calc.java
 * 
 */
//package calc;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Isa
 */


public class Calc3 {

    public static Stack<String> miStack;
    
    public static void main(String[] args) {

        // TODO code application logic here
        System.out.println("Ingrese El numero de la implementacion a utilziar");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. List");
        
        Scanner sc = new Scanner(System.in);
        
        if (!sc.equals("1") && !sc.equals("2")){
            System.out.println("Ingrese El numero de la implementacion de lista a utilizar");
            System.out.println("1. Simplemente encadenada");
            System.out.println("2. Doblemente encadenada");
            System.out.println("3. Ciruclar"); 
            
            Scanner sclist = new Scanner(System.in);
            
            StackFactory<String> miStackFactory = new StackFactory<String>(); 
            miStack = miStackFactory.getStack(sc.nextLine(),sclist.nextLine());
        }else{
            StackFactory<String> miStackFactory = new StackFactory<String>(); 
            miStack = miStackFactory.getStack(sc.nextLine(), null);
        }
        
        

        int numero;
        double n1;
        double n2;
        
        String sCadenaSinBlancos = "";
        // TODO code application logic here
        //Detección del texto en el que se encuentra la operación
        File f = new File( "src/texto.txt" );
        
        BufferedReader entrada;
        
        try {
       
        entrada = new BufferedReader( new FileReader( f ) );
        String linea;
        
        while(entrada.ready()){
            //Detecta lo que se encuentra en la linea leída del archivo.txt
            linea = entrada.readLine();
            System.out.println(linea);
            linea = linea.substring(0);
            System.out.println(linea);
            numero = linea.length(); 
            //Imprime lo que detecta para verificación
            System.out.println(numero); 
            for (int x=0; x < linea.length(); x++) {
                if (linea.charAt(x) != ' '){
                    //Guarda en una cadena la linea del calculo sin espacios
                    sCadenaSinBlancos += linea.charAt(x);
                }
            }
            //Imprime la linea sin espacios para verificación
            System.out.println(sCadenaSinBlancos);
            
            //Evalúa lo que se encuentra dentro de la linea sin espacios hasta que se haya completado el largo
            for(int x=0; x<sCadenaSinBlancos.length(); x++){
                String dato =  Character.toString(sCadenaSinBlancos.charAt(x));
                //Si el caracter no es una operación se guarda el dato
                if( (dato.equals("+") || dato.equals("-") || dato.equals("*") || dato.equals("/")) != true){
                    miStack.push(dato);
                }
                //Si el caracter es una suma saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("+")){
                    n2 = Double.parseDouble(miStack.pop());
                    n1 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 + n2));
                }
                //Si el caracter es una resta saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("-")){
                    n2 = Double.parseDouble(miStack.pop());
                    n1 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 - n2));
                }
                //Si el caracter es una multiplicacion saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("*")){
                    n2 = Double.parseDouble(miStack.pop());
                    n1 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 * n2));
                }
                //Si el caracter es una division saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("/")){
                    n2 = Double.parseDouble(miStack.pop());
                    n1 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 / n2));
                }
                
            }
            //Impresión de resultado
            System.out.println(miStack.pop());
            
        }
        }catch (IOException e) {
        e.printStackTrace();
        }
    }
    
}
