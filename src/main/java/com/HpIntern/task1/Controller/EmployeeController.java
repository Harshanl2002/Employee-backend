package com.HpIntern.task1.Controller;


import com.HpIntern.task1.Model.Employee;
import com.HpIntern.task1.Model.RegisterEmployee;
import com.HpIntern.task1.Repo.EmployeeRepo;
import com.HpIntern.task1.Services.EmployeeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private final EmployeeServices employeeServices;

    @GetMapping("/All")
    List<Employee> GetAllEmployees(){
        return employeeServices.GetAllEmployees();
    }

    @GetMapping("/")
    Employee getEmployeeByID(@RequestParam String uuid)
    {
        return employeeServices.getEmployeeById(uuid);
    }

    @PostMapping("/")
    Employee CreateEmployee(@RequestBody RegisterEmployee registerEmployee)
    {
        return employeeServices.CreateEmployee(registerEmployee);
    }

    @PutMapping("/update")
    Employee UpdateEmployee(@RequestBody Employee employee)
    {
        return employeeServices.UpdateEmployee(employee);
    }

    @DeleteMapping("/delete")
    String DeleteEmployee(@RequestParam String uuid)
    {
        return employeeServices.DeleteEmployee(uuid);
    }


}
