package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Jeu;
import fr.eni.ludotheque.dal.JeuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JeuService {

    @Autowired
    private JeuRepository jeuRepository;

    public Jeu addJeu(Jeu jeu) {
        return jeuRepository.save(jeu);
    };

    public Jeu findJeu(Integer id) {
        return jeuRepository.findById(id);
    }

    public List<Jeu> findAllJeu(Jeu jeu) {
        return jeuRepository.findAll();
    }

}