package com.insper.gerenciadorBrasileirao.partida;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PartidaService {
    @Autowired
    private PartidaRepository partidaRepository;

    public Partida BurcarPartida(String identifier) {
        return partidaRepository.findByIdentifier(identifier);
    }

    public Partida CriarPartida(Partida partida) {
        return partidaRepository.save(partida);
    }

    public Partida SalvarPartida(Partida partida) {
        return partidaRepository.save(partida);
    }

    public List<Partida> ListarPartidas() {
        return partidaRepository.findAll();
    }

}
