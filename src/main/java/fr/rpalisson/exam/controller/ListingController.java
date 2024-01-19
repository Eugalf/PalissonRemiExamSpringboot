package fr.rpalisson.exam.controller;

import fr.rpalisson.exam.entity.Listing;
import fr.rpalisson.exam.service.ListingService;
import fr.rpalisson.exam.mapping.UrlRoute;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
@AllArgsConstructor
@RequestMapping(path="/listing", name = "AppCar")
public class ListingController {

    private final ListingService listingService;

    @GetMapping(path = UrlRoute.URL_LISTING + "/{id}", name="show")
    public ModelAndView show(@PathVariable Long id,
                             ModelAndView mav
    ) {
        Listing listing = listingService.getObjectById(id);

        mav.setViewName("car/show");
        mav.addObject("listing", listing);
        return mav;
    }

}