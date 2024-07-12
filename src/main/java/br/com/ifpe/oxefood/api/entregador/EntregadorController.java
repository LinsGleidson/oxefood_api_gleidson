package br.com.ifpe.oxefood.api.entregador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood.modelo.entregador.Entregador;
import br.com.ifpe.oxefood.modelo.entregador.EntregadorService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/entregador")
@CrossOrigin
public class EntregadorController {
    @Autowired
    private EntregadorService entregadorService;

     @Operation(
        summary = "Serviço responsável por salvar um entregador no sistema.", 
        description = "Exemplo de descrição de um endpoint responsável por salvar um entregador no sistema."
    )

    @PostMapping
    public ResponseEntity<Entregador> save(@RequestBody EntregadorRequest request) {

        Entregador entregador = entregadorService.save(request.build());
        return new ResponseEntity<Entregador>(entregador, HttpStatus.CREATED);
    }

    @Operation(
        summary = "Serviço responsável por requisitar um entregador no sistema.", 
        description = "Exemplo de descrição de um endpoint responsável por requisitar um entregador no sistema."
    )

     @GetMapping
    public List<Entregador> listarTodos() {
        return entregadorService.listarTodos();
    }

    @GetMapping("/{id}")
    public Entregador obterPorID(@PathVariable Long id) {
        return entregadorService.obterPorID(id);
    }

    @Operation(
        summary = "Serviço responsável por atualizar um entregador no sistema.", 
        description = "Exemplo de descrição de um endpoint responsável por atualizar um entregador no sistema."
    )

    @PutMapping("/{id}")
    public ResponseEntity<Entregador> update(@PathVariable("id") Long id, @RequestBody EntregadorRequest request) {

        entregadorService.update(id, request.build());
        return ResponseEntity.ok().build();
    }

    @Operation(
        summary = "Serviço responsável por deletar um entregador no sistema.", 
        description = "Exemplo de descrição de um endpoint responsável por deletar um entregador no sistema."
    )

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        entregadorService.delete(id);
        return ResponseEntity.ok().build();
    }
}
