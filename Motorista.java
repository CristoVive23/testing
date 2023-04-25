
package Systems;

import java.time.LocalDate;

public class Motorista extends Funcionario{
    
    private String carteiraDeHabilitacao;

    public Motorista() {
    }

    public Motorista(String carteiraDeHabilitacao, String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }

    @Override
    public String toString() {
        return "Motorista: \n"
                + "\nNome" + super.nome
                + "\nCpf: " + super.cpf
                + "\nData de Nascimento: " + Util.class
                + "\n Gênero: " super.genero
                + "\nSalário Base: " 
                + "\nData de Admissão: " 
                + "\nIdade: " super.getIdade()
                + "\nSalário final: " + this.getSalarioFinal();
    }

    
    
}
