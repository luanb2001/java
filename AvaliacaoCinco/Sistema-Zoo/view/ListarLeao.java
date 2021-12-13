package view;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import model.Conexao;
import model.Leao;

public class ListarLeao extends JFrame {

    JButton fechar;
    JLabel nada;
    JLabel emoji;
    JLabel lIdLeao;
    JLabel lNomeLeao;
    JLabel lAlimentacao;
    JLabel lVisitantes;
    JLabel lDescricaoJaula;
    JTextField tIdLeao;
    JTextField tNomeLeao;
    JTextField tAlimentacao;
    JTextField tVisitantes;
    JTextField tDescricaoJaula;

    public ListarLeao() {

        /*lIdLeao = new JLabel("Id do leão", JLabel.LEFT);
        lNomeLeao = new JLabel("Nome do leão", JLabel.LEFT);
        lAlimentacao = new JLabel("Alimentação do leão", JLabel.LEFT);
        lVisitantes = new JLabel("Visitantes do leão", JLabel.LEFT);
        lDescricaoJaula = new JLabel("Descrição da jaula", JLabel.LEFT);*/
        nada = new JLabel("Não tem nada por aqui", JLabel.CENTER);
        emoji = new JLabel("          ¯\\_㋡_/¯          ", JLabel.CENTER);

        /*tIdLeao = new JTextField(15);
        tNomeLeao = new JTextField(15);
        tAlimentacao = new JTextField(15);
        tVisitantes = new JTextField(15);
        tDescricaoJaula = new JTextField(15);*/

        fechar = new JButton("Fechar");
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        /*pane.add(lIdLeao);
        pane.add(tIdLeao);
        pane.add(lNomeLeao);
        pane.add(tNomeLeao);
        pane.add(lAlimentacao);
        pane.add(tAlimentacao);
        pane.add(lVisitantes);
        pane.add(tVisitantes);
        pane.add(lDescricaoJaula);
        pane.add(tDescricaoJaula);*/
        pane.add(nada);
        pane.add(emoji);
        pane.add(fechar);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(200,200);
        this.setVisible(true);
        fechar.setBounds(10,60,100,22);
        fechar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonConfirmaActionPerformed(e);
            }
        });
    }
    
    public void buttonConfirmaActionPerformed(ActionEvent e){
        int ret = JOptionPane.showConfirmDialog(
            this, 
            "Deseja Fechar?",
            "Fechar",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        
        if(ret == JOptionPane.OK_OPTION){/*
            try{
                Connection con = Conexao.getConnection();
                Conexao.selectLeao(
                    con,
                    Integer.parseInt(tIdLeao.getText())
                    tNomeLeao.getText(),
                    Integer.parseInt(tAlimentacao.getText()),
                    Integer.parseInt(tVisitantes.getText()),
                    Integer.parseInt(tDescricaoJaula.getText())
                );
                con.close();
            } catch (Exception err) {
                JOptionPane.showMessageDialog(
                    this,
                    "Erro ao listar Leões: " + err.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
                );
            }*/
            this.dispose();
        }
    }

    public static void main(String[] args){
        ListarLeao janela = new ListarLeao();
    }
}