package com.datasarquivos.datas;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class TempoInstant {
    public static void main(String[] args) throws ParseException, InterruptedException {
        Instant start = Instant.now();
        Thread.sleep(2000);/* pode ser um processo com tempo qualquer */
        Instant out = Instant.now();
        Duration duration = Duration.between(start, out);
        System.out.println("Duracao em nano segundo: "+duration.toNanos());
        System.out.println("Duracao em minutos: "+duration.toMinutes());
        System.out.println("Duracao em horas: "+duration.toHours());
        System.out.println("Duracao em milis segundo: "+duration.toMillis());
        System.out.println("Duracao em dias: "+duration.toDays());
    }
}
