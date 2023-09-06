package classes;

import enums.Cargo;

public abstract class Funcionario extends Pessoa {
    private Cargo cargo;

    //Constructor
    public Funcionario(String nome, int cpf, Endereco endereco) {
        super(nome, cpf, endereco);
    }


    //Getters and Setters
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
}
