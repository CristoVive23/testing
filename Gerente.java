
package Systems;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{

    public Gerente() {
    }

    public Gerente(Bonificacao bonificacao, String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao);
    }

    @Override
    public double getSalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
