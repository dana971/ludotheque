package fr.eni.ludotheque.controller;

import fr.eni.ludotheque.bo.Jeu;
import fr.eni.ludotheque.bll.JeuService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jeux")
@CrossOrigin(origins = "*") // Pour permettre les appels depuis un front externe
public class JeuController {

    private final JeuService jeuService;

    public JeuController(JeuService jeuService) {
        this.jeuService = jeuService;
    }

    @PostMapping("/jeu")
    public ResponseEntity<Jeu> addJeu(@RequestBody Jeu jeu) {
        try {
            Jeu nouveauJeu = jeuService.addJeu(jeu);
            return new ResponseEntity<>(nouveauJeu, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
