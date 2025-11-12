package BasicOPS.com.example.BOPS.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BasicOPS.com.example.BOPS.model.Employee;
import BasicOPS.com.example.BOPS.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	private final EmployeeService service;

	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}
	
	
	 // CREATE
    @PostMapping
    public Employee addEmployee(@RequestBody Employee emp) {
        return service.saveEmployee(emp);
    }
	
    //Read all
    
    @GetMapping
    public List<Employee> getAllEmployees()
    {
    	return service.getAllEmployees();
    }
    
    @GetMapping("/{Id}")
    public Employee getEmployee(@PathVariable Long id)
    {
    	return service.getEmployeeById(id);
    }
    
    // UPDATE
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee emp)
    {
    	return service.updateEmployee(id, emp);
    }
    
    //Delete
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id)
    {
    	return service.deleteEmployee(id);
    }
    
    
}
