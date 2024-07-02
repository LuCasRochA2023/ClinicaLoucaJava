package controller;

import dto.DTO;
import dto.PessoaDTO;
import entidades.Pessoa;
import entidades.dao.Padrao;
import entidades.dao.PessoaDAO;

import java.util.List;

public class PessoaController implements Controller {
    PessoaDAO pessoaDao = new PessoaDAO();

    @Override
    public void salvar(DTO dto)  {
        pessoaDao.atualiza(dto.builder());
    }

    @Override
    public List listar() {
        List<Pessoa> dados = pessoaDao.listar(Pessoa.class);
        PessoaDTO pessoaDTO = new PessoaDTO();
        return pessoaDTO.getListaDados(dados);
    }

    public Object[] getDados(DTO o) {
        PessoaDTO dto = (PessoaDTO) o;
        return new Object[]{dto.nomePessoa, dto.cpfPessoa, dto.rgPessoa, dto.numeroPessoa, dto.ruaPessoa};
    }
    public String [] getTituloColunas() {
        return new String[]{"Nome","CPF","RG","Número","Rua"};


    }
}


