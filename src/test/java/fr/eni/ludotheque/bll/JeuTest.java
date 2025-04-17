package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Genre;
import fr.eni.ludotheque.bo.Jeu;
import fr.eni.ludotheque.dal.JeuRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class JeuTest {

    @Autowired
    private JeuRepository jeuRepository;

    @Test
    @DisplayName("test création jeu et liens vers genres CAS POSITIF")
    @Transactional
    public void testCreationJeu() {
        //Arrange
        Jeu jeu = new Jeu("SkyJo", "refSkyJo", 2 );
        jeu.setAgeMin(8);
        jeu.setDescription("Le but du jeu est simple : marquer le moins de points possible. Chaque joueur reçoit 12 cartes, et l'objectif est de former des séries de cartes de même valeur tout en éliminant les cartes indésirables. Le joueur avec le moins de points à la fin de la partie remporte la victoire.");
        jeu.addGenre(new Genre(1, "Cartes"));

        //Act
        jeuRepository.save(jeu);

        //Assert
        assertThat(jeu.getNoJeu()).isFalse();

    }

}
