package paciente;

import endereco.Endereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, Endereco endereco, String cpf) {
}
