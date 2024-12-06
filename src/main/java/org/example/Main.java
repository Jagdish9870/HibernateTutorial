package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

//       for xml file only
//        Configuration cfg= new Configuration();
//        cfg.configure();
//        SessionFactory factory=cfg.buildSessionFactory();
//
//       // in short....
//        // SessionFactory factory=new Configuration().configure().buildSessionFactory();
//
//
//        System.out.println(factory);

        // for java file(HibernateUtil)

        SessionFactory factory= HibernateUtil.getSessionfactory();
        System.out.println(factory);


        // to add values  in databases we have to start session
        Session session= factory.openSession();
        Transaction txn= session.beginTransaction();


        Student st= new Student(2,"shubham","shubham@gmail.com","kurukshetra");
        session.save(st);
        txn.commit();
        session.close();



    }
}