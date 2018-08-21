package com.dkey.webapp.repository;

import com.dkey.webapp.entity.Fine;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@ApplicationScoped
public class FineRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Fine> getFineByIntruderInn(String inn){
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Fine> criteriaQuery = criteriaBuilder.createQuery(Fine.class);
        Root<Fine> e = criteriaQuery.from(Fine.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("inn"),inn));
        return em.createQuery(criteriaQuery).getResultList();
    }
}
