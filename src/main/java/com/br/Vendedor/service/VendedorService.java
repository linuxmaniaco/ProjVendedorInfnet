package com.br.Vendedor.service;

import com.br.Vendedor.model.Vendedor;

import java.util.List;
import java.util.Optional;

public interface VendedorService {
    Vendedor create(Vendedor vendedor);
    Optional<Vendedor> findById(Long id);
    List<Vendedor> findAll();
    void deleteById(Long id);
    Vendedor update(Vendedor vendedor);
}
