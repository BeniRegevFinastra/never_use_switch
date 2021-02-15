package com.finastra.never_use_switch.step_final_using_spring_framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author Binyamin Regev
 * @since 1.8
 */
@Service
public class MailInfoMockProducer {
    private Random random = new Random();

    @Autowired
    private MailSender mailSender;


    //this method should run every second
    @Scheduled(fixedDelay = 1000)
    public void generateSteamMailInfo() {

        int i = random.nextInt(mailSender.getMapSize()) + 1;
        MailInfo mailInfo = new MailInfo(i);
        mailSender.sendMail(mailInfo);
    }
}
