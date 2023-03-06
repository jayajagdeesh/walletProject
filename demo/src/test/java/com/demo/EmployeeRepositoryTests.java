package com.demo;

import com.demo.employee.EmployeeDto;
import com.demo.employee.CollectionEmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmployeeRepositoryTests {
    @Autowired
    private CollectionEmployeeRepository collectionEmployeeRepository;

    //    EmployeeDto addEmployee(EmployeeDto employee);
//    EmployeeDto getEmployee(Integer id);
//    EmployeeDto updateEmployee(EmployeeDto employeeDto);
//    EmployeeDto deleteEmployee(Integer employeeId);
    @BeforeEach
    public void init(){
        collectionEmployeeRepository.addEmployee(new EmployeeDto(1,"Ford",25000.0));
    }
    @Test
    public void deleteEmployeeTest(){
        EmployeeDto deletedEmployee= collectionEmployeeRepository.deleteEmployee(1);
        assertEquals("Ford",deletedEmployee.getName());
    }
}
