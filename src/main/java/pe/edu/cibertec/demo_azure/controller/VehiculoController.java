package pe.edu.cibertec.demo_azure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehiculoController {

    @GetMapping("/vehiculo")
    public String obtenerVehiculos(Model model) {
        List<String> listaVehiculos = new ArrayList<String>();

        listaVehiculos.add("Toyota");
        listaVehiculos.add("Ferrari");
        listaVehiculos.add("Nissan");
        listaVehiculos.add("Suzuki");
        listaVehiculos.add("Mate");

        model.addAttribute("vehiculos", listaVehiculos);

        return "index";
    }

}
