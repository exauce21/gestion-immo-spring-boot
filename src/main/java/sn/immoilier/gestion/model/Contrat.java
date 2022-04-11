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
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 255, nullable = false)
    private String datecreation;
    private Date daternvllmnt;
    @Column(length = 25, nullable = false)
    private int montantDE;
    @OneToMany(mappedBy = "contrat")
    private List<Location> locations = new ArrayList<Location>();
}
