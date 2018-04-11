package com.herokuapp.backend.corporation;

import com.herokuapp.backend.driver.DriverDto;
import org.apache.catalina.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/corporation")
public class CorporationController {
    private final CorporationService service;

    public CorporationController(CorporationService service) {
        this.service = service;
    }

    @PostMapping("/{id}/driver")
    public DriverDto saveDriver(@RequestBody DriverDto driver, @PathVariable Long id) {
        return service.createDriver(driver, id);
    }

    @PostMapping
    public CorporationDto saveCorpo(@RequestBody CorporationDto corporation) {
        return service.createCorporation(corporation);
    }
}