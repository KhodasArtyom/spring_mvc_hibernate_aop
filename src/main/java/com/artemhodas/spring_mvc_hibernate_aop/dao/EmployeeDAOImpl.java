package com.artemhodas.spring_mvc_hibernate_aop.dao;

import com.artemhodas.spring_mvc_hibernate_aop.entity.Employee;
import jakarta.persistence.Column;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {

        Session session = sessionFactory.getCurrentSession();
//        List<Employee> allEmployees = session.createQuery("from Employee"
//                        , Employee.class).getResultList();

        Query<Employee> query = session.createQuery("from Employee "
                , Employee.class);
        List<Employee> allEmployees = query.getResultList();
        return allEmployees;
    }
}
