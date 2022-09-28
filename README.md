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

* Exemplo - TempoObjetoPeriodo

![image](https://user-images.githubusercontent.com/11823640/192267897-bb66c65a-3355-4a15-883f-e7eb34bd1a3e.png)


* Exemplo - DataDiasMesesParcela
-- Data, dias. meses, anos e parcelas

![image](https://user-images.githubusercontent.com/11823640/192278370-3de50fc5-eec6-42b0-b842-adb92a484fbb.png)
