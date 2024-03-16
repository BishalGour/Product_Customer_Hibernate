package com.jsp.jdbc.HibernateProject.HibernateProject__Product_db_QueryInterface;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductService {
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("");
       EntityManager entityManager = entityManagerFactory.createEntityManager();
       EntityTransaction transaction = entityManager.getTransaction();
       
       
}
