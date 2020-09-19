/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh.controlo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import rh.modelo.Funcionario;

/**
 *
 * @author edumu
 */
@Named(value = "funcionarioMBean")
@RequestScoped
public class FuncionarioMBean {

    Funcionario funcionario1 = new Funcionario("Eduardo", "Mucaji","Operação de Serviços", 31, 100000.00);
    Funcionario funcionario2 = new Funcionario("Fua", "Landu","Operação de Acesso", 30, 100000.00);
    Funcionario funcionario3 = new Funcionario("Pedro", "Alberto","Operação de Core", 29, 100000.00);
    
    
    List<Funcionario> funcionarios = new ArrayList();

    @PostConstruct
    public void init() {
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);

    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

   

    public String guardar() {

        return "resultado";
    }

}
