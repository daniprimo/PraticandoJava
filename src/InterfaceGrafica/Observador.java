package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//função fecah janela
        janela.setSize(600, 200);//função adpta tamanho da janela
        janela.setLayout(new FlowLayout());//adptar tamaho do botao
        janela.setLocationRelativeTo(null);//Centralizar

        JButton botao = new JButton("Clicar!");//instanciando botao
        janela.add(botao);//adicionando botao na janela
//        botao.addActionListener(new ActionListener() {
//            @Override//funcao que ao aperta o botão realiza a operação
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Evento Ocorreu");
//            }
//        });

        botao.addActionListener(e -> {
            System.out.println("Evento Ocorreu");
        });


        janela.setVisible(true);
    }
}
