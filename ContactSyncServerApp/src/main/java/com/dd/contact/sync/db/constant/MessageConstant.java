/**
Copyright homeblackbox project to represent
All right reserved.
*/
package com.dd.contact.sync.db.constant;

public class MessageConstant {
    private static final String NULL_POINTER_EXCEPTION_CODE = "ERROR: 100";
    private static final String NULL_POINTER_EXCEPTION_MSG = "NullPointerException occured because required field is null";
    private static final String MESSAGE_SEPARATOR = " : ";
    public static String getNullExceptionMessage() {
        StringBuilder builder = new StringBuilder();
        builder.append(NULL_POINTER_EXCEPTION_CODE);
        builder.append(MESSAGE_SEPARATOR);
        builder.append(NULL_POINTER_EXCEPTION_MSG);
        return builder.toString();
    }
}
