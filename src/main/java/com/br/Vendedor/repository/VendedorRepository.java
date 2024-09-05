package com.br.Vendedor.repository;

import com.br.Vendedor.model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

}
