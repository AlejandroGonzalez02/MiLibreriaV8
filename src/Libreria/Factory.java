package Libreria;

public class Factory {
    public static SaidaMensaxe getProduto(int type, String mensaxe){
        switch (type){
            //tipo consola
            case 1:
                return new Consola(mensaxe);
            case 2:
                return new Ventana(mensaxe);
            default:
                return null;
        }
    }
}
