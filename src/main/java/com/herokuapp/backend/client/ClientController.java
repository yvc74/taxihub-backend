package com.herokuapp.backend.client;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public void add(@RequestBody ClientDto clientDto) throws ExecutionException, InterruptedException {
        clientService.add(clientDto);
    }

    @PutMapping
    public void update(@RequestBody ClientDto clientDto) {
        clientService.update(clientDto);
    }

    @GetMapping("/profile/{id}")
    public ClientDto getById(@PathVariable Long id) {
        return clientService.getById(id);
    }
}
