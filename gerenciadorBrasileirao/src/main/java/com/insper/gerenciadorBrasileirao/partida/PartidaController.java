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
    public Partida criarPartida(@RequestBody @Valid Partida partida) {
        return partidaService.CriarPartida(partida);
    }

    @PutMapping("/{identifier}")
    public Partida atualizarPartida(@PathVariable String identifier, @RequestBody @Valid Partida partida) {

        return partidaService.AtualizarPartida(identifier, partida);
    }
}
