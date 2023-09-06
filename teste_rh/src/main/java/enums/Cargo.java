package enums;

public enum Cargo {
    GERENTE(5000.00), SUPERVISOR(2500.00), ATENDENTE(1400.00);

    private double salario;

    private Cargo(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
