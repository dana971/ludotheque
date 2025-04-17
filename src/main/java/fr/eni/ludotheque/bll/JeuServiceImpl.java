package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Jeu;
import fr.eni.ludotheque.dal.JeuRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class JeuServiceImpl implements JeuService {

    @NonNull
    private JeuRepository jeuRepository;

    @Override
    public void addJeu(Jeu jeu) {
        jeuRepository.save(jeu);
    }

}
