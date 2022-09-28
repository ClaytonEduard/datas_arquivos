# Manipulando Datas e Arquivos
Entendendo datas, tempo e período com API DateTime, Leitura e escrita TXT e Excel com Apache POI e JSON com GSON


* Exemplo - DataCalculoDiaMesAno

![image](https://user-images.githubusercontent.com/11823640/192775083-6ff1d20b-46d1-4f8f-89e4-669f5c297327.png)

* Exemplo - ComparacaoDatas

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

* Exemplo - FaixaTempoData

  
        /* total de dias ate uma hoje */
        long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-09-01"), LocalDate.now()); //dias
        System.out.println("---Dias---");
        System.out.println("Possui " + dias + " dias entre a faixa de data");

        long semana = ChronoUnit.WEEKS.between(LocalDate.parse("2021-09-01"), LocalDate.now()); //semana
        System.out.println("---Semanas---");
        System.out.println("Possui " + semana + " semanas entre a faixa de data");

        long meses = ChronoUnit.MONTHS.between(LocalDate.parse("2021-09-01"), LocalDate.now()); //meses
        System.out.println("---Meses---");
        System.out.println("Possui " + meses + " meses entre a faixa de data");

        long anos = ChronoUnit.YEARS.between(LocalDate.parse("2021-09-01"), LocalDate.now()); //anos
        System.out.println("---Anos---");
        System.out.println("Possui " + anos + " anos entre a faixa de data");


   ![image](https://user-images.githubusercontent.com/11823640/192777619-7e2eb252-0b4e-47e5-a49a-3accec37540b.png)


* Exemplo - TempoObjetoPeriodo

![image](https://user-images.githubusercontent.com/11823640/192267897-bb66c65a-3355-4a15-883f-e7eb34bd1a3e.png)


* Exemplo - DataDiasMesesParcela
-- Data, dias. meses, anos e parcelas

![image](https://user-images.githubusercontent.com/11823640/192278370-3de50fc5-eec6-42b0-b842-adb92a484fbb.png)
