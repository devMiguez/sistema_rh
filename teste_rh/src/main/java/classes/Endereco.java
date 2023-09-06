package classes;

import enums.UnidadeFederativa;

public class Endereco {
    private UnidadeFederativa unidadeFederativa;
    private String cidade;
    private String bairro;
    private String Rua;
    private String numero;
    private String complemento;

    //Constructor
    public Endereco(UnidadeFederativa unidadeFederativa, String cidade, String bairro, String rua, String numero,
            String complemento) {
        this.unidadeFederativa = unidadeFederativa;
        this.cidade = cidade;
        this.bairro = bairro;
        Rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    //Getters and Setters 
    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }
    public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return Rua;
    }
    public void setRua(String rua) {
        Rua = rua;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
}
