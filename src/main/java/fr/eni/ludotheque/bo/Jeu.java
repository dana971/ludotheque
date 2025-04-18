package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "JEU")
public class Jeu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column(nullable = false, length = 50)
    private String titre;

    @NonNull
    @Column(nullable = false, length = 13, unique = true)
    private String reference;

    @Column(nullable = true)
    private Integer ageMin;

    @Column(nullable = true, length = 150)
    private String description;

    @Column(nullable = true)
    private Integer duree;

    @NonNull
    @Column(name = "tarif_jour", nullable = false)
    private float tarifJour;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "JEUX_GENRES",
            joinColumns = @JoinColumn(name="jeu_id"),
            inverseJoinColumns = @JoinColumn(name="genre_id"))
    private List<Genre> genre = new ArrayList<>();

    public void addGenre(Genre genre) {
        if (!this.genre.contains(genre)) {
            this.genre.add(genre);
        }
    }

    public boolean hasNoGenre() {
        return this.genre.isEmpty();
    }
}
