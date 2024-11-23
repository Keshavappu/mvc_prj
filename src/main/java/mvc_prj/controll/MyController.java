package mvc_prj.controll;



import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Component
public class MyController {
	@RequestMapping("/otp")
	public String otp(ModelMap map) {
		map.put("otp", new Random().nextInt(1000, 10000));
		return "index.jsp";
	}
	
	@RequestMapping("/color")
	public String color(ModelMap map) {
		List<String> colors=Arrays.asList("red","yellow","green","blue","grey","cyan","goldenrod","hotpink","purple","violet");
		String color=colors.get(new Random().nextInt(colors.size()));
		map.put("color", color);
		return "index.jsp";
	}
	
	@RequestMapping("/fill-color")
	public String fillColor(ModelMap map,@RequestParam String color) {
		map.put("color", color);
		return "index.jsp";
	}
	
	@RequestMapping("/fill-name")
	public String fillName(ModelMap map,@RequestParam String name) {
		map.put("name", name);
		return "index.jsp";
	}

}
