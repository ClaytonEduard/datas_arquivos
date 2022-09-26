package com.datasarquivos.datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NovaApiData {

    public static void main(String[] args) throws ParseException {
        /* Nova API de data a partir do Java 8 */

        LocalDate localDate = LocalDate.now();

        System.out.println("Data Atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalTime localTime = LocalTime.now();
        System.out.println("----------------------");
        System.out.println("Hora Atual: " + localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("----------------------");
        System.out.println("Data e hora atual - formato BASIC_ISO_DATE: "
                + localDateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("----------------------");
        System.out.println("Data e hora atual - formato ISO_DATE: " + localDateTime.format(DateTimeFormatter.ISO_DATE));
        System.out.println("----------------------");
        System.out.println(
                "Data e hora atual - formato ISO_DATE_TIME: " + localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("----------------------");
        System.out.println(
                "Data e hora atual - formato ofPattern: "
                        + localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

    }

}
