package com.dkey.webapp.repository;

import com.dkey.webapp.entity.Encumbrance;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@ApplicationScoped
public class EncumbranceRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Encumbrance> getEncumbracesByOwnerInn(String inn){
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Encumbrance> criteriaQuery = criteriaBuilder.createQuery(Encumbrance.class);
        Root<Encumbrance> e = criteriaQuery.from(Encumbrance.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("inn"),inn));
        return em.createQuery(criteriaQuery).getResultList();
    }
}
