package poo.exercises.conta;

public class PessoaFisica {
    private String cpf;

    public PessoaFisica() {

    }

    public PessoaFisica(String cpf) {
        this.validaCpf(cpf);
    }

    public void validaCpf(String cpf) {
        if (cpf.isBlank()) {
            System.out.println("Cpf não pode ser vazio");
        } else if (cpf.length() != 11) {
            System.out.println("Cpf inválido");
        } else if (cpf.equals("11111111111") || (cpf.equals("22222222222")
        || (cpf.equals("33333333333") || (cpf.equals("44444444444")))));


    }

    public String getCpf() {
        return this.cpf;
    }
}
