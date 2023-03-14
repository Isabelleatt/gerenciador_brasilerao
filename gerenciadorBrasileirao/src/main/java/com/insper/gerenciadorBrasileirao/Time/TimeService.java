package com.insper.gerenciadorBrasileirao.Time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService {
    @Autowired
    private TimeRepository timeRepository;

    public Time salvarTime(Time time) {
        return timeRepository.save(time);
    }

    public Time buscarTime(String identifier) {
        return timeRepository.findByIdentifier(identifier);
    }

    public List<Time> listarTimes() {
        return timeRepository.findAll();
    }



}
