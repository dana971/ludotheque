package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "GENRE")
public class Genre {
    @Id
    @GeneratedValue
    private Integer id;

    @NonNull
    @Column(nullable = false, length = 50)
    private String libelle;

    public Genre(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }
}
