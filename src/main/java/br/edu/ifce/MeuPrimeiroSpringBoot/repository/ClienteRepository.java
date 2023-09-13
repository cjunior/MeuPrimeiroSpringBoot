package br.edu.ifce.MeuPrimeiroSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.MeuPrimeiroSpringBoot.model.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente,Long>{

}
