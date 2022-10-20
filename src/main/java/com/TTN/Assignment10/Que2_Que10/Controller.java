package com.TTN.Assignment10.Que2_Que10;

import com.TTN.Assignment10.Que2_Que10.Exception.EmpNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Service service;
    //public Controller(Service service){
     //   this.service=service;
   // }

    //This mapping for data retrieveing
    @GetMapping("/data")
    public List<Employee> retrieveAllEmp (){

        return service.findAll();
    }
    //THis mapping for one data retrieve

   /* @GetMapping("/data/{id}")
    public Employee retrieveEmp(@PathVariable int id ){
        return  service.findOne(id);
        }*/

//This is for Exception handling .
    @GetMapping("/data/{id}")
    public Employee retrieveEmployee (@PathVariable int id ){
        Employee data =service.findOne(id);
        if (data==null)

            throw new EmpNotFoundException("id:"+ id);


        return data;
    }

    @PostMapping("/data")
    public String createEmp (@Valid @RequestBody Employee employee) {
        String result = service.save(employee);
        return result;

    }
    //This is for Delete Mapping
    @DeleteMapping("/data/{id}")
    public void delete (@PathVariable int id){
        service.delete(id);
    }
    
    //This is put method
   @PutMapping(path = "/data/{id}")
    public String updateEmployee(@RequestBody Employee employee, @PathVariable int  id)
    {
        String res = service.updateById(id, employee);
        return res;
    }




}
