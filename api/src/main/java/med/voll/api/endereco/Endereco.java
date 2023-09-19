package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter //gerar metodos geter
@NoArgsConstructor // gerar construtor default
@AllArgsConstructor // ter um construtor que recebe todos os campos
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }

        if (dados.logradouro() != null){
            this.bairro = dados.bairro();
        }

        if (dados.logradouro() != null){
            this.cep = dados.cep();
        }

        if (dados.logradouro() != null){
            this.uf = dados.uf();
        }

        if (dados.logradouro() != null){
            this.cidade = dados.cidade();
        }

        if (dados.logradouro() != null){
            this.numero = dados.numero();
        }

        if (dados.logradouro() != null){
            this.complemento = dados.complemento();
        }
    }
}
