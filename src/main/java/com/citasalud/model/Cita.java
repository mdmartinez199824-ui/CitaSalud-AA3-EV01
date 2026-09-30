package com.citasalud.model;
/** Modelo de datos de una cita médica. */
public class Cita {
 private Long id;
 private String paciente, documento, especialidad, medico, fecha, hora, estado;
 public Cita() {}
 public Long getId(){return id;} public void setId(Long id){this.id=id;}
 public String getPaciente(){return paciente;} public void setPaciente(String v){paciente=v;}
 public String getDocumento(){return documento;} public void setDocumento(String v){documento=v;}
 public String getEspecialidad(){return especialidad;} public void setEspecialidad(String v){especialidad=v;}
 public String getMedico(){return medico;} public void setMedico(String v){medico=v;}
 public String getFecha(){return fecha;} public void setFecha(String v){fecha=v;}
 public String getHora(){return hora;} public void setHora(String v){hora=v;}
 public String getEstado(){return estado;} public void setEstado(String v){estado=v;}
}