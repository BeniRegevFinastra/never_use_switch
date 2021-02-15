package com.finastra.never_use_switch.step4_using_interface;

import java.util.Random;

/**
 * <div>
 *     <h2>Step 3: Using an <i>Interface</i></h2>
 *     <p>  Using an <i>Interface</i> will give us more
 *          flexibility and a unified method to end any
 *          message.
 *     </p>
 *     <p>  This way is a little more advanced Object
 *          Oriented design to perform the same operation
 *          in different ways, e.g. sending different
 *          message via e-mail, SMS, MMS, etc.
 *     </p>
 * </div>
 * @author Beni Regev
 */
public class MessageSenderUsingInterfaceExample {
    private static final int MESSAGE_TYPES_COUNT = 4; // Number of possible/available messages

    private void send(String msg) {
        System.out.println(msg + " was sent");
    }

    public void generateMessage(int messageCode) {
        switch (messageCode) {
            case 1:
//                example.sendMailHappyBirthday();
                break;
            case 2:
//                example.sendMailWelcome();
                break;
            case 3:
//                example.sendMailVerification();
                break;
            case 4:
//                example.sendSMSPhoneVerification();
                break;
            default:
                System.out.println("message type " + messageCode + " is not recognized");
        }
    }
    public static void main(String[] args) {
        MessageSenderUsingInterfaceExample example = new MessageSenderUsingInterfaceExample();
        Random random = new Random();

        for(int i=0; i<20; i++) {
            int messageType = random.nextInt(MESSAGE_TYPES_COUNT) + 1;
            example.generateMessage(messageType);
        }
    }
}
