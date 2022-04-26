/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chavez
 */
public class CuentaHabiente {
    private int idCliente;
    private String nombre;
    private float balance;
    private float monto;

    public CuentaHabiente() {
    }

    public CuentaHabiente(int idCliente, String nombre, float balance, float monto) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
        this.monto = monto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CuentaHabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + ", monto=" + monto + '}';
    }
    
    public void retirarDinero( float monto ){
            float balance = 0;
            float retirarDinero = balance - monto; 
            
            
        System.out.println(retirarDinero);
            
   
    }
    public float EvaluarNivelCliente(){
        float balance = 0;
        if( balance < 50000){
            System.out.println("Cliente Regular");
        }else{
            System.out.println("Cliente Premium");
        }
        return balance;
    
   }
    
    
    
}
