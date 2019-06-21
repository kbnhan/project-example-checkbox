package checkbox; 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CheckboxController {

    @GetMapping("/checkbox")
    public String quizForm(Model model) {
        model.addAttribute("checkbox", new Checkbox());
        return "checkbox";
    }

    @RequestMapping("/result")
    public String getAnswerParams(
        @RequestParam(name="box1", required=false) String animal1,
        @RequestParam(name="box2", required=false) String animal2,
        @RequestParam(name="box3", required=false) String animal3,
        @ModelAttribute Checkbox checkbox) {

            checkbox.addAnimal(animal1);
            checkbox.addAnimal(animal2);
            checkbox.addAnimal(animal3);
            return "result";
        }
   
}