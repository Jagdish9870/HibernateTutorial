package org.example;

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

    }
}