import com.practica.Persona;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    /*Persona persona = new Persona("roberto");
    persona.saludar();*/
    int numero1 = 10;
    int numero2 = 5;
     String palabra="nagato";
    //int resultado = numero1 + numero2; //creacion de breakpoints para poder frenar el codigo, muestra el
    //resultado de todas las variables inicializadas
    int resultado = sumar(numero1, numero2);

    //metodo (ejecutara stepOver)?
     saludar();

    System.out.println(resultado);


}
public static void saludar(){
   System.out.println("hola");
   int n  =213;
   int n2 = 123;
   int suma2 = n + n2;
}
        public static int sumar(int a, int b) {
            int suma = a + b;
            return suma;
        }