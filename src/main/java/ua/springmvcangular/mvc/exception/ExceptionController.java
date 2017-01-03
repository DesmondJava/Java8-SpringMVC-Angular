package ua.springmvcangular.mvc.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vshevchen on 30.12.2016.
 */
@Controller
public class ExceptionController {

    @RequestMapping(value = "/runtimeException", method = RequestMethod.GET)
    public void throwException( ) {
        throw new RuntimeException();
    }
}
