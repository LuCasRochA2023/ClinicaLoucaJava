package entidades.dao;

import entidades.Login;

import java.util.List;

public interface InterfaceDao {
    public default List listar(Class clazz) {
        return Padrao.getInstance().listar(clazz);
    }
    public default void salvar (Object entidade) {
        Padrao.getInstance().salvar(entidade);
    }
    public default void atualiza(Object entidade) {
        Padrao.getInstance().atualiza(entidade);
    }


}