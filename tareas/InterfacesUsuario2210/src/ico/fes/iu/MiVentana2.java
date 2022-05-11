/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;
package ico.fes.iu;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Chavez
 */
public class MiVentana2 extends Frame{
    private Button boton1;
    private FlowLayout layout;
    private TextField cuadroTexto;
    private Label etiqueta;
    
    
    
    public MiVentana2() throws HeadlessException {
        setTitle("Mi ventana version 2");
        setSize(300,200);
        layout = new FlowLayout();
        setLayout(layout);
        boton1 = new Button("Saludar");
        cuadroTexto = new TextField(15);
        etiqueta = new Label("Valor inicial");
       
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText(cuadroTexto.getText());
                System.out.println("x="+ e.getX());
                System.out.println("y="+ e.getY());
                System.out.println("Que boton?" + e.getButton());
            }
          
        });
        this.cuadroTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                switch(e.getKeyCode()){
                    case KeyEvent.VK_ENTER:
                        System.out.println("Se dio a entender");
                        break;
                    default:
                        System.out.println("Tecla" + e.getKeyChar());
                }
                
            }
            
        
        });
        
          this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
            
            
    
        this.add(boton1);
        this.add(cuadroTexto);
        this.add(etiqueta);
        
        setVisible(true);
    }

    
    
    
}
