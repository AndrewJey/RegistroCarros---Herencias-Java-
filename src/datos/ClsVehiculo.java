/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author laboratorio
 */
public class ClsVehiculo {

    protected String Marca;
    protected int Placa;

    public ClsVehiculo() {
        setMarca("");
        setPlaca(0);
    }

    public ClsVehiculo(String Marca, int Placa) {
        this.Marca = Marca;
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getPlaca() {
        return Placa;
    }

    public void setPlaca(int Placa) {
        this.Placa = Placa;
    }

    @Override
    public String toString() {
        return "Marca " + getMarca() + "\n"
                + "Placa " + getPlaca() + "\n------------------------\n";
    }

}
