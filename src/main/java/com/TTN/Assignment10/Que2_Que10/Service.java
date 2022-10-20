package com.TTN.Assignment10.Que2_Que10;

import com.TTN.Assignment10.Que2_Que10.Exception.EmpNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class Service {
    private static List<Employee> data = new ArrayList<>();
    static {
        data.add(new Employee(101,"Geetanjali" , 22));
        data.add(new Employee(102,"Aman" , 23));
        data.add(new Employee(103, "Muskaan" , 24));
        data.add(new Employee(104, "Sager", 26));

    }

    public static List<Employee> findAll() {
        return data;
    }
    public Employee findOne(int id){
        
        Predicate<? super Employee> predicate= data -> data.getId()==id;
         return  data.stream().filter(predicate).findFirst().orElse(null);
    }


    public String save(Employee employee) {

        data.add(employee);
        return "Success";
    }
    //method delete
    public boolean delete(int id ){

        //functional programming
      return data.removeIf(employee -> employee.getId()==id);

        //deleting by id
       // data.remove(predicate);
    }

    //Implement put method .
    public String updateById(int  id, Employee employee)
    {
        Predicate<? super Employee> predicate = em -> em.getId()==id;
        Employee emp = data.stream()
                .filter(predicate)
                .findAny()
                .orElseThrow(()-> new EmpNotFoundException("Employee not exists"));
        emp.setName(employee.getName());
        emp.setAge(employee.getAge());
        return "Success";
    }
    //Apply validation while
    // create a new employee using POST http Request.
// create user
 /*   @PostMapping("/users")
    public ResponseEntity<Employee> createUser(@Valid @RequestBody Employee
                                                       employee)
    {
        Employee save=employeeService.save(employee);
        URI location= ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(save.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }*/
   // @PostMapping("")


}
