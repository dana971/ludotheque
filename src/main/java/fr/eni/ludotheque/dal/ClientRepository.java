package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, Integer> {
}
