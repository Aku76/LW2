package fr.univ.controller;

import fr.univ.modele.CV;
import fr.univ.modele.CVList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/resume")
public class CVController {

    private CVList list = new CVList();

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public @ResponseBody CV getCVInXML(@PathVariable int id){
        return list.getCv(id);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody CVList getCVInXML(){
        return list;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public @ResponseBody CV addCv(@RequestBody CV cv){

        list.addCV(cv);
        return cv;
    }

}
