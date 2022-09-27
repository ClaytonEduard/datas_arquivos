package com.datasarquivos.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiLendo {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        FileInputStream entrada = new FileInputStream(new File(
                "F:\\PROGRAMACAO2022\\PROJETOS_GITHUB\\datas_arquivos\\arquivosExemplo\\arquivos_excel.xls"));

        HSSFWorkbook workbook = new HSSFWorkbook(entrada);/* prepara a entrada do arquivo para ler */

        HSSFSheet planilha = workbook.getSheetAt(0);/* pegando a primeira planilha do arquivo xls */

        /* percorrer as linhas */
        Iterator<Row> linhaIterator = planilha.iterator();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (linhaIterator.hasNext()) { /* enquanto tiver linha no arquivo excel */
            Row linha = linhaIterator.next();/* Dados da pessoa na linha */
            Iterator<Cell> celulas = linha.iterator();

            Pessoa pessoa = new Pessoa();

            while (celulas.hasNext()) { /* enquanto tiver celulas */
                Cell celula = celulas.next();

                switch (celula.getColumnIndex()) {
                    case 0:
                        pessoa.setNome(celula.getStringCellValue());
                        break;
                    case 1:
                        pessoa.setEmail(celula.getStringCellValue());
                        break;
                    case 2:
                        pessoa.setIdade(Double.valueOf(celula.getNumericCellValue()).intValue());
                        break;
                }
            }
            pessoas.add(pessoa);
        }
        entrada.close();/* terminou de ler fecha o arquivo */
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
