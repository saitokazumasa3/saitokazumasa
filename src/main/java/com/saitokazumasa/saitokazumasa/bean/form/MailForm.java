package com.saitokazumasa.saitokazumasa.bean.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MailForm {
    @NotBlank(message = "メールアドレスを入力してください")
    @Email
    private String emailAddress;

    @NotBlank(message = "件名を入力してください")
    private String subject;

    @NotBlank(message = "内容を入力してください")
    private String content;

    public static MailForm empty() {
        return new MailForm(
                "",
                "",
                ""
        );
    }
}
