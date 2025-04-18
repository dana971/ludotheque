package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Jeu;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JeuRepository extends JpaRepository<Jeu, Integer> {
    List<Jeu> getAllByTitre(@NonNull String titre);

    void getAllById(Integer id);
}
