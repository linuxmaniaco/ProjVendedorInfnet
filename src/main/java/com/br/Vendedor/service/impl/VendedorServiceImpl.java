package com.br.Vendedor.service.impl;

import com.br.Vendedor.model.Vendedor;
import com.br.Vendedor.repository.VendedorRepository;
import com.br.Vendedor.service.VendedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VendedorServiceImpl implements VendedorService {

    private final VendedorRepository vendedorRepository;

    @Override
    public Vendedor create(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    @Override
    public Optional<Vendedor> findById(Long id) {
        return vendedorRepository.findById(id);
    }

    @Override
    public List<Vendedor> findAll() {
        return vendedorRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        vendedorRepository.deleteById(id);
    }

    @Override
    public Vendedor update(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }
}
