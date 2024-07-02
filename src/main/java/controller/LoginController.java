package controller;

import dto.DTO;
import dto.LoginDTO;
import entidades.Login;
import entidades.dao.LoginDAO;
import entidades.dao.Padrao;
import entidades.dao.PessoaDAO;

import java.util.LinkedList;
import java.util.List;

public class LoginController implements Controller{
    LoginDAO login = new LoginDAO();

    public void salvar(DTO dto ){
        login.salvar(dto.builder());
    }
    public List listar(){
        List<Login> lista = login.listar(Login.class);
        LoginDTO loginDTO = new LoginDTO();
        return loginDTO.getListaDados(lista);

    }
}
