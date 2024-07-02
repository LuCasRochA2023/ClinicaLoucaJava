package entidades.dao;

import entidades.Login;

import java.util.List;

public class LoginDAO implements InterfaceDao{
    public void salvar(Object o){
        Padrao padrao = new Padrao();
        padrao.salvar(o);
    }

}
