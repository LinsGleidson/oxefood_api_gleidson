package br.com.ifpe.oxefood.modelo.entregador;

import java.time.LocalDate;

import org.hibernate.annotations.SQLRestriction; //Serve para que toda vez que for feita uma consulta ao banco, filtrando os clintes que tiverem o "habilitado = true"

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Entregador")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Entregador{
    // O @Column faz com que seja criada colunas no banco

    @Column
    private String nome;
    @Column
    private LocalDate dataNascimento;
    @Column
    private String cpf;
    @Column 
    private String rg;
    @Column
    private String foneCelular;
    @Column
    private String foneFixo;
    @Column
    private Integer qtdEntregasRealizadas;
    @Column
    private Boolean valorPorFrete;
    @Column 
    private String Rua;
    @Column
    private Integer numero;
    @Column
    private String bairro;
    @Column
    private String cidade;
    @Column
    private String cep;
    @Column
    private String uf;
    @Column
    private String complemento;
    @Column
    private String ativo;

}
