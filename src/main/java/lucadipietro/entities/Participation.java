package lucadipietro.entities;


import jakarta.persistence.*;
import lucadipietro.enums.ParticipationState;

import java.util.UUID;

@Entity
@Table(name = "participations")
public class Participation {

    @Id
    @GeneratedValue
    private UUID id;

    private People people;

    private Event event;

    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private ParticipationState participationState;
}
