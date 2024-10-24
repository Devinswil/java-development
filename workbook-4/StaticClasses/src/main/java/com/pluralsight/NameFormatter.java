package com.pluralsight;

public class NameFormatter {
    private NameFormatter() {
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        StringBuilder format = new StringBuilder();
        if (!prefix.isEmpty()) {
            format.append(prefix).append(" ");
        }
        if (!firstName.isEmpty()) {
            format.append(firstName);
        }
        if (!middleName.isEmpty()) {
            format.append(middleName).append(" ");
        }
        if (!lastName.isEmpty()) {
            format.append(lastName).append(" ");
        }
        if (!suffix.isEmpty()) {
            format.append(suffix);

        }
        return format.toString();
    }
    public static String format(String firstName,String lastName){
        return format(null,firstName,null,lastName,null);
    }

}