package  com.first.springbootproject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class TestController {


    @RequestMapping("/test")
    @ResponseBody
    public  String handle()
    {
        return  "Just for funnnn";
    }
}
