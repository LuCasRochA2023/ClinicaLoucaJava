package telaEntrada;

import javax.swing.*;
import java.awt.*;

public class LabelTtitulo extends JPanel {
    private JLabel titulo;
    public LabelTtitulo() {
        titulo = new JLabel("A maior e mais louca clínica de o Alienista");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(titulo);
        setVisible(true);
    }
}
