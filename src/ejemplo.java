/** Comentarios javadoc. Permiten extraer información del código directamente, para generar documentación  */
import java.util.Scanner;
class Main { //El nombre de la clase inicia con mayúscula.
  public static void main(String[] args){
    /*Método main. Obligatorio y debe estar definido con public static void, y tomar String=[] args
    el nombre del método/función inicia con minúscula
    */

    //Declaraciones
    int variable = 4; //declaro variable
    String texto = "";
    final int constante = 4; // las constantes se declaran agregando "final"
    
    Scanner myObj = new Scanner(System.in); //inicializo objeto del scanner
    System.out.println("Ingresá texto");
    texto = myObj.nextLine(); //leo STRING input
    myObj.close();  //cierro el objeto del scanner
    System.out.println(texto);
    System.out.println("Imprimo variable: " + variable);
    System.out.println("Imprimo constante: " + constante); 
    //TecladoIn.readLine //no existe en java nativo
  }
}