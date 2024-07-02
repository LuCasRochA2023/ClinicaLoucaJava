package telaEntrada;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(){
        setTitle("Bem vindo à clínica louca!");
        setLayout(new BorderLayout());

        setVisible(true);
        setMinimumSize(new Dimension(700,500));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        add(new ToolBar(), BorderLayout.NORTH);
        add(new Tabela(),BorderLayout.WEST);
        add(new LabelTtitulo(), BorderLayout.PAGE_START);
        add(new CampoPrincipal(), BorderLayout.LINE_END);

        setLocationRelativeTo(null);
    }
}
