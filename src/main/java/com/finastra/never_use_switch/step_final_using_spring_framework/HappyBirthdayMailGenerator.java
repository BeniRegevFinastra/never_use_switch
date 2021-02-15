package com.finastra.never_use_switch.step_final_using_spring_framework;

import org.springframework.stereotype.Component;

/**
 * @author Binyamin Regev
 * @since 1.8
 */
@Component("1")
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "happy birthday";
    }

    @Override
    public int getMyCode() {
        return 3;
    }
}
