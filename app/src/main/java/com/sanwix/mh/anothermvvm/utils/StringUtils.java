package com.sanwix.mh.anothermvvm.utils;

import java.security.SecureRandom;

public final class StringUtils
{
    public static final String Empty = "";

    public static boolean isNullOrEmpty(String str)
    {
        return (str == null || str.isEmpty());
    }

    public static boolean isNullOrBlanckSpace(String str)
    {
        return str == null || str.equals(" ");
    }


    public static String randomString(int len)
    {
        final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public static String randomEmail(int len)
    {
        final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        StringBuilder sb2 = new StringBuilder(6);
        for (int i = 0; i < 6; i++)
            sb2.append(AB.charAt(rnd.nextInt(AB.length())));

        return sb.toString().concat("@").concat(sb2.toString()).concat(".com");
    }

    public static String randomPhone()
    {
        final String PR = "12356789";
        final String AB = "0123456789";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(11);
        sb.append("09");
        for (int i = 0; i < 2; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        for (int i = 0; i < 7; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }


}
