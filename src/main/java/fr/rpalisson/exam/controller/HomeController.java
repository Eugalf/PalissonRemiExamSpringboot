package fr.rpalisson.exam.controller;

import fr.rpalisson.exam.service.ListingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/", name = "AppCar")
@AllArgsConstructor
public class HomeController {

    private final ListingService listingService;

    @GetMapping(name="index")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index");
        mav.addObject("announceReleased", listingService.findTop12ByOrderByPublishedAtDesc());
        return mav;
    }

}
