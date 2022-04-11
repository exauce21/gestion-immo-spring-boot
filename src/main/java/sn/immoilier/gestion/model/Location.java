package sn.immoilier.gestion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 11, nullable = false)
    private String code;
    private Date dateentree;
    @Column(length = 11, nullable = false)
    private int caution;
    @ManyToOne
    private Client client = new Client();
    @ManyToOne
    private Bien bien = new Bien();
    @OneToMany(mappedBy = "location")
    private List<Facture> factures = new ArrayList<Facture>();
    @ManyToOne
    private Contrat contrat = new Contrat();
}
