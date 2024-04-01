package br.com.stockN.stockN.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stockN.stockN.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}