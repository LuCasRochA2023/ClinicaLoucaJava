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
    Controller pessoaController ;

    public Tabela() {
        pessoaController = new PessoaController();
        tabela = new JTable();
        setLayout(new BorderLayout());
        add(new JScrollPane(tabela), BorderLayout.CENTER);
        campo = new JTextField(50);


            lista = pessoaController.listar();
            PessoaDTO dto = new PessoaDTO();

            String[] col = pessoaController.getTituloColunas();
            Object[][] data = new Object[lista.size()][col.length];

            for (int i = 0; i <lista.size() ; i++) {
                data[i] = pessoaController.getDados(lista.get(i));

            }
            tabela.setModel(new DefaultTableModel(data,col));

        }
        }


