import java.util.Scanner;
import java.util.Random;
//piedra papel o tijera
public class reto_4 {
    public static void main(String[] args) {
        Scanner capturar=new Scanner(System.in);
        int num_min = 1;
		int num_max = 2;
        int edad;
        int seleccionar;
        String nombre;
		Random random = new Random();

        System.out.print("Digite nombre:\n");
        nombre= capturar.nextLine();
        System.out.print("Digite la edad:\n");
        edad =capturar.nextInt();

        if (edad<=0) {
            System.out.print("Edad incorrecta:\n");

        }else if (edad>=100) {
            System.out.print("Usted ya no deberia de estar jugando este juego:\n"); 

        }else  {
            System.out.println("resultado icorrecto");
        }

        System.out.print("Selecione: \n 1piedra\n 2papel\n 3tijera\n");
        seleccionar= capturar.nextInt();

        int resultado = random.nextInt(num_max + num_min )+ num_min;
        System.out.println("Se escogio escogio\n "+resultado);
        

        if (seleccionar==resultado) {
            System.out.println("Es empate");    
        }
        else if (seleccionar==1 && resultado==3) {
            System.out.println("Gano "+nombre);
        }
        else if (seleccionar==2 && resultado==1) {
            System.out.println("Gano "+nombre);
        }
        else if (seleccionar==3 && resultado==2) {
            System.out.println("Gano "+nombre);
        }
        else{
            System.out.println("Perdiste");
        }
        capturar.close();
        
    }
    
}
