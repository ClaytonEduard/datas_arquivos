package com.datasarquivos.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        File file = new File(
                "F:\\PROGRAMACAO2022\\PROJETOS_GITHUB\\datas_arquivos\\arquivosExemplo\\arquivos_excel.xls");

        /* verifica se o arquivo existe */
        if (!file.exists()) {
            /* cria o arquivo */
            file.createNewFile();
        }

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Maria");
        pessoa1.setEmail("pessoa1@gmail.com");
        pessoa1.setIdade(50);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Jose");
        pessoa2.setEmail("pessoa2@gmail.com");
        pessoa2.setIdade(21);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Tulio");
        pessoa3.setEmail("pessoa3@gmail.com");
        pessoa3.setIdade(32);
        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome("Juliao");
        pessoa4.setEmail("pessoa4@gmail.com");
        pessoa4.setIdade(55);

        
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);

        HSSFWorkbook workbook = new HSSFWorkbook();/* usado para escrever a planilha */
        HSSFSheet linhasPessoa = workbook.createSheet("Planilha de pessoas");/* criar a planilha */

        int numeroLinha = 0;
        for (Pessoa p : pessoas) {
            Row linha = linhasPessoa.createRow(numeroLinha++);/* Criando a linha na planilha */

            int celula = 0;
            Cell celNome = linha.createCell(celula++);/* celula 1 */
            celNome.setCellValue(p.getNome());

            Cell celEmail = linha.createCell(celula++);/* celula 2 */
            celEmail.setCellValue(p.getEmail());

            Cell celIdade = linha.createCell(celula++);/* celula 3 */
            celIdade.setCellValue(p.getIdade());
        }

        FileOutputStream saida = new FileOutputStream(file);
        workbook.write(saida); /* excreve a planilha em arquivo */
        saida.flush();
        saida.close();
        System.out.println("Planilha criada com sucesso!");
    }
}
