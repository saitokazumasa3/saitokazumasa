package com.saitokazumasa.saitokazumasa.service;

import com.saitokazumasa.saitokazumasa.bean.form.MailForm;
import jakarta.mail.MessagingException;

public interface ISendMailService {
    void execute(final MailForm mailForm) throws MessagingException;
}
