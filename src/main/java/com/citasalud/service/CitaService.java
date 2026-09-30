package com.citasalud.service;
import com.citasalud.model.Cita;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
/** Contiene la lógica del módulo y almacena las citas temporalmente en memoria. */
@Service
public class CitaService {
 private final List<Cita> citas = new ArrayList<>();
 private final AtomicLong consecutivo = new AtomicLong(1);
 public List<Cita> listar(){ return new ArrayList<>(citas); }
 public void guardar(Cita cita){
   cita.setId(consecutivo.getAndIncrement());
   if(cita.getEstado()==null || cita.getEstado().isBlank()) cita.setEstado("PROGRAMADA");
   citas.add(cita);
 }
}