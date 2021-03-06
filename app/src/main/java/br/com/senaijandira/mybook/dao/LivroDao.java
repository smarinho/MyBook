package br.com.senaijandira.mybook.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import br.com.senaijandira.mybook.model.Livro;


@Dao
public interface LivroDao {
    //metodos que se opera dentro do banco de dados

    @Insert
    void inserir(Livro l);

    @Update
    void atualizar(Livro l);

    @Delete
    void deletar(Livro l);

    @Query("SELECT * FROM livro")
    Livro[] selecionarTodos();

    @Query("SELECT * FROM livro WHERE status = 1")
    Livro[] selecionarLivrosParaLer();

    @Query("SELECT * FROM livro WHERE status = 2")
    Livro[] selecionarLivrosLidos();

    @Query("SELECT * FROM livro WHERE id =:idLivro")
    Livro pegarLivro(int idLivro);

}
