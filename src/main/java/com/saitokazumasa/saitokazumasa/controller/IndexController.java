package com.saitokazumasa.saitokazumasa.controller;

import com.saitokazumasa.saitokazumasa.bean.form.MailForm;
import com.saitokazumasa.saitokazumasa.service.ISendMail;
import jakarta.mail.MessagingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"", "/", "/index"})
public class IndexController {
    private final ISendMail sendMail;

    public IndexController(final ISendMail sendMail) {
        this.sendMail = sendMail;
    }

    @GetMapping
    public String get(final Model model) {
        final var mailForm = MailForm.empty();
        model.addAttribute("mailForm", mailForm);
        return "index";
    }

    @PostMapping
    public String post(
            final @Validated MailForm mailForm,
            final BindingResult bindingResult,
            final RedirectAttributes redirectAttributes
    ) throws MessagingException {
        if (bindingResult.hasErrors()) return "index";

        this.sendMail.execute(mailForm);

        redirectAttributes.addFlashAttribute("message", "メールを送信しました");
        return "redirect:/";
    }
}
