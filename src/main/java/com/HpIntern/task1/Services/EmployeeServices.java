package com.HpIntern.task1.Services;

import com.HpIntern.task1.Model.Employee;
import com.HpIntern.task1.Model.RegisterEmployee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeServices {
    List<Employee> GetAllEmployees();
    Employee getEmployeeById(String uuid);
    Employee CreateEmployee(RegisterEmployee registerEmployee);
    String  DeleteEmployee(String uuid);
    Employee UpdateEmployee(Employee employee);

}
