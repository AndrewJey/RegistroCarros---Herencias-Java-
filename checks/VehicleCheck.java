public class VehicleCheck {
 public static void main(String[] args) throws Exception {

 logico.RegistroCarros r=new logico.RegistroCarros();r.AgregarAutomovil("Toyota",1234,"Sedan","Manual");r.AgregarMotocicleta("Honda",1234,125,"Azul");CheckSupport.equal(r.getListadoVehiculos().size(),1);
 r.ModificarAutomovilMarca(1234,"Mazda");CheckSupport.check(r.BuscarAutomovil(1234).contains("Mazda"),"Update vehicle");r.EliminarAutomovil(1234);CheckSupport.equal(r.getListadoVehiculos().size(),0);
 r.AgregarCita("A","Cartago",100);r.AgregarCita("B","San José",200);r.EliminarCita(1);r.AgregarCita("C","Heredia",300);
 CheckSupport.equal(((datos.CitaRiteve)r.getListadoCitas().get(1)).getIdCita(),3);
 java.nio.file.Path file=java.nio.file.Files.createTempFile("gh-citas-", ".dat");
 try{
  CheckSupport.check(r.guardarCitas(file.toFile()).contains("Correctamente"),"Save");logico.RegistroCarros loaded=new logico.RegistroCarros();CheckSupport.check(loaded.AbrirCitas(file.toFile()).contains("Correctamente"),"Load");CheckSupport.equal(loaded.getListadoCitas().size(),2);
  CheckSupport.check(loaded.AbrirCitas(file.toFile()).contains("existentes"),"Repeat import rejected");CheckSupport.equal(loaded.getListadoCitas().size(),2);
  try(java.io.ObjectOutputStream out=new java.io.ObjectOutputStream(java.nio.file.Files.newOutputStream(file))){out.writeObject(new datos.CitaRiteve(50,"Test","Test",1));out.writeObject("wrong-type");}
  loaded.AbrirCitas(file.toFile());CheckSupport.equal(loaded.getListadoCitas().size(),2);
 }finally{java.nio.file.Files.deleteIfExists(file);}

 CheckSupport.done();
 }
}
