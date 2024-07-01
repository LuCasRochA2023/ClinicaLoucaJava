package telaEntrada;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ToolBar extends JToolBar {
    public ToolBar() {
        setLayout(new BorderLayout());
        Border borda = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(borda);
        setSize(200,600);

    }
}
