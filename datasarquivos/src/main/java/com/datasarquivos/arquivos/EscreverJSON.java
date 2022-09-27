package com.datasarquivos.arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreverJSON {
    public static void main(String[] args) throws IOException {
        /* cria os usuarios */
        Usuario usuario = new Usuario();
        usuario.setNome("Bernardo");
        usuario.setSenha("1234");
        usuario.setCpf("03598745612");
        usuario.setLogin("bernardo");

        Usuario usuario1 = new Usuario();
        usuario1.setNome("Mariana");
        usuario1.setSenha("1254");
        usuario1.setCpf("01234567858");
        usuario1.setLogin("mariana");
        /*--------------*/
        /* adciona os usuarios em uma lista */
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario);
        usuarios.add(usuario1);

        /* cria uma variavel recebendo os dados em Gson com a lista dos users */

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // String jsonUser = new Gson().toJson(usuarios); /*pode fazer assim direto */
        String jsonUser = gson.toJson(usuarios); /* o biulder organiza os valores no console */
        System.out.println(jsonUser);

        /* gravando o arquivos Gson */
        FileWriter fileWriter = new FileWriter(
                "F:\\PROGRAMACAO2022\\PROJETOS_GITHUB\\datas_arquivos\\arquivosExemplo\\filejson.json");

        fileWriter.write(jsonUser);/* escrever o arquivo */
        fileWriter.flush();/* finalizar */
        fileWriter.close();/* fechar o arquivo */

        System.out.println("Gravado com sucesso!");

       
    }
}
