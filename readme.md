Repositorio para la cursada de RPA

-   sintaxis de java

    -   declaración de variables:

    ```java
    int foo, bar;
    ```

    -   ingresar datos (con librerias):

        -   [scanner](https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html?is-external=true): Ya viene con java

            ```java
            import java util Scanner;
            public static void main(String[],arg){
                int nota1;
                int nota;
                String nombre;
                String otraVar;
                nota2 = 10;
                Scanner sc = new Scanner(System.in);
                nota1 = sc.nextInt();   //leo enteros
                nombre = sc.nextLine(); //leo string
                otraVar = sc.next();    //TODO: buscar qué lee
            }
            ```

            -   métodos:
                -   nextInt()

        -   tecladoIn: Es una clase externa a java, hay que descargarla e importar.
            Debo crear la carpeta "utilities"

                ```java
                import utilities.TecladoIn

                public static void main(String[],arg){
                    int nota1;
                    nota1 = TecladoIn.readLineInt();
                ```

    -   leer datos:

    ```java
    System.out.print("Hola!" + var)
    System.out.println("Hola!" + var)
    ```

        -
