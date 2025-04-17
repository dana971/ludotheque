package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "ADDRESSE")
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column(length = 5)
    private Integer no_adresse;

    @NonNull
    @Column(length = 50, nullable = false)
    private String rue;

    @NonNull
    @Column(length = 5, nullable = false)
    private String code_postal;

    @NonNull
    @Column(length = 50, nullable = false)
    private String ville;

    public @NonNull String getRue() {
        return rue;
    }

    public void setRue(@NonNull String rue) {
        this.rue = rue;
    }

    public @NonNull String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(@NonNull String code_postal) {
        this.code_postal = code_postal;
    }

    public @NonNull String getVille() {
        return ville;
    }

    public void setVille(@NonNull String ville) {
        this.ville = ville;
    }
}
