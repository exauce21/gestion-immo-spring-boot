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
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 255, nullable = false)
    private String nom;
    @Column(length = 255, nullable = false)
    private String prenom;
    @Column(length = 255, nullable = false)
    private String email;
    @Column(length = 25, nullable = false)
    private int tel;
    @Column(length = 255, nullable = false)
    private String nci;
    @OneToMany(mappedBy = "client")
    private List<Location> locations = new ArrayList<Location>();
}
