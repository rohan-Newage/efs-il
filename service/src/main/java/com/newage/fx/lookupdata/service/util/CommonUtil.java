package com.newage.fx.lookupdata.service.util;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class CommonUtil {


    public String convertDate(Date date , String format){

        DateFormat convertedDate = new SimpleDateFormat(format);
        return convertedDate.format(date);
    }
}
