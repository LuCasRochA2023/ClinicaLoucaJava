package controller;

import dto.DTO;

import java.util.List;

public interface Controller {
    public void salvar(DTO dto);
    public List listar();
}
