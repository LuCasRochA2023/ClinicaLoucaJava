package entidades.dao;

import entidades.Pessoa;

import java.util.List;

public class PessoaDAO implements InterfaceDao {
    public void salvar(Object o) {
        Padrao padrao = new Padrao();
        padrao.salvar(o);
    }
}
