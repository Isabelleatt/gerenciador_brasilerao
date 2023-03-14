package com.insper.gerenciadorBrasileirao.Time;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping
    public List<Time> listarTimes() {
        return timeService.listarTimes();
    }

    @PostMapping
    public Time salvarTime(@RequestBody @Valid Time time) {
        return timeService.salvarTime(time);
    }
}
