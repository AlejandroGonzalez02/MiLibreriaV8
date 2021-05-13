package Libreria;

import javax.swing.*;

public class Ventana implements SaidaMensaxe{

    private String mensaxe;
    public Ventana(String mensaxe){
        this.mensaxe=mensaxe;
    }

    /**
     * Visualizacion da mensaxe
     */
    @Override
    public void mensaxe(){
        JOptionPane.showInputDialog(null,"Mensaxe por ventana:"+mensaxe);
    }
}
