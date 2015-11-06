/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.Serializable;

/**
 *
 * @author laboratorio
 */
public class CitaRiteve implements Serializable{
    private int IdCita;
    private String Vehiculo;
    private String Lugar;
    private double Costo;

    public CitaRiteve() {
        setIdCita(0);
        setVehiculo("");
        setLugar("");
        setCosto(0.0);
    }

    public CitaRiteve(int IdCita, String Vehiculo, String Lugar, double Costo) {
        this.IdCita = IdCita;
        this.Vehiculo = Vehiculo;
        this.Lugar = Lugar;
        this.Costo = Costo;
    }
    
    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }

    public int getIdCita() {
        return IdCita;
    }

    public void setIdCita(int IdCita) {
        this.IdCita = IdCita;
    }

    public String getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(String Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    @Override
    public String toString() {
        return "IdCita: " + getIdCita() + "\n" +
                "Vehiculo: " + getVehiculo() + "\n" +
                "Lugar: " + getLugar() + "\n" +
                "Costo: " + getCosto() + "\n";
    }
    
    
}
