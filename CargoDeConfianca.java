
package Systems;

import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario{
    
    protected Bonificacao bonificacao;

    public CargoDeConfianca() {
    }

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao);
        this.bonificacao = bonificacao;
    }
    
    
}
