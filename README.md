# Manipulando Datas e Arquivos
Entendendo datas, tempo e período com API DateTime, Leitura e escrita TXT e Excel com Apache POI e JSON com GSON


## 1° Exemplo - DataCalculoDiaMesAno

  ![image](https://user-images.githubusercontent.com/11823640/192775083-6ff1d20b-46d1-4f8f-89e4-669f5c297327.png)

## 2° Exemplo - ComparacaoDatas

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

## 3° Exemplo - FaixaTempoData

  
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

## 4° Exemplo - DatasParcelasMensais

        Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2022");/* Data inicial */
        Calendar cal = Calendar.getInstance(); /* instancio o Calendar */
        cal.setTime(dataInicial); /* passa a data informada */
        for (int i = 1; i <= 12; i++) {
            cal.add(Calendar.MONTH, 1); /* adciona mais um mes de 30 dias */
            System.out.println("--------------------------------");
            System.out.println("Parcela numero: " + i + " vencimento e em: "
                    + new SimpleDateFormat("dd/MM/yyyy").format(cal.getTime()));
        }
        
   ![image](https://user-images.githubusercontent.com/11823640/192778248-b0a4e535-568c-4576-8e3d-6df8c9c5acbe.png)

## 4° Exemolo - NovaApiData

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

   ![image](https://user-images.githubusercontent.com/11823640/192779019-86d23d7f-275f-452c-ad03-0c832136d7e4.png)

## 5° Exemplo - DiaMesAnosSemas
        
        /* API LocalDate */
        LocalDate localDate = LocalDate.now();

        System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Dia da Semana: " + localDate.getDayOfWeek().name());

        System.out.println("Dia do mes: " + localDate.getDayOfMonth());
        System.out.println("Dia do ano: " + localDate.getDayOfYear());

        System.out.println("Mes: " + localDate.getMonth().name());

        System.out.println("Ano: " + localDate.getYear());

   ![image](https://user-images.githubusercontent.com/11823640/192781961-111bd7c8-4cba-49ca-a15e-7554528d5b20.png)

## 6° Exemplo - TempoInstant
        
    public static void main(String[] args) throws ParseException, InterruptedException {
        Instant start = Instant.now();
        Thread.sleep(2000);/* pode ser um processo com tempo qualquer */
        
        Instant out = Instant.now();
        
        Duration duration = Duration.between(start, out);
        
        System.out.println("Duracao em nano segundo: "+duration.toNanos());
        System.out.println("Duracao em minutos: "+duration.toMinutes());
        System.out.println("Duracao em horas: "+duration.toHours());
        System.out.println("Duracao em milis segundo: "+duration.toMillis());
        System.out.println("Duracao em dias: "+duration.toDays());
    
    }
     
   ![image](https://user-images.githubusercontent.com/11823640/192783271-1ffb01f7-22ea-4158-8ff7-c570475cce12.png)


## 7° Exemplo - TempoObjetoPeriodo

     public static void main(String[] args) throws ParseException {
        LocalDate dataAntiga = LocalDate.of(2020, 9, 26);
        // LocalDate dataAntiga = LocalDate.parse("2020-9-26");
        System.out.println("Data Antiga: "+dataAntiga);
        LocalDate dataNova = LocalDate.of(2022, 2, 13);
        // LocalDate dataNova = LocalDate.parse("2022-2-13");
        System.out.println("Data Nova: "+dataNova);
        System.out.println("Data antiga e maior que data nova:  " + dataAntiga.isAfter(dataNova));
        System.out.println("Data antiga e anterior que data nova:  " + dataAntiga.isBefore(dataNova));
        // equals compara os dados, isEqual compara as datas
        System.out.println("Comparacao de data, e igual?   " + dataAntiga.isEqual(dataNova));

        Period perido = Period.between(dataAntiga, dataNova);

        System.out.println("Quantos dias: " + perido.getDays());
        System.out.println("Quantos meses: " + perido.getMonths());
        System.out.println("Total de meses: " + perido.toTotalMonths());
        System.out.println("Quantos anos: " + perido.getYears());

        System.out.println(
                "Periodo e :  " + perido.getYears() + " ano(s)" + perido.getMonths() + " meses " + perido.getDays()
                        + " e dias");
    }
        
   ![image](https://user-images.githubusercontent.com/11823640/192267897-bb66c65a-3355-4a15-883f-e7eb34bd1a3e.png)


## 8° Exemplo - DataDiasMesesParcela

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

   ![image](https://user-images.githubusercontent.com/11823640/192278370-3de50fc5-eec6-42b0-b842-adb92a484fbb.png)
