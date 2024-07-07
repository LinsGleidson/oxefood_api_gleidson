package br.com.ifpe.oxefood.modelo.produto;

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
@Table(name = "Produto")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Produto {
    // O @colum faz com que seja criada colunas no banco
    @Column
    private String titulo;
    @Column
    private String codProduto;
    @Column
    private String descricao;
    @Column
    private Boolean valorUnitario;
    @Column
    private Integer tempoEntregaMinimo;
    @Column
    private Integer tempoEntregaMaximo;

}
