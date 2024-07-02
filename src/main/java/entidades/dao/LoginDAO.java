package entidades.dao;

public class LoginDAO implements InterfaceDao{
    public void salvar(Object o){
        Padrao padrao = new Padrao();
        padrao.salvar(o);
    }
}
