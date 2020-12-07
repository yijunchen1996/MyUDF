package com.bigdata;

import org.apache.hadoop.hive.ql.exec.UDF;

public class ifLeapYear extends UDF {
    String year=null;
    public String evaluate(final String hiredate) {
        if (hiredate.length()>0) {
            String[] dates = hiredate.split("-");
            year=dates[0];
            int year2int=Integer.parseInt(year);
            if(year2int%4==0&&year2int%100!=0){
                return "leap year";
            }else if(year2int%400==0){
                return "leap year";
            }else{
                return "nonononoleap year";
            }
        }
        return null;
    }
}
