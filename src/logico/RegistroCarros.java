/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

import datos.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author laboratorio
 */
public class RegistroCarros {

    private ArrayList ListadoVehiculos = new ArrayList();
    private ArrayList ListadoCitas = new ArrayList();

    public RegistroCarros() {
        setListadoCitas(new ArrayList());
        setListadoVehiculos(new ArrayList());
    }

    public ArrayList getListadoVehiculos() {
        return ListadoVehiculos;
    }

    public void setListadoVehiculos(ArrayList ListadoVehiculos) {
        this.ListadoVehiculos = ListadoVehiculos;
    }

    public ArrayList getListadoCitas() {
        return ListadoCitas;
    }

    public void setListadoCitas(ArrayList ListadoCitas) {
        this.ListadoCitas = ListadoCitas;
    }

    // --------------------------------------
    // METODOS CLASE VEHICULO
    public String BuscarVehiculoPorPlaca(int pPlaca) {
        String Resultado = "Vehículo NO Encontrado";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Automovil) {
                    if (((Automovil) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        Resultado = ((Automovil) ListadoVehiculos.get(i)).toString();
                    }
                }
                if (ListadoVehiculos.get(i) instanceof Autobus) {
                    if (((Autobus) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        Resultado = ((Autobus) ListadoVehiculos.get(i)).toString();
                    }
                }
                if (ListadoVehiculos.get(i) instanceof ClsCamion) {
                    if (((ClsCamion) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        Resultado = ((ClsCamion) ListadoVehiculos.get(i)).toString();
                    }
                }
                if (ListadoVehiculos.get(i) instanceof Motocicleta) {
                    if (((Motocicleta) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        Resultado = ((Motocicleta) ListadoVehiculos.get(i)).toString();
                    }
                }
            }
        }

        return Resultado;
    }

    public String MostrarVehiculos() {
        String Resultado = "";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                Resultado = Resultado + ((ClsVehiculo) ListadoVehiculos.get(i)).toString();
            }
        }

        return Resultado;
    }

    // --------------------------------------
    // METODOS CLASE AUTOMOVIL
    public String AgregarAutomovil(String Marca, int Placa, String Estilo, String Transmision) {
        if (Marca == null || Marca.trim().isEmpty() || Placa <= 0) return "Marca y placa positiva son obligatorias";
        for (Object item : ListadoVehiculos) if (((ClsVehiculo) item).getPlaca() == Placa) return "Ya existe un vehículo con esa placa";


        String Resultado = "";

        ListadoVehiculos.add(new Automovil(Estilo, Transmision, Marca, Placa));
        Resultado = "Automóvil Agregado con Éxito";

        return Resultado;
    }

    public String MostrarAutomoviles() {
        String Resultado = "";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Automovil) {
                    Resultado = Resultado + ((Automovil) ListadoVehiculos.get(i)).toString();
                }
            }
        }

        return Resultado;
    }

    public String BuscarAutomovil(int pPlaca) {

        String Resultado = "Automóvil NO Encontrado";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Automovil) {
                    if (((Automovil) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        Resultado = ((Automovil) ListadoVehiculos.get(i)).toString();
                    }
                }
            }
        }

        return Resultado;
    }

    public String ModificarAutomovilMarca(int pPlaca, String NuevaMarca) {

        String Resultado = "Automóvil NO Encontrado";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Automovil) {
                    if (((Automovil) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        ((Automovil) ListadoVehiculos.get(i)).setMarca(NuevaMarca);
                        Resultado = "Automóvil Modificado con Éxito";
                    }
                }
            }
        }

        return Resultado;
    }

    public String EliminarAutomovil(int pPlaca) {

        String Resultado = "Automovil NO Encontrado";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Automovil) {
                    if (((Automovil) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        ListadoVehiculos.remove(i);
                        Resultado = "Automóvil Eliminado con Éxito ";
                    }
                }
            }
        }

        return Resultado;
    }

    // METODOS CLASE MOTOCICLETA
    public String AgregarMotocicleta(String Marca, int Placa, double Cilindraje, String Color) {
        if (Marca == null || Marca.trim().isEmpty() || Placa <= 0) return "Marca y placa positiva son obligatorias";
        for (Object item : ListadoVehiculos) if (((ClsVehiculo) item).getPlaca() == Placa) return "Ya existe un vehículo con esa placa";


        String Resultado = "";

        ListadoVehiculos.add(new Motocicleta(Cilindraje, Color, Marca, Placa));
        Resultado = "Motocicleta Agregada con Éxito";

        return Resultado;
    }

    public String MostrarMotocicletas() {
        String Resultado = "";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Motocicleta) {
                    Resultado = Resultado + ((Motocicleta) ListadoVehiculos.get(i)).toString();
                }
            }
        }

        return Resultado;
    }

    public String BuscarMotocicleta(int pPlaca) {

        String Resultado = "Motocicleta NO Encontrada";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Motocicleta) {
                    if (((Motocicleta) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        Resultado = ((Motocicleta) ListadoVehiculos.get(i)).toString();
                    }
                }
            }
        }

        return Resultado;
    }

    public String ModificarMotocicletaMarca(int pPlaca, String NuevaMarca) {

        String Resultado = "Motocicleta NO Encontrada";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Motocicleta) {
                    if (((Motocicleta) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        ((Motocicleta) ListadoVehiculos.get(i)).setMarca(NuevaMarca);
                        Resultado = "Motocicleta Modificada con Éxito";
                    }
                }
            }
        }

        return Resultado;
    }

    public String EliminarMotocicleta(int pPlaca) {

        String Resultado = "Motocicleta NO Encontrada";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Motocicleta) {
                    if (((Motocicleta) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        ListadoVehiculos.remove(i);
                        Resultado = "Motocicleta Eliminada con Éxito ";
                    }
                }
            }
        }

        return Resultado;
    }

    // METODOS CLASE AUTOBUS
    public String AgregarAutobus(String Marca, int Placa, int Capacidad, String Modelo) {
        if (Marca == null || Marca.trim().isEmpty() || Placa <= 0) return "Marca y placa positiva son obligatorias";
        for (Object item : ListadoVehiculos) if (((ClsVehiculo) item).getPlaca() == Placa) return "Ya existe un vehículo con esa placa";


        String Resultado = "";

        ListadoVehiculos.add(new Autobus(Capacidad, Modelo, Marca, Placa));
        Resultado = "Autobus Agregado con Éxito";

        return Resultado;
    }

    public String MostrarAutobuses() {

        String Resultado = "";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Autobus) {
                    Resultado = Resultado + ((Autobus) ListadoVehiculos.get(i)).toString();
                }
            }
        }

        return Resultado;
    }

    public String BuscarAutobus(int pPlaca) {

        String Resultado = "Autobus NO Encontrado";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Autobus) {
                    if (((Autobus) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        Resultado = ((Autobus) ListadoVehiculos.get(i)).toString();
                    }
                }
            }
        }

        return Resultado;
    }

    public String ModificarAutobusMarca(int pPlaca, String NuevaMarca) {

        String Resultado = "Autobus NO Encontrado";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Autobus) {
                    if (((Autobus) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        ((Autobus) ListadoVehiculos.get(i)).setMarca(NuevaMarca);
                        Resultado = "Autobus Modificado con Éxito";
                    }
                }
            }
        }

        return Resultado;
    }

    public String EliminarAutobus(int pPlaca) {

        String Resultado = "Autobus NO Encontrado";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Autobus) {
                    if (((Autobus) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        ListadoVehiculos.remove(i);
                        Resultado = "Autobus Eliminado con Éxito ";
                    }
                }
            }
        }

        return Resultado;
    }

    // METODOS CLASE CAMION
    public String AgregarCamion(String Marca, int Placa, int CapacidadToneladas, int CantidadEjes) {
        if (Marca == null || Marca.trim().isEmpty() || Placa <= 0) return "Marca y placa positiva son obligatorias";
        for (Object item : ListadoVehiculos) if (((ClsVehiculo) item).getPlaca() == Placa) return "Ya existe un vehículo con esa placa";


        String Resultado = "";

        ListadoVehiculos.add(new ClsCamion(CapacidadToneladas, CantidadEjes, Marca, Placa));
        Resultado = "Camión Agregado con Éxito";

        return Resultado;
    }

    public String MostrarCamiones() {

        String Resultado = "";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof ClsCamion) {
                    Resultado = Resultado + ((ClsCamion) ListadoVehiculos.get(i)).toString();
                }
            }
        }

        return Resultado;
    }

    public String BuscarCamion(int pPlaca) {

        String Resultado = "Camión NO Encontrado";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof ClsCamion) {
                    if (((ClsCamion) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        Resultado = ((ClsCamion) ListadoVehiculos.get(i)).toString();
                    }
                }
            }
        }

        return Resultado;
    }

    public String ModificarCamionMarca(int pPlaca, String NuevaMarca) {

        String Resultado = "Camión NO Encontrado";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof ClsCamion) {
                    if (((ClsCamion) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        ((ClsCamion) ListadoVehiculos.get(i)).setMarca(NuevaMarca);
                        Resultado = "Camión Modificada con Éxito";
                    }
                }
            }
        }

        return Resultado;
    }

    public String EliminarCamion(int pPlaca) {

        String Resultado = "Camión NO Encontrado";

        if (ListadoVehiculos.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof ClsCamion) {
                    if (((ClsCamion) ListadoVehiculos.get(i)).getPlaca() == pPlaca) {
                        ListadoVehiculos.remove(i);
                        Resultado = "Camión Eliminada con Éxito ";
                    }
                }
            }
        }

        return Resultado;
    }

    // METODOS CLASE CITARITEVE
    public String AgregarCita(String Vehiculo, String Lugar, double Costo) {
        if (Vehiculo == null || Vehiculo.trim().isEmpty() || Lugar == null || Lugar.trim().isEmpty() || !Double.isFinite(Costo) || Costo < 0) return "Datos de cita inválidos";
        int siguiente = 1;
        for (Object item : ListadoCitas) siguiente = Math.max(siguiente, Math.addExact(((CitaRiteve) item).getIdCita(), 1));
        ListadoCitas.add(new CitaRiteve(siguiente, Vehiculo.trim(), Lugar.trim(), Costo));
        return "Cita RITEVE Agregada con Éxito";
    }

    public String MostrarCitas() {

        String Resultado = "";

        if (ListadoCitas.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoCitas.size(); i++) {
                Resultado = Resultado + ((CitaRiteve) ListadoCitas.get(i)).toString();
            }
        }

        return Resultado;
    }

    public String BuscarCitas(int pIdCita) {

        String Resultado = "Cita RITEVE NO Encontrada";

        if (ListadoCitas.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoCitas.size(); i++) {
                if (((CitaRiteve) ListadoCitas.get(i)).getIdCita() == pIdCita) {
                    Resultado = ((CitaRiteve) ListadoCitas.get(i)).toString();
                }

            }
        }

        return Resultado;
    }

    public String ModificarCitaLugar(int pIdCita, String NuevoLugar) {

        String Resultado = "Cita RITEVE NO Encontrada";

        if (ListadoCitas.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoCitas.size(); i++) {
                if (((CitaRiteve) ListadoCitas.get(i)).getIdCita() == pIdCita) {
                    ((CitaRiteve) ListadoCitas.get(i)).setLugar(NuevoLugar);
                    Resultado = "Lugar de Cita RITEVE Modificado con Éxito";
                }
            }
        }

        return Resultado;
    }

    public String EliminarCita(int pIdCita) {

        String Resultado = "Cita RITEVE NO Encontrada";

        if (ListadoCitas.isEmpty()) {
            Resultado = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoCitas.size(); i++) {
                if (((CitaRiteve) ListadoCitas.get(i)).getIdCita() == pIdCita) {
                    ListadoCitas.remove(i);
                    Resultado = "Cita RITEVE Eliminada con Éxito ";
                }
            }
        }

        return Resultado;
    }

    public String guardarCitas(File NombreArchivo) {
        if (NombreArchivo == null) return "No se seleccionó archivo";
        java.nio.file.Path temporal = null;
        try {
            java.nio.file.Path destino = NombreArchivo.toPath().toAbsolutePath();
            temporal = java.nio.file.Files.createTempFile(destino.getParent(), ".citas-", ".tmp");
            try (ObjectOutputStream salida = new ObjectOutputStream(java.nio.file.Files.newOutputStream(temporal))) {
                for (Object cita : ListadoCitas) salida.writeObject((CitaRiteve) cita);
            }
            try { java.nio.file.Files.move(temporal, destino, java.nio.file.StandardCopyOption.ATOMIC_MOVE, java.nio.file.StandardCopyOption.REPLACE_EXISTING); }
            catch (java.nio.file.AtomicMoveNotSupportedException error) { java.nio.file.Files.move(temporal, destino, java.nio.file.StandardCopyOption.REPLACE_EXISTING); }
            return "Archivo Guardado Correctamente";
        } catch (IOException error) { return "Error al guardar el archivo"; }
        finally { if (temporal != null) try { java.nio.file.Files.deleteIfExists(temporal); } catch (IOException ignored) { } }
    }

    public String AbrirCitas(File NombreArchivo) {
        if (NombreArchivo == null) return "No se seleccionó archivo";
        ArrayList<CitaRiteve> recuperadas = new ArrayList<CitaRiteve>();
        java.util.Set<Integer> ids = new java.util.HashSet<Integer>();
        for (Object item : ListadoCitas) ids.add(((CitaRiteve) item).getIdCita());
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(NombreArchivo))) {
            while (true) {
                Object item;
                try { item = entrada.readObject(); } catch (EOFException fin) { break; }
                if (!(item instanceof CitaRiteve)) return "Lectura de un archivo incorrecto";
                CitaRiteve cita = (CitaRiteve) item;
                if (!ids.add(cita.getIdCita())) return "El archivo contiene citas ya existentes";
                recuperadas.add(cita);
            }
        } catch (IOException error) { return "Error al leer el archivo"; }
        catch (ClassNotFoundException error) { return "Lectura de un archivo incorrecto"; }
        ListadoCitas.addAll(recuperadas);
        return "Archivo recuperado Correctamente";
    }

    public String MostrarCitasCartago() {
        String datos = "";
        if (ListadoCitas.isEmpty()) {
            return "Listado citas vacio";
        } else {
            for (int i = 0; i < ListadoCitas.size(); i++) {
                if (((CitaRiteve) ListadoCitas.get(i)).getLugar().equalsIgnoreCase("Cartago")) {
                    if (((CitaRiteve) ListadoCitas.get(i)).getCosto() < 1000) {
                        datos = datos + ((CitaRiteve) ListadoCitas.get(i)).toString();
                    }

                }

            }

        }
        return datos;
    }

    public String MostrarToyota() {
        String datos = "";
        if (ListadoVehiculos.isEmpty()) {
            return "Listado carros vacio";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (((ClsVehiculo) ListadoVehiculos.get(i)).getMarca().equalsIgnoreCase("Toyota")) {
                    int placa = ((ClsVehiculo) ListadoVehiculos.get(i)).getPlaca();
                    String PlacaString = Integer.toString(placa);
                    int tamañoPlaca = PlacaString.length();
                    char ultimonumero = PlacaString.charAt(tamañoPlaca-1);

                    if (ultimonumero == '4') {

                        datos = datos + ((ClsVehiculo) ListadoVehiculos.get(i)).toString();
                    }
                }
            }
        }

        return datos;
    }

    public String MostrarNissan() {

        String datos ="";

        if (ListadoVehiculos.isEmpty()) {
            datos = "Listado Vacío";
        } else {
            for (int i = 0; i < ListadoVehiculos.size(); i++) {
                if (ListadoVehiculos.get(i) instanceof Automovil) {
                    if (((Automovil) ListadoVehiculos.get(i)).getMarca().equalsIgnoreCase("Nissan")) {
                        if (((Automovil) ListadoVehiculos.get(i)).getEstilo().equalsIgnoreCase("Sedan")) {
                            datos = datos + ((Automovil) ListadoVehiculos.get(i)).toString();
                        }
                    }
                }
            }
        }
        return datos;
    }
}
