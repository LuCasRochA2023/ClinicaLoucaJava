package dto;

import entidades.Login;

import java.util.LinkedList;
import java.util.List;

public class LoginDTO extends DTO {
    public String usuarioLogin;
    public String usuarioSenha;

    @Override
    public Login builder() {
        Login login = new Login();
        login.setLogin(usuarioLogin);
        login.setPassword(usuarioSenha);
        return login;
    }
    public Object Converte(Login login) {
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.usuarioLogin = login.getLogin();
        loginDTO.usuarioSenha = login.getPassword();
        return loginDTO;
    }
    public List getListaDados(List<Login>dados) {
        List DadosDTO = new LinkedList();
        for (Login login : dados) {
            DadosDTO.add(Converte(login));
        }
        return DadosDTO;
    }
}
