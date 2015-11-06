/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author laboratorio
 */
public class Motocicleta extends ClsVehiculo {

    private double Cilindraje;
    private String Color;

    public Motocicleta() {
        super();
        setCilindraje(0.0);
        setColor("");
    }

    public Motocicleta(double Cilindraje, String Color, String Marca, int Placa) {
        super(Marca, Placa);
        this.Cilindraje = Cilindraje;
        this.Color = Color;
    }

    public double getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(double Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Cilindraje: " + getCilindraje() + "\n"
                + "Color: " + getColor() + "\n";
    }

}
