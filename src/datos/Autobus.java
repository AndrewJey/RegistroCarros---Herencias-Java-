/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author laboratorio
 */
public class Autobus extends ClsVehiculo {

    private int Capacidad;
    private String Modelo;

    public Autobus() {
        super();
        setCapacidad(0);
        setModelo("");
    }

    public Autobus(int Capacidad, String Modelo, String Marca, int Placa) {
        super(Marca, Placa);
        this.Capacidad = Capacidad;
        this.Modelo = Modelo;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Capacidad: " + getCapacidad() + "\n"
                + "Modelo: " + getModelo() + "\n";
    }

}
