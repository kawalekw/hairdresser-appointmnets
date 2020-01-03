package com.javaretards.hairdresserapponintments.Controller;

import com.javaretards.hairdresserapponintments.Entity.ServiceOption;
import com.javaretards.hairdresserapponintments.Repository.ServiceRepository;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author mateusz
 */
@Controller
@AllArgsConstructor
public class ConfigController {
    private final ServiceRepository sr;
    
    @GetMapping("/services")
    public String viewServicesAction(Model model){
        model.addAttribute("services", sr.findAll());
        return "services";
    }
}
