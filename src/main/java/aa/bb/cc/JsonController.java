package aa.bb.cc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("list")
public class JsonController {
	
	@Autowired
	private MyModel mymodel;
	
	@RequestMapping(method=RequestMethod.GET)
	//자바객체를 http 객체로 전달할 때
	@ResponseBody
	public MyModel getJson(@RequestParam("name")String name) {
		
		mymodel.setName(name);
		mymodel.setSkills(new String[] {"자바전문개발자","DB준전문가"});
		return mymodel;
	}
		
}
