package Libreria;

public class Consola implements SaidaMensaxe{

    private String mensaxe;

    public Consola(String mensaxe){
        this.mensaxe=mensaxe;
    };

    /**
     * Visualizacion da mensaxe
     */
    @Override
    public void mensaxe(){
        System.out.println("Mensaxe por consola:"+mensaxe);
    }
}
