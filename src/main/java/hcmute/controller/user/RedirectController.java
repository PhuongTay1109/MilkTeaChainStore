package hcmute.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("")
public class RedirectController {
	@RequestMapping("/")
    public String Index() {
        return "redirect:/security/login";
    }
	@GetMapping(value="/test")
	public String IndexTest() {
		return "user/test";
	}
}
