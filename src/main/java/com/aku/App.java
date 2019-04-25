package com.aku;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        StandardServiceRegistry ssr =
                new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t1 = session.beginTransaction();

        Student s1 = new Student("aku", "pittsburgh");
        Student s2 = new Student("amar", "nj");
        Student s3 = new Student("emre", "ny");

        session.save(s1);
        session.save(s2);
        session.save(s3);

        t1.commit();

        System.out.println("Records saved.");
        factory.close();
        session.close();
    }
}
