package employeeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employeeapi.dao.EmployeeDao;
import employeeapi.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	public Employee create(Employee employee) {
		System.out.println("In Service"+employee);
		return this.employeeDao.create(employee);
	}


	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return this.employeeDao.getById(id);
	}


	public Employee deleteById(int id) {
		return this.employeeDao.deleteById(id);
	}


	public Employee update(Employee data) {
		// TODO Auto-generated method stub
		return this.employeeDao.update(data);
	}


	public List<Employee> getData() {
		// TODO Auto-generated method stub
		return this.employeeDao.getData();
	}
}
