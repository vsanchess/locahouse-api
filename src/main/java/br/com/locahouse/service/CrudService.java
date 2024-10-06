package br.com.locahouse.service;

public interface CrudService<T, ID> {

    T cadastrar(T entidade);

    T buscarPeloId(ID id);

    T atualizar(ID id, T entidade);

    void deletar(ID id);
}
