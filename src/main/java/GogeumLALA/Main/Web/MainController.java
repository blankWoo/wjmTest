package GogeumLALA.Main.Web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value="/lala/main/")
public class MainController {

    @RequestMapping(value="home.do")
    public String lalaHome(HttpServletRequest request, ModelMap model)throws Exception{

        return "";
    }

}
