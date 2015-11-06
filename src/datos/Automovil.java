/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author laboratorio
 */
public class Automovil extends ClsVehiculo {
    
    private String Estilo;
    private String Transmision;

    public Automovil() {
        super();
        setEstilo("");
        setTransmision("");
    }

    public Automovil(String Estilo, String Transmision, String Marca, int Placa) {
        super(Marca, Placa);
        this.Estilo = Estilo;
        this.Transmision = Transmision;
    }
    
    public String getEstilo() {
        return Estilo;
    }

    public void setEstilo(String Estilo) {
        this.Estilo = Estilo;
    }

    public String getTransmision() {
        return Transmision;
    }

    public void setTransmision(String Transmision) {
        this.Transmision = Transmision;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Estilo: " + getEstilo() + "\n" + 
                "Transmisión: " + getTransmision() + "\n";
    }
    
}
