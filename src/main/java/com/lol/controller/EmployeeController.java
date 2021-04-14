package com.lol.controller;

import com.lol.dao.DepartmentDao;
import com.lol.dao.EmployeeDao;
import com.lol.entities.Employee;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

  @Autowired
  EmployeeDao employeeDao;

  @Autowired
  DepartmentDao departmentDao;

  @GetMapping("emps")
  public String list(Model model) {
    Collection<Employee> employees = employeeDao.getAll();
    model.addAttribute("emps", employees);
    return "emp/list";
  }

}
