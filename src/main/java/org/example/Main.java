package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Configuration cfg= new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        System.out.println(factory);
    }
}