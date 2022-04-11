package sn.immoilier.gestion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Proprietaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 255, nullable = false)
    private String nom;
    @Column(length = 255, nullable = false)
    private String adresse;
    @Column(length = 20, nullable = false)
    private int tel;
    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 20, nullable = false)
    private int paiement;
    @Column(length = 150, nullable = false)
    private String moyen;
    @Column(length = 150, nullable = false)
    private String type;
    @OneToMany(mappedBy = "proprietaire")
    private List<Bien> biens = new ArrayList<Bien>();
}
