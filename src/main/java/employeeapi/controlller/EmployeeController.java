package employeeapi.controlller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import employeeapi.model.Employee;
import employeeapi.service.EmployeeService;

@Controller
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeservice;

	@RequestMapping("/")
	public String home() {
		
		return "employeeform";
	}
	
	@RequestMapping(path = "/processform",method = RequestMethod.POST)	
	public String create(@ModelAttribute Employee employee) { 
		
		
		System.out.println("In Controller"+employee);
		this.employeeservice.create(employee);
		
		return "formsucessmsg";
	}
	
	
	@RequestMapping(path="/getdata",method=RequestMethod.GET)
	public String getData(Model model) {
		List<Employee> data = this.employeeservice.getData();
		model.addAttribute("employeeList",data);
		return "showdata";
	}
	
	
	@RequestMapping(path="/getById/{id}",method=RequestMethod.GET)
	public String getById(@PathVariable("id") int id,Model model) {
		Employee data = this.employeeservice.getById(id);
	    List<Employee> listdata = Arrays.asList(data);
		model.addAttribute("employeeList",listdata);
		return "showdata";
	}
	
	@RequestMapping(value="/deleteById/{id}",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String deleteById(@PathVariable("id") int id) { 
		System.out.println(id);
		Employee data = this.employeeservice.deleteById(id);
		return "deletemsg";
	}
	
	@RequestMapping(value="/updateById/{id}",method= RequestMethod.GET)
	public String updateById(@PathVariable("id") int id,Model model) { 
		System.out.println(id);
		Employee data = this.employeeservice.getById(id);

		model.addAttribute("empdata", data);
		//this.employeeservice.updateById(id,data)
		return "updateform";
	}
	
	@RequestMapping(value = "/saveupdate",method = RequestMethod.POST)	
	public String saveupdate(@ModelAttribute Employee employee) { 
		
		System.out.print("controller update");
		this.employeeservice.update(employee);
//		
		return "formsucessmsg";
	}
	
	
}
