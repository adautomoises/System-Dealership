package com.system.dealership.controller;

import com.system.dealership.model.Client;
import com.system.dealership.service.ClientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> getClients(){
        return new ResponseEntity<>(clientService.getClients(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Client> postClient(@RequestBody @Valid Client client){
        return new ResponseEntity<>(clientService.postClient(client), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Client> putClient(@RequestBody @Valid Client client){
        return new ResponseEntity<>(clientService.putClient(client), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteClient(@RequestParam UUID id){
        return new ResponseEntity<>(clientService.deleteClient(id), HttpStatus.OK);
    }
}
