package employeeapi.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;



import employeeapi.model.Employee;

@Repository
public class EmployeeDao {
	
	
	

	

	public Employee create(Employee employee) {
		
		System.out.println("In Service");

		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
    
    	
    	SessionFactory sf = config.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	//interface for following acid property
    	Transaction tx = session.beginTransaction();
    	
    	session.save(employee);
    	
    	
    	tx.commit();
    	
		return employee;
	}


	public Employee getById(int id) {
		System.out.println("In Service");

		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
    
    	
    	SessionFactory sf = config.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	//interface for following acid property
    	Transaction tx = session.beginTransaction();
    	
    	Employee data = session.get(Employee.class, id);
    	
    	System.out.println(data);
    	tx.commit();
    	
		return data;
	}


	public Employee deleteById(int id) {
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
    
    	
    	SessionFactory sf = config.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	//interface for following acid property
    	Transaction tx = session.beginTransaction();
    	
    	Employee data = session.get(Employee.class, id);
    	
    	session.delete(data);
    	
    	System.out.println(data);
    	tx.commit();
    	
		return data;
	}


	public Employee update(Employee data) {
		
	Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
    
    	
    	SessionFactory sf = config.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	//interface for following acid property
    	Transaction tx = session.beginTransaction();
    	
    	
    	session.update(data);
    	tx.commit();
    	
		System.out.println("Dao"+data);
		
		return data;
	}


	public List<Employee> getData() {

		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
    
    	
    	SessionFactory sf = config.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	//interface for following acid property
    	Transaction tx = session.beginTransaction();
    	
    	SQLQuery query = session.createSQLQuery("select * from employeedata");
	  	query.addEntity(Employee.class);
	  	List<Employee> data = query.list();
    	
    	
    	tx.commit();
    	

		
		System.out.println(data);
		
		return data;
	}

}
