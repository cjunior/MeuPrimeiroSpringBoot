package br.edu.ifce.MeuPrimeiroSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.MeuPrimeiroSpringBoot.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
