package com.datasarquivos.datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataDiasMesesParcelasLocalDate {
    public static void main(String[] args) throws ParseException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = "26/09/2022";
        System.out.println();
        LocalDate dataBase = LocalDate.parse(data, formatter);
        System.out.println("Data atual: " + formatter.format(dataBase));
        /* propriedade plus Days */
        System.out.println("Mais 5 dias " + formatter.format(dataBase = dataBase.plusDays(5)));

        System.out.println("Mais 5 semanas " + formatter.format(dataBase = dataBase.plusWeeks(5)));

        System.out.println("Mais 5 anos  " + formatter.format(dataBase = dataBase.plusYears(5)));

        System.out.println("Mais 2 meses " + formatter.format(dataBase = dataBase.plusMonths(2)));

        System.out.println("Menos 1 ano " + formatter.format(dataBase = dataBase.minusYears(1)));

        System.out.println("Menos 1 mes " + formatter.format(dataBase = dataBase.minusMonths(1)));

        System.out.println("Menos 20 dias " + formatter.format(dataBase = dataBase.minusDays(20)));
        System.out.println("----");
        /* Gerando um boleto */
        for (int i = 1; i <= 12; i++) {
            formatter.format(dataBase = dataBase.plusMonths(1));
            System.out.println("Parcela do mes: " + i + " Data: " + formatter.format(dataBase));

        }
    }
}
