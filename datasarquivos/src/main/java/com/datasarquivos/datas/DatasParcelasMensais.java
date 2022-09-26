package com.datasarquivos.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasParcelasMensais {

    public static void main(String[] args) throws ParseException {

        Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2022");/* Data inicial */

        Calendar cal = Calendar.getInstance(); /* instancio o Calendar */

        cal.setTime(dataInicial); /* passa a data informada */

        for (int i = 1; i <= 12; i++) {
            cal.add(Calendar.MONTH, 1); /* adciona mais um mes de 30 dias */
            System.out.println("--------------------------------");
            System.out.println("Parcela numero: " + i + " vencimento e em: "
                    + new SimpleDateFormat("dd/MM/yyyy").format(cal.getTime()));
        }

    }

}
