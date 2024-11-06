package com.kauabraccio.projectmanagementapi.dao;

import org.springframework.stereotype.Repository;
import com.kauabraccio.projectmanagementapi.model.Projeto;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProjetoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void inserir(Projeto projeto) {
        entityManager.persist(projeto);
    }

    public Projeto atualizar(Projeto projeto) {
        return entityManager.merge(projeto);
    }

    public Projeto buscarPorId(Long idProjeto) {
        return entityManager.find(Projeto.class, idProjeto);
    }

    public List<Projeto> consultarTodos() {
        return entityManager.createQuery("SELECT p FROM Projeto p", Projeto.class).getResultList();
    }
}
