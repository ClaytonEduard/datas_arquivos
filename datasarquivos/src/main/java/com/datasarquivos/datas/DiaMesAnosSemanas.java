package com.datasarquivos.datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiaMesAnosSemanas {
    public static void main(String[] args) throws ParseException {
        /* API LocalDate */
        LocalDate localDate = LocalDate.now();

        System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Dia da Semana: " + localDate.getDayOfWeek().name());

        System.out.println("Dia do mes: " + localDate.getDayOfMonth());
        System.out.println("Dia do ano: " + localDate.getDayOfYear());

        System.out.println("Mes: " + localDate.getMonth().name());

        System.out.println("Ano: " + localDate.getYear());
    }
}
