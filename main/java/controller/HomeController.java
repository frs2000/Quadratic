package controller;

import javaclass.Logic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex() {
        return "index";
    }


    @RequestMapping("/result")
    public String getoAaa(HttpServletRequest request, Model model) throws InterruptedException {
        int valueA = Integer.parseInt(request.getParameter("valueA"));
        int valueB = Integer.parseInt(request.getParameter("valueB"));
        int valueC = Integer.parseInt(request.getParameter("valueC"));

        Logic logic = new Logic(valueA, valueB, valueC);
        logic.saveToDB();

        model.addAttribute("valueA", Integer.toString(valueA));
        model.addAttribute("valueB", Integer.toString(valueB));
        model.addAttribute("valueC", Integer.toString(valueC));

        int D = logic.getD();
        model.addAttribute("valueD", Integer.toString(D));

        if (D <0 ) {
            // no solution
            String error = logic.getError() ;
            model.addAttribute("valueError", error);
            return "no-sol";
        }
        if (D == 0){
            // one solution
            int x1 = logic.getX1();
            model.addAttribute("valueX1", Integer.toString(x1));
            return "one-sol";
        }
        if (D > 0){
            // two solution
            int x1 = logic.getX1();
            int x2 = logic.getX2();
            model.addAttribute("valueX1", Integer.toString(x1));
            model.addAttribute("valueX2", Integer.toString(x2));
            return "two-sol";
        }

        return "index";
    }
}