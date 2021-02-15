package com.finastra.never_use_switch.step_final_using_spring_framework;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <div>
 *     <p>  This class used to pass parameters and values to {@link MailGenerator}
 *          implementing classes. Currently in this simple example it's only {@code myCode},
 *          but it can be extended in your implementation.
 *     </p>
 * </div>
 * @author Binyamin Regev
 * @since 1.8
 */
@Data
@AllArgsConstructor
public class MailInfo {
    private int mailCode;
}
