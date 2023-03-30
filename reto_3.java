import java.util.Random;
import java.util.Scanner;
//cara y sello
public class reto_3 {
    public static void main(String[] args) {
        Scanner capturar=new Scanner(System.in);
    
        String nombre;
        int numero_min=1;
        int numero_max=2;
        int edad, seleccion;

        Random random = new Random();

        System.out.println("Digiste su nombre");
        nombre=capturar.nextLine();
        System.out.print("Digite su edad:\n");
        edad =capturar.nextInt();

        if (edad<=0){
            System.out.println("Usted no puede jugar ");
         }
            else if (edad<=18) {
                System.out.println("Usted es menor de edad, no puede jugar ");

            }else if (edad>=100){
                System.out.println("usted ya no puede jugar");
            } else{
                System.out.println("error");
            }
            
            System.out.print("Selecione: \n 1cara\n 2sello");
            seleccion= capturar.nextInt();
            if (seleccion==1){
                System.out.println("Se escogio sello");
            }else if ( seleccion==2){
                System.out.println("Se selecciono cara");
            }else{
                System.out.println("intente nuevamente");
            }
             int resultado=random.nextInt(numero_min+numero_max) +1;
             if (seleccion==resultado){
                System.out.println(" muy bien "+nombre+ " la moneda callo "+seleccion+ " ganaste ");
             }else {
                System.out.println("la moneda cayo "+resultado+" asi que gano la maquina ");
             }
             capturar.close();
             
            }
         
        }
    
    
