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

}
