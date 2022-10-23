package org.ttn.RestSpringBoot.internationalizationHateosCn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class Controller {
    @Autowired
    private MessageSource messageSource;
    public Controller(MessageSource messageSource){
        this.messageSource=messageSource;
    }
    @GetMapping(path = "/hello")
    public String hello(){
        return "Welcome to Spring Boot ";

    }
    @GetMapping(path = "/hello-world-international")
    public String helloInternational(){
        Locale locale=LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message",  locale);
    }

    @GetMapping(path="/hello/{username}")
    public String localized(@PathVariable String username)
    {
        Locale locale2=LocaleContextHolder.getLocale();
        String name[] = new String[]{username};
        return  messageSource.getMessage("userName",name,"Default message",locale2);


    }

}
