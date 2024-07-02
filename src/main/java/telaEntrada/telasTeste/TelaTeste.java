package telaEntrada.telasTeste;

import dto.LoginDTO;
import entidades.Login;
import entidades.dao.LoginDAO;
import telaEntrada.CampoPrincipal;
import telaEntrada.Frame;

import javax.swing.*;

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
        setSize(500,500);
        Funcionalidade();
    }
    public void Funcionalidade() {
        entrarButton.addActionListener(e -> {
            LoginDTO loginDTO = new LoginDTO();
            loginDTO.usuarioLogin = campoUsuario.getText();
            loginDTO.usuarioSenha = campoSenha.getText();
            LoginDAO loginDAO = new LoginDAO();
            Login login;
            login = loginDTO.builder();
            loginDAO.salvar(login);
            dispose();
            new Frame().setVisible(true);
        });
    }
}
