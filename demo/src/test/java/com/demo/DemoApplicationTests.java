package com.demo;

import com.demo.employee.EmployeeDto;
import com.demo.employee.EmployeeException;
import com.demo.employee.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {
	//
//	EmployeeDto registerEmployee(EmployeeDto newEmployee);
//	EmployeeDto getEmployeeById(Integer employeeId)throws EmployeeException;
//	EmployeeDto updateEmployee(EmployeeDto employee);
//	EmployeeDto deleteEmployeeById(Integer employeeId) throws EmployeeException;
	@Autowired
	private EmployeeService employeeService;
	@Test
	void registerEmployeeTest() {
		EmployeeDto emp = new EmployeeDto(1,"Ford",25000.0);
		assertEquals("Ford",this.employeeService.registerEmployee(emp).getName());
	}
	@Test
	void registerEmployeeTest1() {
		EmployeeDto emp = new EmployeeDto(3,"Bosch",35000.0);
		assertEquals("Bosch",this.employeeService.registerEmployee(emp).getName());
}
//	@Test
//	void getEmployeeByIdTest1() throws EmployeeException {
//		EmployeeDto emp = new EmployeeDto(3,"Bosch",35000.0);
//		assertEquals(3,this.employeeService.getEmployeeById(emp.getId()).getId());
//	}
//
//	@Test
//	void updateEmployeeTest(){
//		EmployeeDto upd = new EmployeeDto("jaya");
//		assertEquals("jaya",this.employeeService.registerEmployee.getName());
//
////	}
	@Test
	void getEmployeeByIdThrowsExceptionTest1() {
		//EmployeeDto emp = new EmployeeDto(1,"Ford",25000.0);
		assertThrows(EmployeeException.class,()->this.employeeService.getEmployeeById(100));
	}

	@Test
	void getEmployeeByIdThrowsExceptionTest() {
		//EmployeeDto emp = new EmployeeDto(1,"Ford",25000.0);
		assertThrows(EmployeeException.class,()->this.employeeService.getEmployeeById(1000));
	}

	@Test
	void deleteEmployeeByIdThrowsExceptionTest(){
		assertThrows(EmployeeException.class,()->this.employeeService.getEmployeeById(1000));
	}
	@Test
	public void deleteEmployeeTest() throws EmployeeException {
		employeeService.registerEmployee(new EmployeeDto(1, "Ford", 2500.0));
		EmployeeDto deleteEmployee = employeeService.deleteEmployeeById(1);
		assertEquals("Ford", deleteEmployee.getName());


//		public void updateEmployee(){
//			employeeService.registerEmployee(new EmployeeDto(1, "Ford", 2500.0));
//
//
//
//		}
	}






}