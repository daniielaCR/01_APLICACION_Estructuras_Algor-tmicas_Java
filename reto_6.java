import java.util.Scanner;

public class reto_6 {
    public static void main(String[] args) {
        int i=1,contador=1,seguir=0;
        String  palabra;
        Scanner capturar= new Scanner(System.in);

        System.out.println("Con cuantas palabras desea jugar:\n");
        contador =capturar.nextInt();

            do{
            System.out.println("Las palabras con las que vas a jugar van a ser:\n 1_pera\n2_manzana\n3_fresa\n4_piña\n5_\n6.caballo\n7.burro\n8.pez\n10.ballena ");
  
            System.out.println("Que palabra deseas adivinar");
            palabra = capturar.next();
    
    
            if(palabra.equalsIgnoreCase("piña"))
            {
                System.out.println("Ganaste , la palabra era piña");
                i=contador+1;
            }else{
                    System.out.println("Lo sentimos perdiste");
                }i++;

                
                System.out.println("¿Deseas jugar nuevamente? 1.Si 2.No");
                seguir=capturar.nextInt();
                if(seguir==1){
                
                }
                else if (seguir==2);
            }
                while (seguir==1); 
            
               capturar.close();
            
    }
    
}
