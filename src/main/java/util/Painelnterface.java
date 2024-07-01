package util;

import dto.DTO;

import javax.swing.*;

public abstract class Painelnterface extends JPanel {
    public abstract DTO salvar();
    public abstract void preencher(DTO dto);
}
