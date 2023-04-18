package one.digital.innnovation.gof.service;

import one.digital.innnovation.gof.model.Cliente;

import java.util.Iterator;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
