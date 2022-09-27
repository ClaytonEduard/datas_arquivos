package com.datasarquivos.arquivos;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class LendoJSON {
    public static void main(String[] args) throws IOException {

        /* lendo os dado arquivo */
        FileReader fileReader = new FileReader(
                "F:\\PROGRAMACAO2022\\PROJETOS_GITHUB\\datas_arquivos\\arquivosExemplo\\filejson.json");

        /* pegando os dados do arquivo */
        JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);

        /* criando a lista de usuario */
        List<Usuario> listUsuarios = new ArrayList<Usuario>();

        /* para cada elemento no gson */
        for (JsonElement jsonElement : jsonArray) {
            /* converte para um objeto do tipo usuario */
            Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
            /* adcionando na lista de user  */
            listUsuarios.add(usuario);

        }

        System.out.println(listUsuarios);

    }
}
