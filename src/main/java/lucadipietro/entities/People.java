package lucadipietro.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "peoples")
public class People {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String surname;

    private String email;

    private LocalDate birthday;

    private String sex;

    @OneToMany(mappedBy = "people")
    private List<Participation> participations;
}
