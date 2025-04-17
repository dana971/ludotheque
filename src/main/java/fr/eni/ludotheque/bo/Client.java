package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "CLIENT")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column(length = 50, nullable = false)
    private String nom;

    @NonNull
    @Column(length = 50, nullable = false)
    private String prenom;

    @NonNull
    @Column(unique = true, nullable = false)
    private String email;

    @NonNull
    @Column(unique = true, length = 10, nullable = false)
    private String no_telephone;

    @NonNull
    @OneToOne(cascade = CascadeType.ALL,
            orphanRemoval = true, optional = false,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Adresse adresse;

    public @NonNull String getNom() {
        return nom;
    }

    public void setNom(@NonNull String nom) {
        this.nom = nom;
    }

    public @NonNull String getPrenom() {
        return prenom;
    }

    public void setPrenom(@NonNull String prenom) {
        this.prenom = prenom;
    }

    public @NonNull String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    public @NonNull String getNo_telephone() {
        return no_telephone;
    }

    public void setNo_telephone(@NonNull String no_telephone) {
        this.no_telephone = no_telephone;
    }

}
