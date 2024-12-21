package com.saitokazumasa.saitokazumasa.controller;

import com.saitokazumasa.saitokazumasa.bean.form.MailForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"", "/", "/index"})
public class IndexController {
    @GetMapping
    public String get(final Model model) {
        final var mailForm = MailForm.empty();
        model.addAttribute("mailForm", mailForm);
        return "index";
    }

    @PostMapping
    public String post(
            final @Validated MailForm mailForm,
            final BindingResult bindingResult
    ) {
        if (bindingResult.hasErrors()) return "index";

        System.out.println(mailForm);
        // TODO: メール送信

        return "redirect:/";
    }
}
