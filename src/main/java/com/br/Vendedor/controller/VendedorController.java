package com.br.Vendedor.controller;

import com.br.Vendedor.model.Vendedor;
import com.br.Vendedor.service.VendedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class VendedorController {
    private final VendedorService vendedorService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(vendedorService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Vendedor> optionalVendedor = vendedorService.findById(id);
        if(optionalVendedor.isPresent()){
            return ResponseEntity.ok(optionalVendedor.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        vendedorService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Vendedor vendedor){
        Vendedor vendedorSaved = vendedorService.create(vendedor);
        return ResponseEntity.ok(vendedorSaved);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Vendedor vendedor){
        vendedorService.update(vendedor);
        return ResponseEntity.ok().build();
    }
}
