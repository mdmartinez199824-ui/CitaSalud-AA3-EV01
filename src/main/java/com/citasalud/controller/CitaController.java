package com.citasalud.controller;
import com.citasalud.model.Cita;
import com.citasalud.service.CitaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/** Controlador web encargado de registrar y mostrar citas médicas. */
@Controller
public class CitaController {
 private final CitaService servicio;
 public CitaController(CitaService servicio){this.servicio=servicio;}
 @GetMapping("/") public String inicio(Model model){
   model.addAttribute("cita",new Cita());
   model.addAttribute("citas",servicio.listar());
   return "index";
 }
 @PostMapping("/citas") public String registrar(@ModelAttribute Cita cita){
   servicio.guardar(cita); return "redirect:/";
 }
}