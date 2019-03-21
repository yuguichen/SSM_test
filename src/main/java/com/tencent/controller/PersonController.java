package com.tencent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tencent.model.Person;
import com.tencent.service.IPersonService;

@Controller
@RequestMapping("/personController")
public class PersonController {

    private IPersonService personService;
    
    public IPersonService getPersonService() {
        return personService;
    }

    @Autowired
    public void setPersonService(IPersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/showPerson")
    public String showPersons(Model model){
    	//System.out.print("hell springMVC");
    	//Person person = new Person("me",2);
        //List<Person> persons = new ArrayList();
        //persons.add(person);
    	List<Person> persons = personService.loadPersons();
    	for(Person person:persons)
    		System.out.println(person);
        model.addAttribute("persons", persons);
        return "showperson";
    }

}
