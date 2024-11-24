module TodoListApp {
    requires java.sql;
    requires spring.beans;
    requires spring.context;
    requires java.xml.crypto;
    requires org.slf4j;

    opens todoapp;
    opens todoapp.entities;
    opens todoapp.repositories;
    opens todoapp.services;
    opens todoapp.views;
    opens todoapp.config;
}