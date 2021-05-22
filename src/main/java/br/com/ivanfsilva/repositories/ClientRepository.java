package br.com.ivanfsilva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ivanfsilva.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
