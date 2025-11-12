package BasicOPS.com.example.BOPS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import BasicOPS.com.example.BOPS.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	

}
