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
public class ClsCamion extends ClsVehiculo {

    protected int CapacidadToneladas;
    protected int CantidadEjes;

    public ClsCamion() {
    super();
    }

    public ClsCamion(int CapacidadToneladas, int CantidadEjes, String Marca, int Placa) {
        super(Marca, Placa);
        this.CapacidadToneladas = CapacidadToneladas;
        this.CantidadEjes = CantidadEjes;
    }

    public int getCapacidadToneladas() {
        return CapacidadToneladas;
    }

    public void setCapacidadToneladas(int CapacidadToneladas) {
        this.CapacidadToneladas = CapacidadToneladas;
    }

    public int getCantidadEjes() {
        return CantidadEjes;
    }

    public void setCantidadEjes(int CantidadEjes) {
        this.CantidadEjes = CantidadEjes;
    }

    @Override
    public String toString() {
        return super.toString()+"Capacidad Toneladas" +getCapacidadToneladas()+"\n"+
                "Cantidad Ejes "+getCantidadEjes()+"\n---------------\n";
    }

}
