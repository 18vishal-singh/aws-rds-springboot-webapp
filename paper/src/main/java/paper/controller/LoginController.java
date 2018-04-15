package paper.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import paper.dao.CustomerRepository;
import paper.dao.DriverRepository;
import paper.model.Customer;
import paper.model.Driver;

@Controller
public class LoginController {

	@Autowired
	private DriverRepository driverRepository;

	@Autowired
	private CustomerRepository customerRepository;
	
	RedirectView rv = new RedirectView();

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String showLoginPage(HttpServletRequest request) {
		return "index";
	}

	@ModelAttribute("drivers")
	public List<Driver> getDrivers() {
		return (List<Driver>) driverRepository.findAll();
	}

	@ModelAttribute("customers")
	public List<Customer> getCustomers() {
		return (List<Customer>) customerRepository.findAll();
	}

	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public RedirectView showDriverOrCustomer(HttpServletRequest request, @RequestParam("user") String name) {
		
		if (name.equals("driver")) {
			rv.setUrl("driver");
			return rv;
		}
		if (name.equals("customer")) {
			rv.setUrl("customer");
			return rv;
		} else {
			rv.setUrl("index");
			return rv;
		}
	}

	@RequestMapping(value = "/driver")
	public String showDriverPage() {
		return "driver";
	}

	@RequestMapping(value = "/driver", method = RequestMethod.POST)
	public RedirectView getDriverDetails(HttpServletRequest request, @RequestParam("drivername") String name,
			@RequestParam("vehicle_no") String vehicle_no, @RequestParam("dcity") String dcity,
			@RequestParam("pcity") String pcity, @RequestParam("mobileno") String mobileno) {
		Driver d = new Driver(name, vehicle_no, dcity, pcity, mobileno);
		driverRepository.save(d);
		rv.setUrl("index");
		return rv;
	}

	@RequestMapping(value = "/customer")
	public String showCustomerPage(ModelMap model) {
		return "customer";
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public RedirectView getCustomerDetails(HttpServletRequest request, @RequestParam("customername") String name,
			@RequestParam("dcity") String dcity, @RequestParam("pcity") String pcity,
			@RequestParam("mobileno") String mobileno) {
		Customer c = new Customer(name, dcity, pcity, mobileno);
		customerRepository.save(c);
		rv.setUrl("index");
		return rv;
	}

}
