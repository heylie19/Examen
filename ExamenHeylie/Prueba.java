
 import java.util.Scanner;
 import java.util.InputMismatchException;
 
 public class Prueba{
     public static void main(String[]args){
         Scanner input = new Scanner(System.in);
         Agua llamar=new Agua("Heylie", 7.9);

         boolean salir = false;
         int res;
 
         while(!salir) {
            System.out.println("Bienvenido");
            System.out.println("Accion que desea Realizar");
             System.out.println("1) Pago cable");
             System.out.println("2) Pago Agua");
             System.out.println("3) Salir");
 
             try{
 
                     System.out.println("R?");
                     res = input.nextInt();
                     
                     switch(res){
                         case 1:
                         Servicio_Cable();

                             break;
                         
                         case 2:
                         llamar.Imprimir();
                             break;
  
                         case 3:
                         salir = true;
                             break;
 
                         default:
                         System.out.println("Ingrese numero del 1 al 3");
                     }
 
                 }
             catch(InputMismatchException e){
                 System.out.println("Debes ser un numero valido");
                 input.next();
             }
         }
         System.out.println("Fin del menu");
     }
     public static void Servicio_Cable()
     {
        Cable Pagoc = new Cable("Heylie", 500);
        
        System.out.printf("Nombre: %s%nEl Total a pagar es: %d%n%n%n",Pagoc.getNombre(),Pagoc.getPagoCable());
     }
 
}