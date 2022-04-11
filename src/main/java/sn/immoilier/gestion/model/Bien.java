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
public class Bien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100, nullable = false)
    private String code;
    @Column(length = 20, nullable = false)
    private int loyer;
    @Column(length = 10, nullable = false)
    private int nombrepeice;
    @Column(length = 255, nullable = false)
    private String photo;
    @Column(length = 10, nullable = false)
    private int superficie;
    @Column(length = 20, nullable = false)
    private String etat;
    @OneToMany(mappedBy = "bien")
    private List<Location> locations = new ArrayList<Location>();
    @ManyToOne
    private Typebien typebien = new Typebien();
    @ManyToOne
    private Proprietaire proprietaire = new Proprietaire();
}
