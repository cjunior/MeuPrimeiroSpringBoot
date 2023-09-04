package br.edu.ifce.MeuPrimeiroSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.MeuPrimeiroSpringBoot.model.Usuario;

public interface UsuaryRepository extends JpaRepository<Usuario, Long>{

}
