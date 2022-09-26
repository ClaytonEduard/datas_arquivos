package com.datasarquivos.datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class FaixaTempoData {
    public static void main(String[] args) throws ParseException {
        /* total de dias ate uma hoje */
        long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-09-01"), LocalDate.now()); //dias
        System.out.println("---Dias---");
        System.out.println("Possui " + dias + " dias entre a faixa de data");

        long semana = ChronoUnit.WEEKS.between(LocalDate.parse("2021-09-01"), LocalDate.now()); //dias
        System.out.println("---Semanas---");
        System.out.println("Possui " + semana + " semanas entre a faixa de data");

        long meses = ChronoUnit.MONTHS.between(LocalDate.parse("2021-09-01"), LocalDate.now()); //dias
        System.out.println("---Meses---");
        System.out.println("Possui " + meses + " meses entre a faixa de data");

        long anos = ChronoUnit.YEARS.between(LocalDate.parse("2021-09-01"), LocalDate.now()); //dias
        System.out.println("---Anos---");
        System.out.println("Possui " + anos + " anos entre a faixa de data");


    }

}
