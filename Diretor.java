
package Systems;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Contratacao{
    
    private double PREMIO;

    public Diretor() {
    }

    public Diretor(double PREMIO, Bonificacao bonificacao, String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao);
        this.PREMIO = PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor: \n"
                + "\nNome" + super.nome
                + "\nCpf: " + super.cpf
                + "\nData de Nascimento: " + Util.class
                + "\n Gênero: " super.genero
                + "\nSalário Base: " 
                + "\nData de Admissão: " 
                + "\nIdade: " super.getIdade()
                + "\nSalário final: " + this.getSalarioFinal();
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salarioBase * super.bonificacao.getValor();
        salarioFinal += super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir funcinário: ");
        System.out.println(funcionario.toString());
    }

    
}
