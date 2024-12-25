package com.saitokazumasa.saitokazumasa.service;

import com.saitokazumasa.saitokazumasa.bean.form.MailForm;
import jakarta.mail.MessagingException;

public interface ISendMail {
    void execute(final MailForm mailForm) throws MessagingException;
}
