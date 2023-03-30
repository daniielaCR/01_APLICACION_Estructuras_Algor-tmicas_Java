import java.util.Scanner;

public class reto_8 {
    public static void main(String[] args) {
        Scanner capturar=new Scanner(System.in);
        int continuar=0;
        int triunfos1=0;
        int triunfos2=0; 
        int vidas1=3, vidas2=3;
        String nombre_1="", nombre_2="";
        
        System.out.println("Ingresa el nombre 1");
        nombre_1 = capturar.next();
        System.out.println("Ingresa el nombre 2");
        nombre_2 = capturar.next();

        do
        {
            System.out.println("Tira los dados");
            System.out.println("Es tu turno " + nombre_1);
            System.out.println();
            System.out.println("Es tu turno " + nombre_2);
            System.out.println();
            int dado1=(int)(Math.random() * 6) + 1, dado2=(int)(Math.random() * 6) + 1;

            if(dado1<dado2){
                System.out.println(nombre_1 + " ha ganado, " + " sacó " + dado1 + " ," + nombre_2 + " pierde una vida");
                vidas2--;
                triunfos1++;
            }else if(dado2>dado1)
                {
                    System.out.println(nombre_2 + " ha ganado, " +  " sacó " + dado1 + " ,"+  nombre_1 +  " gana una vida");
                    vidas1--;
                    triunfos2++;
                }else{
                    System.out.println("error");
                    }
            System.out.println();
            System.out.println("¿Desean seguir jugando? 1.Si 2.No");
            continuar = capturar.nextInt();
        }
        while(continuar==1 && vidas1>0 && vidas2>0);
        System.out.println(nombre_1 + " ganó " + triunfos1 + " ronda/s y quedó con " + vidas1 + " vida/s");
        System.out.println(nombre_2 + " ganó " + triunfos2 + " ronda/s y quedó con " + vidas2 + " vida/s");
        capturar.close();
    }
    
}
