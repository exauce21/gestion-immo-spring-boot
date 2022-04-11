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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 100)
    private String nom;
    @Column(length = 150)
    private String prenom;
    @Column(length = 100)
    private String email;
    @Column(length = 20)
    private int tel;
    @Column(length = 100)
    private String password;
    @Column(length = 4)
    private int etat;
    @ManyToMany
    private List<Role> roles = new ArrayList<Role>();
}
