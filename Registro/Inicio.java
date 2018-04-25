import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio extends JFrame implements ActionListener
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Inicio
     */
    
    
    JLabel titulo1, titulo2;
    JTextField jugador1, jugador2;
    JButton boton1, boton2;
    
    
    public Inicio()
    {
        // initialise instance variables
        getContentPane().setLayout(new java.awt.GridLayout(3,2,1,1));
        setTitle("Registro de Jugadores");
        setSize(300,180);
        
        
        titulo1 = new JLabel("Jugador 1");
        add(titulo1);
        
        jugador1 = new JTextField();
        add(jugador1);
        
        titulo2 = new JLabel();
        titulo2.setText("Jugador 2");
        add(titulo2);
        
        jugador2 = new JTextField();
        add(jugador2);
        
        boton1 = new JButton("Comenzar");
        boton2 = new JButton("Reiniciar");
        
        
        
        add(boton1);
        add(boton2);
        
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        
        
        
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent e){
        switch (e.getActionCommand()) {
            case "Comenzar":
                System.out.println("Comienza el enfrentamiento entre " +
                jugador1.getText() + " y " + jugador2.getText());
                break;
            case "Reiniciar":
                jugador1.setText("");
                jugador2.setText("");
                break;
            default:
            
        }
        /*
        if (e.getActionCommand().equals("Comenzar")) {
            System.out.println("Estamos comenzando");
        }else if (e.getActionCommand().equals("Reiniciar")) {
            System.out.println("Estamos reiniciando");
        }
        */
    }
    
    
    public void CambiarTamano(Integer x, Integer y) {
        setSize(x,y);
        titulo1.setText("Cambiando tamaño");
        setVisible(true);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


}
