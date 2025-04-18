package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "ADDRESSE")
public class Addresse {

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

}
