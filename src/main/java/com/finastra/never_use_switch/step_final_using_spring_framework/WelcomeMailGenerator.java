package com.finastra.never_use_switch.step_final_using_spring_framework;

import org.springframework.stereotype.Component;

/**
 * @author Binyamin Regev
 * @since 1.8
 */
@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        //50 lines of code
        return "<html> Welcome new client </html>";
    }

    @Override
    public int getMyCode() {
        return 1;
    }
}
