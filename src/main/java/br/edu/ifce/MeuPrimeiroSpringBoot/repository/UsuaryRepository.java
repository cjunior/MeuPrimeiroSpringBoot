package br.edu.ifce.MeuPrimeiroSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.ifce.MeuPrimeiroSpringBoot.model.Usuario;

public interface UsuaryRepository extends JpaRepository<Usuario, Long>{
	
	
	 @Query("select u from Usuario u where u.cpf like :username")
	 Usuario buscarAluno(String username);

}
