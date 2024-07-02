package telaEntrada;

import controller.PessoaController;
import dto.DTO;
import dto.PessoaDTO;
import entidades.dao.Padrao;
import entidades.Pessoa;
import entidades.dao.PessoaDAO;
import util.Painelnterface;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CampoPrincipal extends JPanel {
    private JLabel nomeLabel;
    private JTextField campoNome;
    private JLabel CPFLabel;
    private JTextField campoCPF;

    private JButton botaoOk;
    private JRadioButton masculino;
    private JRadioButton feminino;
    private ButtonGroup grupoGenero;

    private JLabel rg;
    private JTextField campoRg;
    private JLabel rua;
    private JTextField campoRua;
    private JLabel bairro;
    private JTextField campoBairro;

    public JLabel getNomeLabel() {
        return nomeLabel;
    }

    public void setNomeLabel(JLabel nomeLabel) {
        this.nomeLabel = nomeLabel;
    }

    public JTextField getCampoNome() {
        return campoNome;
    }

    public void setCampoNome(JTextField campoNome) {
        this.campoNome = campoNome;
    }

    public JLabel getCPFLabel() {
        return CPFLabel;
    }

    public void setCPFLabel(JLabel CPFLabel) {
        this.CPFLabel = CPFLabel;
    }

    public JTextField getCampoCPF() {
        return campoCPF;
    }

    public void setCampoCPF(JTextField campoCPF) {
        this.campoCPF = campoCPF;
    }

    public JButton getBotaoOk() {
        return botaoOk;
    }

    public void setBotaoOk(JButton botaoOk) {
        this.botaoOk = botaoOk;
    }

    public JRadioButton getMasculino() {
        return masculino;
    }

    public void setMasculino(JRadioButton masculino) {
        this.masculino = masculino;
    }

    public JRadioButton getFeminino() {
        return feminino;
    }

    public void setFeminino(JRadioButton feminino) {
        this.feminino = feminino;
    }

    public ButtonGroup getGrupoGenero() {
        return grupoGenero;
    }

    public void setGrupoGenero(ButtonGroup grupoGenero) {
        this.grupoGenero = grupoGenero;
    }

    public JLabel getRg() {
        return rg;
    }

    public void setRg(JLabel rg) {
        this.rg = rg;
    }

    public JTextField getCampoRg() {
        return campoRg;
    }

    public void setCampoRg(JTextField campoRg) {
        this.campoRg = campoRg;
    }

    public JLabel getRua() {
        return rua;
    }

    public void setRua(JLabel rua) {
        this.rua = rua;
    }

    public JTextField getCampoRua() {
        return campoRua;
    }

    public void setCampoRua(JTextField campoRua) {
        this.campoRua = campoRua;
    }

    public JLabel getBairro() {
        return bairro;
    }

    public void setBairro(JLabel bairro) {
        this.bairro = bairro;
    }

    public JTextField getCampoBairro() {
        return campoBairro;
    }

    public void setCampoBairro(JTextField campoBairro) {
        this.campoBairro = campoBairro;
    }

    public JLabel getNumero() {
        return numero;
    }

    public void setNumero(JLabel numero) {
        this.numero = numero;
    }

    public JTextField getCampoNumero() {
        return campoNumero;
    }

    public void setCampoNumero(JTextField campoNumero) {
        this.campoNumero = campoNumero;
    }

    private JLabel numero;
     Painelnterface painelnterface;
    private  JTextField campoNumero;

    public void Salvar() {
        botaoOk.addActionListener(e -> {

            PessoaDTO dto = new PessoaDTO();
            PessoaController controller = new PessoaController();

            dto.nomePessoa = (campoNome.getText());
            dto.cpfPessoa = (campoCPF.getText());
            double numero = Double.parseDouble(campoNumero.getText());
            dto.numeroPessoa = (numero);
            dto.rgPessoa = (campoRg.getText());
            dto.ruaPessoa = (campoRua.getText());
            String generoSelecionado = "";
            if (masculino.isSelected()) {
                generoSelecionado = "Masculino";
            } else if (feminino.isSelected()) {
                generoSelecionado = "Feminino";
            }
            dto.sexoPessoa = (generoSelecionado);


            controller.salvar(dto);


        });

    }

    public CampoPrincipal() {


        nomeLabel = new JLabel("Nome");
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);
        campoNome = new JTextField(10);
        CPFLabel = new JLabel("CPF");
        campoCPF = new JTextField(10);
        botaoOk = new JButton("Salvar");
        rg = new JLabel("RG");
        campoRg = new JTextField(10);
        rua = new JLabel("Rua");
        campoRua = new JTextField(10);
        bairro = new JLabel("Bairro");
        campoBairro = new JTextField(10);
        numero = new JLabel("Número");
        campoNumero = new JTextField(10);
        masculino = new JRadioButton("Masclino");
        feminino = new JRadioButton("Feminino");
        grupoGenero = new ButtonGroup();
        grupoGenero.add(masculino);
        grupoGenero.add(feminino);
        Border bordaTexto = BorderFactory.createTitledBorder("Formulário");
        Border borda = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(bordaTexto,borda));

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.weighty = 0.0001;
        gc.weightx = 1;
        gc.gridx = 0;
        gc.gridy = 0;

        gc.insets = new Insets(0,0,0,5);
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        add(nomeLabel, gc);


        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_START;
        add(campoNome, gc);

        gc.weighty = 0.0001;
        gc.weightx = 1;
        gc.gridy = 1;
        gc.gridx = 0;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(CPFLabel, gc);

        gc.gridy = 1;
        gc.gridx = 1;

        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_START;
        add(campoCPF,gc);

        gc.weighty = 0.0001;
        gc.weightx = 1;
        gc.gridx = 0;
        gc.gridy = 2;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(rg,gc);


        gc.gridy = 2;
        gc.gridx = 1;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_START;
        add(campoRg,gc);

        gc.weighty = 0.0001;
        gc.weightx = 1;
        gc.gridx = 0;
        gc.gridy = 3;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(rua,gc);


        gc.gridy = 3;
        gc.gridx = 1;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_START;
        add(campoRua,gc);

        gc.weighty = 0.0001;
        gc.weightx = 1;
        gc.gridx = 0;
        gc.gridy = 4;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(bairro,gc);

        gc.weighty = 0.0001;

        gc.gridy = 4;
        gc.gridx = 1;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_START;
        add(campoBairro,gc);

        gc.weighty = 0.0001;
        gc.weightx = 1;
        gc.gridx = 0;
        gc.gridy = 5;
        gc.insets = new Insets(0,5,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(numero,gc);

        gc.weighty = 0.0001;
        gc.gridy = 5;
        gc.gridx = 1;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_START;
        add(campoNumero,gc);


        gc.weighty = 0.0001;
        gc.gridy = 6;
        gc.gridx = 0;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Gênero:"),gc);


        gc.weighty = 0.0001;
        gc.gridy = 6;
        gc.gridx = 1;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_START;
        add(masculino,gc);

        gc.gridy = 7;
        gc.gridx = 1;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_START;
        add(feminino,gc);

        gc.weighty = 2.1;
        gc.weightx = 1;
        gc.gridy = 8;
        gc.gridx = 1;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(botaoOk, gc);

        Salvar();

    }

}
