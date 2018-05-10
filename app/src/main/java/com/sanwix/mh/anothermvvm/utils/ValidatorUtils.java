package com.sanwix.mh.anothermvvm.utils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ValidatorUtils
{
    private static String Error;

    private ValidatorUtils()
    {
    }

    public static boolean isNullOrEmpty(Object obj)
    {
        if (obj == null)
            return true;
        if (obj instanceof String)
            return ((String) obj).isEmpty();
        else if (obj instanceof List)
            return ((List) obj).isEmpty();
        return false;
    }

    public static boolean validatePhone(String phone)
    {
        if (isNullOrEmpty(phone))
        {
            Error = "لطفا شماره تلفن خود را وارد نمایید";
            return false;
        }
        Pattern p = Pattern.compile("^(09)([0-3])(\\d{8})$");
        Matcher m = p.matcher(phone);
        Error = m.matches() ? "" : "شماره تلفن معتبر نیست";
        return m.matches();
    }


    public static boolean validateNameEn(String enname)
    {
        if (isNullOrEmpty(enname))
        {
            Error = "این فیلد نمی تواند خالی باشد";
            return false;
        }
        Pattern p = Pattern.compile("[a-zA-Z\\s_-]{3,32}");
        Matcher m = p.matcher(enname);
        Error = m.matches() ? "" : "مقدار وارد شده معتبر نیست";
        return m.matches();
    }


    public static boolean validateName(String name)
    {
        if (isNullOrEmpty(name))
        {
            Error = "این فیلد نمی تواند خالی باشد";
            return false;
        }
        Pattern p = Pattern.compile("[ابپتثجچحخدذرزژسشصضطظعغفقکگلمنوهیآًٌٍٍَُِةي\\s_-]{3,32}");
        Matcher m = p.matcher(name);
        Error = m.matches() ? "" : "مقدار وارد شده معتبر نیست";
        return m.matches();
    }


    public static boolean validateEmail(String email)
    {
        if (isNullOrEmpty(email))
        {
            Error = "لطفا ایمیل خود را وارد نمایید";
            return false;
        }
        Pattern p = Pattern.compile("^[-\\w\\d\\.]+?(?:\\s*@\\s*|\\s*(?:[\\[\\]@]){3}\\s*)[-\\w\\d\\.]*?\\s*(?:dot|\\.|(?:[\\[\\]dot\\.]){3,5})\\s*\\w+$");
        Matcher m = p.matcher(email);
        Error = m.matches() ? "" : "ایمیل وارد شده معتبر نیست";
        return m.matches();
    }


    public static boolean validatePasword(String pass)
    {
        if (isNullOrEmpty(pass))
        {
            Error = "گذرواژه خود را وارد نمایید";
            return false;
        }
        Pattern p = Pattern.compile("^.*(?=.{6,120})" +
                "(?!.*\\s)" +
                "(?=.*[a-z]*)" +
                "(?=.*[A-Z]*)" +
                "(?=.*[ابپتثجچحخدذرزژسشصضطظعغفقکگلمنوهیآًٌٍَُِةيؤإأء]*)" +
                "(?=.*[\\d]*)" +
                "(?=.*[\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\-\\=\\¡\\£\\_\\+\\`\\~\\.\\,\\<\\>\\/\\?\\;\\:\\'\\\"\\\\\\|\\[\\]\\{\\}]*).*$");
        Matcher m = p.matcher(pass);
        Error = m.matches() ? "" : "گذرواژه ضعیف است،حداقل 6 کاراکتر.";
        return m.matches();
    }


    public static boolean validateVerifyCode(String code)
    {
        if (isNullOrEmpty(code))
        {
            Error = "کد شناسایی را وارد نمایید";
            return false;
        }
        Pattern p = Pattern.compile("\\d{4}");
        Matcher m = p.matcher(code);
        Error = m.matches() ? "" : "کد وارد شده معتبر نیست";
        return m.matches();
    }


    public static boolean validateSearchTerm(String term)
    {
        if (isNullOrEmpty(term))
        {
            Error = "متن جستجو را وارد نمایید";
            return false;
        }
        Pattern p = Pattern.compile("((\\w+|[ابپتثجچحخدذرزژسشصضطظعغفقکگلمنوهیًٌَُُِِّةيءئ])\\s)+");
        Matcher m = p.matcher(term);
        Error = m.matches() ? "" : "متن جستجو معتبر نیست";
        return m.matches();
    }


    public static boolean isNumber(String number)
    {
        if (isNullOrEmpty(number))
        {
            Error = "این فیلد نمی تواند خالی باشد";
            return false;
        }
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher(number);
        Error = m.matches() ? "" : "این فیلد فقط مقدار عددی می پذیرد";
        return m.matches();
    }

    public static boolean isNumber(Integer number)
    {
        if (isNullOrEmpty(number))
        {
            Error = "این فیلد نمی تواند خالی باشد";
            return false;
        }
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher(number.toString());
        Error = m.matches() ? "" : "این فیلد فقط مقدار عددی می پذیرد";
        return m.matches();
    }

    public static boolean isDecimal(String decimal)
    {
        if (isNullOrEmpty(decimal))
        {
            Error = "این فیلد نمی تواند خالی باشد";
            return false;
        }
        Pattern p = Pattern.compile("^\\d+.\\d+$");
        Matcher m = p.matcher(decimal);
        Error = m.matches() ? "" : "این فیلد فقط مقدار اعشاری می پذیرد";
        return m.matches();
    }


    public static boolean validateAddress(String address)
    {
        if (isNullOrEmpty(address))
        {
            Error = "فیلد آدرس نمی تواند خالی باشد";
            return false;
        }
        Pattern p = Pattern.compile("[ابپتثجچحخدذرزژسشصضطظعغفقکگلمنوهیآًٌٍٍَُِةي\\\\s , .و، _-]{3,150}");
        Matcher m = p.matcher(address);
        Error = m.matches() ? "" : "آدرس معتبر نیست";
        return m.matches();
    }


    public static String getError()
    {
        String d = new String(Error);
        Error = null;
        return d;
    }


    public static boolean isLocationValid(String location)
    {
        if (isNullOrEmpty(location))
        {
            Error = "لطفا محل خود را مشخص نمایید";
            return false;
        }
        return (location.split(",").length == 2);
    }
}
