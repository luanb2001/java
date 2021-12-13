package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zoo extends JFrame {

    JLabel sistema;
    JLabel linha1;
    JLabel pontilhado1;
    JLabel leao;
    JLabel linha2;
    JLabel golfinho;
    JLabel pontilhado2;

    JButton fechar;
     
    JButton cadastrarLeao = new JButton("Adicionar Leão");
    JButton cadastrarAlimentacao = new JButton("Adicionar Alimentação");
    JButton alterarLeao = new JButton("Alterar Leão");
    JButton deletarLeao = new JButton("Apagar Leão");
    JButton listarLeao = new JButton("Listar Leões");
    
    JButton cadastrarGolfinho = new JButton("Adicionar Golfinho");
    JButton cadastrarTreinamento = new JButton("Adicionar Treinamento");
    JButton alterarGolfinho = new JButton("Alterar Golfinho");
    JButton deletarGolfinho = new JButton("Apagar Golfinho");
    JButton listarGolfinho = new JButton("Listar Golfinhos");

    public Zoo() {

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        sistema = new JLabel("\nSISTEMA ZOO");
        linha1 = new JLabel("_________________________________");
        pontilhado1 = new JLabel("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        leao = new JLabel("\nLEÃO");
        linha2 = new JLabel("_________________________________");
        golfinho = new JLabel("\nGOLFINHO");
        pontilhado2 = new JLabel("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        pane.add(sistema);
        pane.add(linha1);

        pane.add(leao);
        pane.add(pontilhado1);
        
        pane.add(cadastrarLeao);
        pane.add(cadastrarAlimentacao);
        pane.add(alterarLeao);
        pane.add(deletarLeao);
        pane.add(listarLeao);
        pane.add(linha2);

        pane.add(golfinho);
        pane.add(pontilhado2);
        
        pane.add(cadastrarGolfinho);
        pane.add(cadastrarTreinamento);
        pane.add(alterarGolfinho);
        pane.add(deletarGolfinho);
        pane.add(listarGolfinho);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(220,530);
        this.setVisible(true);  

        cadastrarLeao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarLeaoActionPerformed(e);
            }
        });

        cadastrarAlimentacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarAlimentacaoActionPerformed(e);
            }
        });

        alterarLeao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alterarLeaoActionPerformed(e);
            }
        });

        deletarLeao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deletarLeaoActionPerformed(e);
            }
        });

        listarLeao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarLeaoActionPerformed(e);
            }
        });
 

        cadastrarGolfinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarGolfinhoActionPerformed(e);
            }
        });

        cadastrarTreinamento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarTreinamentoActionPerformed(e);
            }
        });

        alterarGolfinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alterarGolfinhoActionPerformed(e);
            }
        });

        deletarGolfinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deletarGolfinhoActionPerformed(e);
            }
        });

        listarGolfinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarGolfinhoActionPerformed(e);
            }
        });
    }

    private void listarLeaoActionPerformed(ActionEvent e) {
        new ListarLeao();
    }

    private void cadastrarLeaoActionPerformed(ActionEvent e) {
        new CadastrarLeao();
    }

    private void cadastrarAlimentacaoActionPerformed(ActionEvent e) {
        new CadastrarAlimentacao();
    }

    private void alterarLeaoActionPerformed(ActionEvent e) {
        new AlterarLeao();
    }

    private void deletarLeaoActionPerformed(ActionEvent e) {
        new DeletarLeao();
    }

    private void listarGolfinhoActionPerformed(ActionEvent e) {
        new ListarGolfinho();
    }

    private void cadastrarGolfinhoActionPerformed(ActionEvent e) {
        new CadastrarGolfinho();
    }

    private void cadastrarTreinamentoActionPerformed(ActionEvent e) {
        new CadastrarTreinamento();
    }

    private void alterarGolfinhoActionPerformed(ActionEvent e) {
        new AlterarGolfinho();
    }

    private void deletarGolfinhoActionPerformed(ActionEvent e) {
        new DeletarGolfinho();
    }

    public static void main(String[] args) {
        Zoo janela = new Zoo();
    }
}