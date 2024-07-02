package telaEntrada.telasTeste;

import controller.LoginController;
import dto.LoginDTO;
import entidades.Login;
import entidades.dao.LoginDAO;
import telaEntrada.CampoPrincipal;
import telaEntrada.Frame;

import javax.swing.*;
import java.awt.*;

public class TelaTeste extends JFrame{
    private JPanel painel;
    private JLabel Titulo;
    private JTextField campoUsuario;
    private JLabel senha;
    private JPasswordField campoSenha;
    private JButton entrarButton;

    private void createUIComponents() {

    }
    public TelaTeste() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(painel).setVisible(true);
        setMinimumSize(new Dimension(700,500));
        setSize(800 ,600);
        Funcionalidade();
    }
    public void Funcionalidade() {
        entrarButton.addActionListener(e -> {
            LoginDTO loginDTO = new LoginDTO();
            loginDTO.usuarioLogin = campoUsuario.getText();
            loginDTO.usuarioSenha = campoSenha.getText();



            LoginController loginController = new LoginController();
            loginController.salvar(loginDTO);
            dispose();
            new Frame().setVisible(true);
        });
    }
}
