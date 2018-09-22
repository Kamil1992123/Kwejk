package pl.akademiakodu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.model.Gif;

@Controller
public class GifController {


    @RequestMapping("/")
    public String listGifs(){
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif("android-explosion", "michalos", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}

