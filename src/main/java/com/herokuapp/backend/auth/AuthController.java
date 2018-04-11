package com.herokuapp.backend.auth;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AuthController {

    @GetMapping("denied")
    public void forbidenError() {
       throw new AccessDeniedException("Access forbiden");
    }

}
