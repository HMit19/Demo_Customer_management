package cg.wbd.grandemonstration.controller;

import cg.wbd.grandemonstration.model.Customer;
import cg.wbd.grandemonstration.service.CustomerServiceFactory;
import cg.wbd.grandemonstration.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    private ICustomerService customerService = CustomerServiceFactory.getInstance();

    @GetMapping("/customers")
    public ModelAndView listCustomers() {
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("customers", customerService.findAll());
        return modelAndView;
    }

    @GetMapping("/info")
    public ModelAndView showInfo(@RequestParam Long id) {
        ModelAndView modelAndView = new ModelAndView("/info");
        Customer customer = customerService.findOne(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
}
