package com.HpIntern.task1.Services.impl;

import com.HpIntern.task1.Model.Employee;
import com.HpIntern.task1.Model.RegisterEmployee;
import com.HpIntern.task1.Repo.EmployeeRepo;
import com.HpIntern.task1.Services.EmployeeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class EmployeeServicesImpl implements EmployeeServices {
    @Autowired
    private final EmployeeRepo employeeRepo;
    @Override
    public List<Employee> GetAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(String uuid) {
        Optional<Employee> employee=employeeRepo.findById(uuid);
        return employee.isPresent()?employee.get():new Employee();
    }

    @Override
    public Employee CreateEmployee(RegisterEmployee registerEmployee) {
        Employee emp=Employee.builder()
                .first_name(registerEmployee.first_name())
                .last_name(registerEmployee.last_name())
                .email(registerEmployee.email())
                .tittle(registerEmployee.tittle())
                .build();
        return employeeRepo.save(emp);
    }

    @Override
    public String DeleteEmployee(String uuid)
    {
        employeeRepo.deleteById(uuid);
        return "Employee with id "+uuid+" was deleted.";
    }

    @Override
    public Employee UpdateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

}
