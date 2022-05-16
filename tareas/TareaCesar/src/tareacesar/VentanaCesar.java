/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacesar;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Chavez
 */
public class VentanaCesar extends JFrame{
    FlowLayout Layout;
    JTextField E1;
    JTextField E2;
    JButton Boton;
    JLabel Salida;
    JLabel et1;
    JLabel et2;
    JLabel et3;

   public VentanaCesar() throws HeadlessException  {
        
       this.setTitle("codigo cesar");
       this.setSize(980, 230);
       this.pack();
       this.setVisible(true);
       Layout = new FlowLayout();
       this.setLayout(Layout);
       E1 = new JTextField(10);
       E2 = new JTextField(10);
       et1 = new JLabel("Clave de desplazamiento");
       et2 = new JLabel("Ingrese un mensaje:");
       et3 = new JLabel("Mensaje cifrado:");
       Salida = new JLabel("");
       Boton = new JButton("Cifrar");
       
this.getContentPane().add( et1 );
        this.getContentPane().add( E1 );
        this.getContentPane().add( et2 );
        this.getContentPane().add( E2 );
        this.getContentPane().add( et3 );
        this.getContentPane().add( Salida );
        this.getContentPane().add( Boton );
        
         this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
       
            }    
        });
        this.Boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String abecedary = "abcdefghijklmnñopqrstuvwxyz";
                int llave = Integer.parseInt(E1.getText());
                String letraPlana = E2.getText();
                String letraEncriptada = "";
                
        for (int i = 0; i < letraPlana.length (); i++){
        for(int j = 0 ; j < abecedary.length() ; j ++){
             if(letraPlana.charAt(i) == abecedary.charAt(j)){
             if( j + llave < 0){
              letraEncriptada += abecedary.charAt(abecedary.length() + (llave -j));
              }
              else{
              letraEncriptada += abecedary.charAt( j + llave);
          }
           }
         }}

                Salida.setText(letraEncriptada);
                
                
            }
        });
            
    }
}