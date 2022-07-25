/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class Utility {

    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm aa");
     public static SimpleDateFormat timeFormat2 = new SimpleDateFormat("HH:mm:ss");

    public static String getDateToString(Date date) {
        if (date == null) {
            return null;
        } else {
            return dateFormat.format(date);
        }

    }

    public static Date getStringToDate(String date) {
        if (date == null) {
            return null;
        } else {
            java.sql.Date data;

            try {
                data = new java.sql.Date(dateFormat.parse(date).getTime());
            } catch (ParseException ex) {
                return null;
            }

            return data;
        }

    }

    public static java.sql.Time getStringToTime(String time) {
        if (time == null) {
            return null;
        } else {
            java.sql.Time time1;

            time1 = java.sql.Time.valueOf(time);

            return time1;
        }

    }

    public static String getTimeToString(java.sql.Time time) {
        if (time == null) {
            return null;
        } else {
            return timeFormat.format(time);
        }

    }
    
       public static String getTimeToString2(java.sql.Time time) {
        if (time == null) {
            return null;
        } else {
            return timeFormat2.format(time);
        }

    }
}
