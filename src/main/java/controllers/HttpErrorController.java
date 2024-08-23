package controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HttpErrorController implements ErrorController {
    @RequestMapping("/error")
    public String handleError(
            Model model,
            @RequestParam("error") String errorCode,
            @RequestParam("error_description") String errorDescription
    ){

        model.addAttribute("errorCode", errorCode);
        model.addAttribute("errorDescription", errorDescription);

        return "error";
    }
}
