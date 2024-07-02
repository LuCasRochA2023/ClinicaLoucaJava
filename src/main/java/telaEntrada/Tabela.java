package telaEntrada;

import controller.Controller;
import controller.PessoaController;
import dto.DTO;
import dto.PessoaDTO;
import entidades.Pessoa;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Tabela extends JPanel {
    private JTextField campo;
    private JTable tabela;
    List<DTO> lista ;
    PessoaController pessoaController ;

    public JTextField getCampo() {
        return campo;
    }

    public void setCampo(JTextField campo) {
        this.campo = campo;
    }

    public JTable getTabela() {
        return tabela;
    }

    public void setTabela(JTable tabela) {
        this.tabela = tabela;
    }

    public List<DTO> getLista() {
        return lista;
    }

    public void setLista(List<DTO> lista) {
        this.lista = lista;
    }

    public PessoaController getPessoaController() {
        return pessoaController;
    }

    public void setPessoaController(PessoaController pessoaController) {
        this.pessoaController = pessoaController;
    }

    public Tabela() {
        pessoaController = new PessoaController();
        tabela = new JTable();
        tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setLayout(new BorderLayout());
        add(new JScrollPane(tabela), BorderLayout.CENTER);
        campo = new JTextField(50);


            lista = pessoaController.listar();

            String[] col = pessoaController.getTituloColunas();
            Object[][] data = new Object[lista.size()][col.length];

            for (int i = 0; i <lista.size() ; i++) {
                data[i] = pessoaController.getDados(lista.get(i));

            }
            tabela.setModel(new DefaultTableModel(data,col));
            BotoesInferiores botoesInferiores = new BotoesInferiores(this);
            add(botoesInferiores, BorderLayout.SOUTH);

    }
        }


