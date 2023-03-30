import java.util.Scanner;

public class reto_7 {
    public static void main(String[] args) {
        int contador=0;
        String nombre, apellido, edad, doc, numdoc,telefono,correo;
        Scanner capturar= new Scanner(System.in);
        do{
            System.out.println("Digite su nombre: ");
            nombre = capturar.next();
            System.out.println("Digite su apellido: ");
            apellido = capturar.next();
            System.out.println("Digite su edad: ");
            edad = capturar.next();
            System.out.println("Digite tipo de documento");
            doc = capturar.next();
            System.out.println("Digite su numero de documento:");
            numdoc = capturar.next();
            System.out.println("Digite su numero de telefono:");
            telefono = capturar.next();
            System.out.println("Digite su correo:");
            correo = capturar.next();

            System.out.println("Listo tus datos registrados son \n");

            System.out.println("Nombre: "+nombre+"\nApellido: " +apellido+"\nEdad: "+edad+"\nDocumento: " +doc +"Numero de documento"+ numdoc+ "\nTelefono: "+telefono+"\nCorreo: "+correo);
            
    
            System.out.println("¿Enviar? (1.Si 2.No)");
            contador = capturar.nextInt();
        }
        while(contador==1);
        capturar.close();
    }
}
