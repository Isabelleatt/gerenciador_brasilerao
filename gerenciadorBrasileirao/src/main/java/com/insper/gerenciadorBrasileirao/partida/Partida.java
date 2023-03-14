package com.insper.gerenciadorBrasileirao.partida;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NonNull
    private Integer scoreHome;

    @NonNull
    private Integer scoreAway;

    @NonNull
    private Integer attendance;
    private LocalDateTime gameDate = LocalDateTime.now();
    private String identifier;


}
