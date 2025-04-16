package fr.eni.ludotheque.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CLIENT")
public class Client {
    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Integer id;

    @NonNull
    private String nom;

    @NonNull
    private String prenom;

    @NonNull
    private String email;

    @NonNull
    private String no_telephone;

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
