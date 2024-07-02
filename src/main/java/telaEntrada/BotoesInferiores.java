package telaEntrada;

import dto.DTO;
import dto.PessoaDTO;

import javax.swing.*;
import java.awt.*;

public class BotoesInferiores extends JPanel {
    JButton botaoDetalhes;
    Tabela tabela;
    public BotoesInferiores(Tabela tabela) {
        this.tabela = tabela;
        setLayout(new FlowLayout());
        botaoDetalhes= new JButton("Detalhes");
        add(botaoDetalhes);
        Acoes();
    }
    public void Acoes() {
        botaoDetalhes.addActionListener(e-> {

            if(tabela.getTabela().getSelectedRow()>=0) {
                int tab = tabela.getTabela().getSelectedRow();
                PessoaDTO dto = (PessoaDTO) tabela.getLista().get(tab);
                JOptionPane.showMessageDialog(getRootPane(), dto.toString());
            }else{
                JOptionPane.showMessageDialog(getRootPane(),"Nada selecionado!");
            }
        });
    }
}
