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
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100, nullable = false)
    private String numFacture;
    @Column(length = 20, nullable = false)
    private int avance;
    @Column(length = 20, nullable = false)
    private int arrierees;
    @Column(length = 20, nullable = false)
    private int restant;
    private Date dateFacture;
    @Column(length = 40, nullable = false)
    private int total;
    @ManyToOne
    private Location location = new Location();
}
