package com.datasarquivos.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditandoCelulaNoXLS {

    private static final Logger log = LogManager.getLogger(ApachePoiEditandoCelulaNoXLS.class);


    public static void main(String[] args) throws IOException {

        log.info("Entrando Aplicacao");
        File file = new File(
                "F:\\PROGRAMACAO2022\\PROJETOS_GITHUB\\datas_arquivos\\arquivosExemplo\\arquivos_excel.xls");
        FileInputStream entrada = new FileInputStream(file);

        HSSFWorkbook workbook = new HSSFWorkbook(entrada);/* prepara a entrada do arquivo para ler */

        HSSFSheet planilha = workbook.getSheetAt(0);/* pegando a primeira planilha do arquivo xls */

        /* percorrer as linhas */
        Iterator<Row> linhaIterator = planilha.iterator();

        while (linhaIterator.hasNext()) {
            Row linha = linhaIterator.next();/* Dados da pessoa na linha */

            String valorCelula =  linha.getCell(0).getStringCellValue();
            linha.getCell(0).setCellValue(valorCelula+ "Teste ");

        }
        entrada.close();
        FileOutputStream saida = new FileOutputStream(file);

        log.traceEntry();
        log.error("Logger configurado com sucesso!");
        log.warn("WARN!");
        workbook.write(saida);
        log.info("Log - Planilha Atualizada com sucesso!" + saida.toString());
        saida.flush();
        saida.close();
        System.out.println("Planilha atualizada! - ok");
    }

}
