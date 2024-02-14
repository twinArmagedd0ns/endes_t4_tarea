import java.util.ArrayList;

/**
 * Clase usada para representar un automóvil
 * @author Rodrigo Cid Colino
 */
public class Auto {


    /**
     * Atributo que almacena la marca del vehiculo
     */
    private String marca;

    /**
     * Atributo que almacena el modelo del vehiculo
     */
    private String modelo;


    /**
     * Constructor con todos los atributos de la clase Auto
     *
     * @param marca La marca del vehiculo
     *
     * @param modelo El modelo del vehiculo
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    /**
     * Metodo que retorna la marca del vehiculo
     * @return marca del veículo
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo que cambia el valor de marca por el introducido
     * @param marca Nuevo valor de marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }


    /**
     * Metodo que retorna el modelo del vehiculo
     * @return modelo del vehiculo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo que cambia el valor de modelo por el introducido
     * @param modelo Nuevo valor de modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo que devuelve una cadena indicando los datos del objeto
     * @return String con los datos del objeto
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}


