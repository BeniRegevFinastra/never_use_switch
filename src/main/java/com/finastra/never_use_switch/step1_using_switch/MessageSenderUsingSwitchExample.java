package com.finastra.never_use_switch.step1_using_switch;

import java.util.Random;

/**
 * <div>
 *     <h2>Step 1: Using <i>switch</i> statement</h2>
 *     <p>  Simple example, random (mock) sending different
 *          message. As it was in procedure programming, at
 *          pre-Object-Oriented times, using switch-case, or
 *          choose-case.
 *     </p>
 *     <p>  This way when need to add another case a lot of
 *          boilerplate code will be added, and procedure(s)
 *          that is/are already working might be affected.
 *     </p>
 * </div>
 * @author Beni Regev
 */
public class MessageSenderUsingSwitchExample {
    private static final int MESSAGE_TYPES_COUNT = 5; // Number of possible/available messages

    private void sendMailWelcome() {
        this.send("Welcome aboard e-mail");
    }

    private void sendMailHappyBirthday() {
        this.send("Happy Birthday e-mail");
    }

    private void sendMailVerification() {
        this.send("E-mail Verification");
    }

    private void sendSMSGreeting() {
        this.send("SMS greeting");
    }

    private void sendSMSPhoneVerification() {
        this.send("SMS Phone Verification");
    }

    private void send(String msg) {
        System.out.println(msg + " was sent");
    }

    public void sendMessage(int messageCode) {
        switch (messageCode) {
            case 1:
                this.sendMailHappyBirthday();
                break;
            case 2:
                this.sendMailWelcome();
                break;
            case 3:
                this.sendMailVerification();
                break;
            case 4:
                this.sendSMSPhoneVerification();
                break;
            case 5:
                this.sendSMSGreeting();
                break;
            default:
                System.out.println("message type " + messageCode + " is not recognized");
        }
    }

    public static void main(String[] args) {
        MessageSenderUsingSwitchExample example = new MessageSenderUsingSwitchExample();
        Random random = new Random();

        for(int i=0; i<20; i++) {
            int messageType = random.nextInt(MESSAGE_TYPES_COUNT) + 1;
            example.sendMessage(messageType);
        }
    }
}
