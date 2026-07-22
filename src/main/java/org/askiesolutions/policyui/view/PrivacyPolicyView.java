package org.askiesolutions.policyui.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/privacy")
public class PrivacyPolicyView {

    @GetMapping
    public String privacyPolicy(Model model) {
        model.addAttribute("title", "Privacy Policy");
        model.addAttribute("view", "pages/privacy-policy.html");
        return "layout/base";
    }
}
