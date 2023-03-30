import java.util.Scanner;
//reto horno
public class reto_1 {
    public static void main(String[] args) {
        Scanner capturar=new Scanner(System.in);
        int temp;
        double temp_f = 350 ; 
      
        System.out.println("Digita la temp en grados f");
		    temp = capturar.nextInt();
             temp_f=(temp-32)/1.8;
             System.out.println("La temperatura en grados centigrados es: " + temp_f);
             capturar.close();

    }
    
}
