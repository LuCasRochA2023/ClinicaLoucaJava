package dto;

import entidades.Pessoa;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public  class PessoaDTO extends DTO{
    public String nomePessoa;
    public String cpfPessoa;
    public String rgPessoa;
    public String ruaPessoa;
    public String sexoPessoa;
    public double numeroPessoa;

    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public String getRgPessoa() {
        return rgPessoa;
    }

    public String getRuaPessoa() {
        return ruaPessoa;
    }

    public String getSexoPessoa() {
        return sexoPessoa;
    }

    public double getNumeroPessoa() {
        return numeroPessoa;
    }

    public Pessoa builder(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nomePessoa);
        pessoa.setRua(ruaPessoa);
        pessoa.setCpf(cpfPessoa);
        pessoa.setRg(rgPessoa);
        pessoa.setNumero(numeroPessoa);
        pessoa.setSexo(sexoPessoa);
        return pessoa;
    }
    public List getListaDados(List<Pessoa> dados) {
        List dadosDTO = new LinkedList();
        for (Pessoa dado: dados){
            dadosDTO.add(converte(dado));

        }
        return dadosDTO;
    }
    public Object converte(Pessoa pessoa) {
        PessoaDTO dto = new PessoaDTO();
        dto.nomePessoa= pessoa.getNome();
        dto.ruaPessoa = pessoa.getRua();
        dto.cpfPessoa = pessoa.getCpf();
        dto.rgPessoa = pessoa.getRg();
        dto.numeroPessoa = pessoa.getNumero();
        dto.sexoPessoa = pessoa.getSexo();
        return dto;
    }
    @Override
    public String toString() {
        return "Nome: " + nomePessoa + ", CPF: " + cpfPessoa + ", RG: " + rgPessoa + ", Número: " + numeroPessoa + ", Rua: " + ruaPessoa;
    }
}
