package medico;

import endereco.Endereco;

public record DadosCadastrosMedico(String nome, String email, String telefone, String CRM,
                                   Especilidade especialidade, Endereco endereco) {

}
