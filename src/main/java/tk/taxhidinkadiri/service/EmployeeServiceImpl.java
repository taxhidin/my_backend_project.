package tk.taxhidinkadiri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tk.taxhidinkadiri.dao.EmployeeDAO;
import tk.taxhidinkadiri.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;


    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }


    @Override
    @Transactional
    public Employee findById(int theId) {
        return employeeDAO.findById(theId);
    }


    @Override
    @Transactional
    public void save(Employee theEmployee) {
        employeeDAO.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        employeeDAO.deleteById(theId);
    }

/*	@Override
	@Transactional
	public Employee addOrder(Employee employee) {
		return employeeDAO.addOrder(employee);
	}*/

/*		@Override
	public int findContact_string(String employee) {
		return employeeDAO.findContact_string(employee);
	}

	@Override
	public int findContact_employee(Employee employee) {
		return employeeDAO.findContact_employee(employee);
	}*/


}






