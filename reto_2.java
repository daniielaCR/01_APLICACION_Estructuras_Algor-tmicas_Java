import java.util.Scanner;
//vacuna
public class reto_2 {
    public static void main(String[] args) {
        Scanner capturar=new Scanner(System.in);
        double pesob=0, result=0;
        String bebe, eps, medico, vacuna;

        System.out.println("Didite el nombre del bebe");
        bebe=capturar.nextLine();
        System.out.println("Didite el nombre de la eps");
        eps=capturar.nextLine();
        System.out.println("Didite el nombre del medico");
        medico=capturar.nextLine();
        System.out.println("Didite el nombre de la vacuna");
        vacuna=capturar.nextLine();
        result = (pesob+15)/(pesob*15)*10;

        System.out.print(" El bebe "+bebe);
        System.out.println("De la EPS "+eps);
        System.out.println("Fue atendido" +medico );
        System.out.println("Necesita la vacuna "+vacuna);
        System.out.println("Con la dosis de "+result);

        
        capturar.close();

    }
    
}
