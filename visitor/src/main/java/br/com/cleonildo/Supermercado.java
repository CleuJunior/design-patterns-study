package br.com.cleonildo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Supermercado implements Elemento {

    private final String nome;
    private final List<Departamento> departamentos = new ArrayList<>();

    public Supermercado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    @Override
    public BigDecimal aceitar(Visitor visitor) {
        return visitor.visitSupermercado(this);
    }

    public void addDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }
}
