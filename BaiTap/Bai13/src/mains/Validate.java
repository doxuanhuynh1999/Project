package mains;

import exceptios.BirthDayException;
import exceptios.EmailException;
import exceptios.NameException;
import exceptios.PhoneException;

public class Validate {
    public static boolean checkEmail(String email) {
        String regex = "^[a-zA-Z][a-zA-Z0-9\\-_]+@[a-zA-Z]+(\\.[a-zA-Z]+){1,3}$";
        if (email.matches(regex)) {
            return true;
        } else {
            try {
                throw new EmailException("Bạn hãy điền lại");
            } catch (EmailException e) {
                System.out.println(e);
            }
            return false;
        }
    }

    public static boolean checkPhone(String number) {
        String regex = "^((09|03)+([0-9]{8}))$";
        if (number.matches(regex)) {
            return true;
        } else {
            try {
                throw new PhoneException("Bạn hãy điền lại");
            } catch (PhoneException e) {
                System.out.println(e);
            }
            return false;
        }
    }

    public static boolean checkName(String name) {
        String regex = "^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}";
        if (name.matches(regex)) {
            return true;
        } else {
            try {
                throw new NameException("Bạn hãy điền lại");
            } catch (NameException e) {
                System.out.println(e);
            }
            return false;
        }
    }

    public static boolean checkBirth(String birthDay) {
        String regex = "\\d{1,2}-\\d{1,2}-\\d{4}";
        if (birthDay.matches(regex)) {
            return true;
        } else {
            try {
                throw new BirthDayException("Bạn hãy điền lại");
            } catch (BirthDayException e) {
                System.out.println(e);
            }
            return false;
        }
    }
}
