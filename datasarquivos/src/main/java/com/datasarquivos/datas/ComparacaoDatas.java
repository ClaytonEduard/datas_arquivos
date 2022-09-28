package com.datasarquivos.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class ComparacaoDatas {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dataVencimento = simpleDateFormat.parse("25/09/2022");

        Date dataAtualHoje = simpleDateFormat.parse("20/09/2022");
        /*
         * after: se data 1 e menor que data 2
         * before: se data 1 e maior que data 2
         */
        if (dataVencimento.after(dataAtualHoje)) {
            System.out.println("Boleto nao vencido");
            JOptionPane.showMessageDialog(null, "Boleto não vencido!");
        } else {
            // dataVencimento.before(dataAtualHoje);
            System.out.println("Boleto vencido");
        }
    }
}
