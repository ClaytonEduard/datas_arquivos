package com.datasarquivos.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EscrevendoArquivoTxt {
    public static void main(String[] args) throws IOException {
        File arquivo = new File("F:\\PROGRAMACAO2022\\PROJETOS_GITHUB\\datas_arquivos\\arquivosExemplo\\arquivos.txt");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Maria");
        pessoa1.setEmail("pessoa1@gmail.com");
        pessoa1.setIdade(50);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Jose");
        pessoa2.setEmail("pessoa1@gmail.com");
        pessoa2.setIdade(21);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Tulio");
        pessoa3.setEmail("pessoa1@gmail.com");
        pessoa3.setIdade(32);

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        FileWriter escreverArquivo = new FileWriter(arquivo);

        for (Pessoa p : pessoas) {
            escreverArquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade()+"\n"); /* escrevendo */
        }

        escreverArquivo.flush(); /* persistir os dados */
        escreverArquivo.close();/* fechando o arquivo */
    }
}
