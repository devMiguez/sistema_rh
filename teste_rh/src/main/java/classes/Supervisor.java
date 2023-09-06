package classes;

import interfaces.Atributos;

public class Supervisor extends Funcionario implements Atributos{
    private double salarioSupervisor;
    private Atributos atributos;

    //Constructor
    public Supervisor(String nome, int cpf, Endereco endereco) {
        super(nome, cpf, endereco);
        this.atributos = atributos;
    }


    //Getters and Setters
    public double getSalarioSupervisor() {
        return salarioSupervisor;
    }
    
    public void setSalarioSupervisor(double salarioSupervisor) {
        this.salarioSupervisor = salarioSupervisor;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    //Cálculo dos Tributos do Gerente
    @Override
    public void calculoFgts() {
        
    }
    
    @Override
    public void calculoInss() {
    
    }
    
    @Override
    public void calculo13() {
    
    }
    
    @Override
    public void calculoFerias() {
       
    }
    
}
