package Firstmaven.Firstmaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )  {
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Student.class);
    	SessionFactory sessionfactory = configuration.buildSessionFactory();
    	Session session = sessionfactory.openSession();
    	Student st = new Student();
    	st.setId(101);
    	st.setName("Ashok");
     st.setEmail("ashok@gmail.com");
     session.beginTransaction();
     session.save(st);
     session.getTransaction().commit();
}
}