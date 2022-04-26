/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Chavez
 */
public class Pruebaejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Banco de Mexico");
        System.out.println("---------------------------------");
        System.out.println("Informacion de los clientes:");
        String [] nombres = new String [5]; 
        
        nombres[0] = "JUSTIN";
        nombres[1] = "ABRAHAM";
        nombres[2] = "ANGEL";
        nombres[3] = "MIGUEL";   
        nombres[4] = "ROBERTO";
        
        for(String nombre : nombres)
        {

    }
        int [] idCliente = {455763,874256,314525,320015,003143};
        int [] balance = {10000,52800,6000000,23000,2000500};
        
        String JUSTIN     =  ("Dato de Cliente: " + nombres [0] + " ID: " + idCliente [0]+ " Saldo actual: " + balance [0] );
        String ABRAHAM    =  ("Dato de Cliente: " + nombres [1] + " ID: " + idCliente [1]+ " Saldo actual: " + balance [1] );
        String ANGEL      =  ("Dato de Cliente: " + nombres [2] + " ID: " + idCliente [2]+ " Saldo actual: " + balance [2] );
        String MIGUEL     =  ("Dato de Cliente: " + nombres [3] + " ID: " + idCliente [3]+ " Saldo actual: " + balance [3] );
        String ROBERTO    =  ("Dato de Cliente: " + nombres [4] + " ID: " + idCliente [4]+ " Saldo actual: " + balance [4] );
        
        System.out.println(JUSTIN);
        System.out.println(ABRAHAM);
        System.out.println(ANGEL);
        System.out.println(MIGUEL);
        System.out.println(ROBERTO);
        
        String res = "";
        for (int i:balance){
            if( i < 50000){
                res = "Cliente Regular";
            }else{
                res = "Cliente Premium";
            }
        
            System.out.println("-------------------------------------------------------");
            System.out.println( "Niveles  de los clientes:  "  + res );
            
        }
        
    }
    
    
}
