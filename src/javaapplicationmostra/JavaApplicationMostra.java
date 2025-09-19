/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationmostra;

import connect.ConnectFactory;
import java.util.List;
import packageDAO.ClassDAO;
import packageJogo.ClassJogo;

/**
 *
 * @author gabriel
 */
public class JavaApplicationMostra {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ConnectFactory a = new ConnectFactory();
            a.getConnection();
            System.out.println("Conectao com sucesso safado");
        } catch (Exception e) {
            System.out.println("Não ocnectado seu corno");
        }
        
          ClassDAO dao = new ClassDAO();
        List<ClassJogo> jogos = dao.listarJogos();

        for (ClassJogo jogo : jogos) {
            System.out.println("ID: " + jogo.getId());
            System.out.println("Nome: " + jogo.getNome());
            System.out.println("Gênero: " + jogo.getGenero());
            System.out.println("Caminho: " + jogo.getCaminhoJogo());
            System.out.println("------------------------------");
        }
    }
}
