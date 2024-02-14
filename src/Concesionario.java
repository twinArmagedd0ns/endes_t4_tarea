import java.util.ArrayList;

/**
 * Clase usada para representar un concesionario
 * @author Rodrigo Cid Colino
 */
public class Concesionario {


    /**
     * Atributo que almacena objetos de la clase Auto
     */
    private ArrayList<Auto> autos;

    /**
     * Constructor sin atributos que inicializa el atributo autos
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Método para añadir elementos a la lista autos
     *
     * @param auto Objeto a añadir a la lista
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Método que devuelve la lista autos
     * @return lista autos
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Método que imprime por pantalla todos los elementos de la lista autos
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}

