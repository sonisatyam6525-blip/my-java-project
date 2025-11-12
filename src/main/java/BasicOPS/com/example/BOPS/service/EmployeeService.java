package BasicOPS.com.example.BOPS.service;

import java.util.List;

import org.springframework.stereotype.Service;

import BasicOPS.com.example.BOPS.model.Employee;
import BasicOPS.com.example.BOPS.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private final EmployeeRepository repo;

	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	//create
	public Employee saveEmployee(Employee emp)
{
	return repo.save(emp);
}
public List<Employee> getAllEmployees() {
    return repo.findAll();
}
public Employee getEmployeeById(Long id) {
    return repo.findById(id).orElse(null);
}

public Employee updateEmployee(Long id, Employee emp) {
    Employee existing = repo.findById(id).orElse(null);
    if (existing != null) {
        existing.setName(emp.getName());
        existing.setEmail(emp.getEmail());
        existing.setDepartment(emp.getDepartment());
        return repo.save(existing);
    }
    return null;
}
public String deleteEmployee(Long id) {
    repo.deleteById(id);
    return "Employee removed !! " + id;
}


}
