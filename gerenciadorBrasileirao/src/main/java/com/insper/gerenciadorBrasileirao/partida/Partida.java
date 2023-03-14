package com.insper.gerenciadorBrasileirao.partida;


import com.insper.gerenciadorBrasileirao.Time.Time;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer scoreHome;
    private Integer scoreAway;

    private Integer attendance;
    private LocalDateTime gameDate;
    private String identifier;

    @NonNull
    @ManyToOne
    @JoinColumn(name="id_home")
    private Time home;

    @NonNull
    @ManyToOne
    @JoinColumn(name="id_away")
    private Time away;



}
