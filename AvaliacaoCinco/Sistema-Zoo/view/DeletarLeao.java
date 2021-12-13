package view;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import model.Conexao;

public class DeletarLeao extends JFrame {
    
    JButton deletar;
    JButton cancelar;

    JLabel leao;
    JLabel alimentacao;
    
    JTextField idleao = new JTextField(20);
    JTextField idalimentacao = new JTextField(20);

    public DeletarLeao() {

        deletar = new JButton("Realizar mata leão");
        cancelar = new JButton("Cancelar");
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT));

        leao = new JLabel("ID Leão");
        alimentacao = new JLabel("ID da Alimentação deste Leão");
        

        pane.add(leao); 
        pane.add(idleao);
        
        pane.add(alimentacao); 
        pane.add(idalimentacao);

        pane.add(deletar);
        pane.add(cancelar);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(265,250);
        this.setVisible(true);
        cancelar.setBounds(10,60,100,22);
        cancelar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                cancelarConfirmaActionPerformed(e);
            }
        });

        deletar.setBounds(10,60,100,22);
        deletar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                deletarConfirmaActionPerformed(e);
            }
        });
    }

    public void cancelarConfirmaActionPerformed(ActionEvent e){
        int ret = JOptionPane.showConfirmDialog(
            this, 
            "Deseja Cancelar?",
            "Cancelar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        
        if(ret == JOptionPane.OK_OPTION){
            this.dispose();
        }
    }

    public void deletarConfirmaActionPerformed(ActionEvent e){
        int ret = JOptionPane.showConfirmDialog(
            this, 
            "Deseja mesmo realizar o mata leão? :(",
            "Deletar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if(ret == JOptionPane.OK_OPTION) {
            try{
                Connection con = Conexao.getConnection();
                Conexao.deleteAlimentacao(
                    con,
                    Integer.parseInt(idalimentacao.getText())
                );
                con.close();
            } catch (Exception err) {
                JOptionPane.showMessageDialog(
                    this,
                    "Erro ao deletar Alimentação: " + err.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
                );
            }
            try{
                Connection con = Conexao.getConnection();
                Conexao.deleteLeao(
                    con,
                    Integer.parseInt(idleao.getText())
                );
                con.close();
            } catch (Exception err) {
                JOptionPane.showMessageDialog(
                    this,
                    "Erro ao deletar Leão: " + err.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
                );
            }
            this.dispose();
        }
    }

    public static void main(String[] args){
        DeletarLeao janela = new DeletarLeao();
    }
}