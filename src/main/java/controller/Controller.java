package controller;

import dto.DTO;

import java.util.List;

public interface Controller {
    public String [] getTituloColunas();
    public void salvar(DTO dto);
    public List listar();
    public Object [] getDados(DTO dto);
}
