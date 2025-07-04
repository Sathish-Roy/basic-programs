package com.example.springmvc.controller;



import com.example.springmvc.entity.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/submitForm")
    public String submitForm(@Valid @ModelAttribute("user") User user,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "form"; // Reload form with error messages
        }
        model.addAttribute("user", user);
        return "success"; // Go to success page if no errors
    }
}

