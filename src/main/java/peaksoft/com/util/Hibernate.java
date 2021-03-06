package peaksoft.com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
    private static final SessionFactory session = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());

            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSession() {
        return session;
    }

    public static void shutDown() {
        getSession().close();
    }

}
