public class Citas {
    
public String idCita;
private String fecha;
private String motivo;
private Paciente paciente;
private Doctor doctor;

public void Cita(String idCita, String fecha, String motivo, Paciente paciente, Doctor doctor){
    this.idCita = idCita;
    this.fecha = fecha;
    this.motivo = motivo;
    this.paciente = paciente;
    this.doctor = doctor;
}
public String getIdCita(){
    return idCita;
}
public String getFecha(){
    return fecha;
}
public String getMotivo(){
    return motivo;
}
public Paciente getPaciente(){
    return paciente;
}
public Doctor getDoctor(){
    return doctor;
}

}
