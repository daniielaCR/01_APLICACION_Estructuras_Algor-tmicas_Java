import java.util.Random;
import java.util.Scanner;

public class reto_5 {
    public static void main(String[] args) {
        
    Scanner capturar=new Scanner(System.in);
        int num_min;
        int num_max;
        int num_vidas=3, seguir_jugando=0, resultado=0;
        String nombre;
         
        Random random= new Random();
        do { 
        System.out.println("Digite su nombre");
        nombre=capturar.next();
        System.out.println("Digite su edad");
        int edad=capturar.nextInt();

        if(edad<=0){
            System.out.println("Edad incorrecta");
        } else if (edad>=100){ 
            System.out.println("Usted ya no puede jugar");
        }  else { 
            System.out.println("Error");
            
        }  while(num_vidas>=3){ 
            System.out.print("Seleciona: \n piedra\n papel\n tijera\n");
            int seleccionar= capturar.nextInt();
            System.out.println("Se escogio\n "+resultado);
            
    
            if (seleccionar==resultado) {
                System.out.println("Es empate");    
            }else if (seleccionar==1 && resultado==3) {
                System.out.println("Gano "+nombre);
            }else if (seleccionar==2 && resultado==1) {
                System.out.println("Gano "+nombre);
            }else if (seleccionar==3 && resultado==2) {
                System.out.println("Gano "+nombre);
            } else{
                System.out.println("Perdiste");
                num_vidas=num_vidas-1;
            }
        }
        System.out.println("¿Deseas volver a jugar? 1.Si 2.No");
        seguir_jugando = capturar.nextInt();
        if(seguir_jugando==1){   
            System.out.println();
        }else if (seguir_jugando==2) {
            num_vidas = 0;
        }
      
    }
    while(seguir_jugando==1);
    capturar.close();
    
        
    }
        
}
