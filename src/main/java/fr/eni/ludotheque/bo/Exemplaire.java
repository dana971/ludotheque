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
@Table(name = "EXEMPLAIRE")
public class Exemplaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length=13, nullable = false)
    @NonNull private String codebarre;

    @Basic(optional = false)
    @NonNull private boolean louable;

    @ManyToOne
    @JoinColumn(name="jeu_id")
    private Jeu jeu;

}
