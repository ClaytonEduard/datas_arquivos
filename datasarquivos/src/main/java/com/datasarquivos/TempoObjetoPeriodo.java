package com.datasarquivos;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class TempoObjetoPeriodo {
    public static void main(String[] args) throws ParseException {
        LocalDate dataAntiga = LocalDate.of(2020, 9, 26);
        // LocalDate dataAntiga = LocalDate.parse("2020-9-26");
        LocalDate dataNova = LocalDate.of(2022, 2, 13);
        // LocalDate dataNova = LocalDate.parse("2022-2-13");
        System.out.println("Data atinga e maior que data nova:  " + dataAntiga.isAfter(dataNova));
        System.out.println("Data atinga e anterior que data nova:  " + dataAntiga.isBefore(dataNova));
        // equals compara os dados, isEqual compara as datas
        System.out.println("Comparacao de data:  " + dataAntiga.isEqual(dataNova));

        Period perido = Period.between(dataAntiga, dataNova);

        System.out.println("Quantos dias: " + perido.getDays());
        System.out.println("Quantos meses: " + perido.getMonths());
        System.out.println("Total de meses: " + perido.toTotalMonths());
        System.out.println("Quantos anos: " + perido.getYears());

        System.out.println(
                "Periodo e :  " + perido.getYears() + " ano(s)" + perido.getMonths() + " meses " + perido.getDays()
                        + " e dias");
    }
}
