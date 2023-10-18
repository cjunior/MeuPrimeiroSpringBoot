package br.edu.ifce.MeuPrimeiroSpringBoot.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import br.edu.ifce.MeuPrimeiroSpringBoot.model.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente,Long>{
	
	@Query("select e from Cliente e  where e.cpf =:cpf ")
	Cliente findbymail(String cpf);
	
	@Query("select e from Cliente e")
	List<Cliente> findAllCliente();
	
	@Query("select e from Cliente e where e.dtNascimento  > :d")
	List<Cliente> findAllByDtNascimento(Date d);
	
	
	
	
	
	
	
	
	
	

}
