package com.datasarquivos.arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoCsvLinhas {
    public static void main(String[] args) throws FileNotFoundException {

        /* obtendo o caminho do arquivo e nome */
        FileInputStream entraArquivo = new FileInputStream(
                "F:\\PROGRAMACAO2022\\PROJETOS_GITHUB\\datas_arquivos\\arquivosExemplo\\arquivos.csv");

        /* ler linhas */
        Scanner lerArquivo = new Scanner(entraArquivo, "UTF-8");

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        /* ler o arquivo */
        while (lerArquivo.hasNext()) {
            String line = lerArquivo.nextLine();
            if (line != null && !line.isEmpty()) {
                String[] dados = line.split("\\;");
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(dados[0]);
                pessoa.setEmail(dados[1]);
                pessoa.setIdade(Integer.parseInt(dados[2]));
                pessoas.add(pessoa);

            }
        }
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }
    }

}
