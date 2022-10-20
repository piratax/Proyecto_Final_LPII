
package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
       @GetMapping("/admin")
    public String indexAdmin(Model model){
        model.addAttribute("mensaje", "Talleres");
        return "admin/admin";//nos retorna el documento html
    }
}
