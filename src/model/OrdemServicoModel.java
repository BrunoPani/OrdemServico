/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Geral
 */
public class OrdemServicoModel {

    private int id;
    private Date data;
    private String tipo;
    private ClienteModel cliente;
    private String situacao;
    private String equipamento;
    private String defeito;
    private String servico;
    private String tecnico;
    private Float valorTotal;
    
    public OrdemServicoModel() {
        
    }
    
public OrdemServicoModel(int id, Date data, String tipo, ClienteModel cliente, String situacao, String equipamento, String defeito, String servico, String tecnico, Float valotTotal) {
this.id = id;
this.data = data;
this.tipo = tipo;
this.cliente = cliente;
this.situacao = situacao;
this.equipamento = equipamento;
this.defeito = defeito;
this.servico = servico;
this.tecnico = tecnico;
this.valorTotal = valorTotal;
}


public Float getValorTotal() {
return valorTotal;
}

public void setValorTotal(Float valorTotal) {
this.valorTotal = valorTotal;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public Date getData() {
return data;
}

public void setData(Date data) {
this.data = data;
}

public String getTipo() {
return tipo;
}

public void setTipo(String tipo) {
this.tipo = tipo;
}

public ClienteModel getCliente() {
return cliente;
}

public void setCliente(ClienteModel cliente) {
this.cliente = cliente;
}

public String getSituacao() {
return situacao;
}

public void setSituacao(String situacao) {
this.situacao = situacao;
}

public String getEquipamento() {
return equipamento;
}

public void setEquipamento(String equipamento) {
this.equipamento = equipamento;
}

public String getDefeito() {
return defeito;
}

public void setDefeito(String defeito) {
this.defeito = defeito;
}

public String getServico() {
return servico;
}

public void setServico(String servico) {
this.servico = servico;
}

public String getTecnico() {
return tecnico;
}

public void setTecnico(String tecnico) {
this.tecnico = tecnico;
}
}
