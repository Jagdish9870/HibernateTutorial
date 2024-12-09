package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FetchingData {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionfactory();
        Session session=sessionFactory.openSession();
        Employee emp= session.get(Employee.class,1);
        // we can use .load() but if the requested value does not exist in database it will return exception but .get returns null
        System.out.println(emp);
    }
}
