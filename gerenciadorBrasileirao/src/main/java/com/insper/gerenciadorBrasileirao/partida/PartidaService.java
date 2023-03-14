package com.insper.gerenciadorBrasileirao.partida;
import com.insper.gerenciadorBrasileirao.Time.Time;
import com.insper.gerenciadorBrasileirao.Time.TimeService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PartidaService {
    @Autowired
    private PartidaRepository partidaRepository;

    @Autowired
    private TimeService timeService;

    public Partida BurcarPartida(String identifier) {
        return partidaRepository.findByIdentifier(identifier);
    }

    public Partida CriarPartida(Partida partida) {
        Time timeH = timeService.buscarTime(partida.getHome().getIdentifier());
        Time timeA = timeService.buscarTime(partida.getAway().getIdentifier());

        partida.setIdentifier(UUID.randomUUID().toString());
        partida.setHome(timeH);
        partida.setAway(timeA);
        partida.setAttendance(0);
        partida.setScoreHome(0);
        partida.setScoreAway(0);
        partida.setGameDate(LocalDateTime.now());


        return partidaRepository.save(partida);
    }

    public Partida AtualizarPartida(String identifier, Partida partida) {
        Partida partida_original = partidaRepository.findByIdentifier(identifier);

        partida_original.setAttendance(partida.getAttendance());
        partida_original.setScoreAway(partida.getScoreAway());
        partida_original.setScoreHome(partida.getScoreHome());


        return partidaRepository.save(partida_original);
    }

    public List<Partida> ListarPartidas() {
        return partidaRepository.findAll();
    }

}
