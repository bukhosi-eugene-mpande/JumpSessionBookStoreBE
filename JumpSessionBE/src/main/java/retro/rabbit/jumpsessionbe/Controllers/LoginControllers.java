package retro.rabbit.jumpsessionbe.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import retro.rabbit.jumpsessionbe.Models.Admin;
import retro.rabbit.jumpsessionbe.Models.Login;
import retro.rabbit.jumpsessionbe.Services.LoginService;

import java.util.List;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginControllers {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login-admin")
    public Boolean LoginAdmin(@RequestBody Login login) {
        return loginService.LoginAdmin(login);
    }

}

