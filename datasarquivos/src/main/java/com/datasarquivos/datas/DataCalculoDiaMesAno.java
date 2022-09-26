package com.datasarquivos.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;  

public class DataCalculoDiaMesAno {
    public static void main(String[] args) throws ParseException {
        
        /* simulando que data vem do banco em formato String */
        
        String data = "21/09/22";
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy",Locale.getDefault());/* Data qualquer */
        Calendar calendar = Calendar.getInstance();/* pega a data atual */
        calendar.setTime(sdf.parse(data));
        calendar.add(Calendar.DAY_OF_MONTH, -40);

        System.out.println("Data: "+data);
        System.out.println("------");
        System.out.println("Data menos 40 dias: "+new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

        calendar.add(Calendar.MONTH, 1);
        System.out.println("------");
        System.out.println("Somando o mes: "+new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

        calendar.add(Calendar.YEAR, 1);
        System.out.println("------");
        System.out.println("Somando 1 ano: "+new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

    }
}
