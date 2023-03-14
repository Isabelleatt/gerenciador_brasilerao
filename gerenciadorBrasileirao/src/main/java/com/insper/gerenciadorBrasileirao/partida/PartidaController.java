package com.insper.gerenciadorBrasileirao.partida;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")

public class PartidaController {

    @Autowired
    private PartidaService partidaService;

    @GetMapping
    public List<Partida> listarPartidas() {
        return partidaService.ListarPartidas();
    }

    @PostMapping
    public Partida salvarPartida(@RequestBody @Valid Partida partida) {
        return partidaService.SalvarPartida(partida);
    }

    @PutMapping("/{identifier}")
    public Partida atualizarPartida(@PathVariable String identifier, @RequestBody @Valid Partida partida) {
        Partida partidaEncontrada = partidaService.BurcarPartida(identifier);
        partidaEncontrada.setScoreAway(partida.getScoreAway());
        partidaEncontrada.setScoreHome(partida.getScoreHome());
        partidaEncontrada.setAttendance(partida.getAttendance());
        partidaEncontrada.setGameDate(partida.getGameDate());
        partidaEncontrada.setIdentifier(partida.getIdentifier());
        return partidaService.SalvarPartida(partidaEncontrada);
    }
}
