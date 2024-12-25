package com.saitokazumasa.saitokazumasa.service.implement;

import com.saitokazumasa.saitokazumasa.bean.form.MailForm;
import com.saitokazumasa.saitokazumasa.service.ISendMail;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class SendMail implements ISendMail {
    @Value("${spring.mail.username}")
    private String ServerMailAddress;
    private final JavaMailSender mailSender;

    public SendMail(final JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void execute(final MailForm mailForm) throws MessagingException {
        final var message = this.mailSender.createMimeMessage();
        final var messageHelper = new MimeMessageHelper(message, true);

        messageHelper.setFrom(this.ServerMailAddress);
        messageHelper.setTo(this.ServerMailAddress);
        messageHelper.setSubject(mailForm.getSubject());
        messageHelper.setText(mailForm.getEmailAddress() + "\n" + mailForm.getContent());

        this.mailSender.send(message);
    }
}
