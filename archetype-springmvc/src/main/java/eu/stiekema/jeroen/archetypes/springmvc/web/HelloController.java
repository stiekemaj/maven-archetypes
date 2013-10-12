package eu.stiekema.jeroen.archetypes.springmvc.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jeroen Stiekema
 */
@Controller
public class HelloController {
    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    /**
     * HTTP requests to /welcome are mapped to the printWelcome() method.
     * <p/>
     * Passes the Model to the view 'hello.jsp' (see mvc-dispatcher-servlet.xml)
     */
    @RequestMapping("/hello")
    public String printWelcome(Model model) {
        log.debug("entering printWelcome");
        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";
    }
}
