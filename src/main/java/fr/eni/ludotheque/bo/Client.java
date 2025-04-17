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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "client_id") // <- clé étrangère dans Adresse pointant vers Client
    private List<Adresse> adresses;

}
