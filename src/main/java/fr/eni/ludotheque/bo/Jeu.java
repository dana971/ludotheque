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
    @GeneratedValue
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
    private Integer tarifJour;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "JEUX_GENRES",
            joinColumns = @JoinColumn(name="id"),
            inverseJoinColumns = @JoinColumn(name="id"))
    private List<Genre> genre = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NonNull String getTitre() {
        return titre;
    }

    public void setTitre(@NonNull String titre) {
        this.titre = titre;
    }

    public @NonNull String getReference() {
        return reference;
    }

    public void setReference(@NonNull String reference) {
        this.reference = reference;
    }

    public Integer getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(Integer ageMin) {
        this.ageMin = ageMin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public @NonNull Integer getTarifJour() {
        return tarifJour;
    }

    public void setTarifJour(@NonNull Integer tarifJour) {
        this.tarifJour = tarifJour;
    }
}
