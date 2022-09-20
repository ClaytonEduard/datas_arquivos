package com.datasarquivos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

    public static void main(String[] args) throws ParseException {
        //Biblioteca usada por sistemas antigos
        Date date = new Date();
        //Biblioteca mais atual
        Calendar calendar = Calendar.getInstance();

        System.out.println("|-------------------------------------------------------|");
        System.out.println(" Data em milisegndos: " + date.getTime());
        System.out.println(" Calendar em milisegndos: " + calendar.getTimeInMillis());
        System.out.println("|-------------------------------------------------------|");

        System.out.println(" Dia do Mes: " + date.getDate());
        System.out.println(" Calendar dia do Mes: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("|-------------------------------------------------------|");

        System.out.println(" Dia do Semana: " + date.getDay());
        System.out.println(" Calendar dia da Senama: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
        System.out.println("|-------------------------------------------------------|");

        System.out.println(" Hora do dia: " + date.getHours());
        System.out.println(" Calendar hora do dia: " + calendar.get(Calendar.HOUR));
        System.out.println("|-------------------------------------------------------|");

        System.out.println(" Minuto da Hora: " + date.getMinutes());
        System.out.println(" Calendar minuto da hora: " + calendar.get(Calendar.MINUTE));
        System.out.println("|-------------------------------------------------------|");

        System.out.println(" Segundos da Hora: " + date.getSeconds());
        System.out.println(" Calendar segundos da hora: " + calendar.get(Calendar.SECOND));
        System.out.println("|-------------------------------------------------------|");

        System.out.println(" Ano: " + (date.getYear() + 1900));
        System.out.println(" Calendar Ano: " + calendar.get(Calendar.YEAR));
        System.out.println("|-------------------------------------------------------|");

        System.out.println("|------------------Simple Data Format-------------------|");
        System.out.println("|-------------------------------------------------------|");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println(" Data atual formato padrao String: " + simpleDateFormat.format(date));
        System.out.println(
                " Calendar atual formato padrao String: " + simpleDateFormat.format(Calendar.getInstance().getTime()));
        System.out.println("|-------------------------------------------------------|");

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(" Data em formato para banco: " + simpleDateFormat.format(date));
        System.out.println(
                " Calendar formato para banco: " + simpleDateFormat.format(Calendar.getInstance().getTime()));
        System.out.println("|-------------------------------------------------------|");
    }

};
