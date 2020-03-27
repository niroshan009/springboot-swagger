package com.thusitha.swagger.util;

import com.thusitha.swagger.enums.GDCType;
import org.slf4j.MDC;

public final class MDCUtil {
    private  MDCUtil(){}

    public static void removeDiagnosticContext(){
        for(GDCType type : GDCType.values()){
            MDC.remove(type.toString());
        }
    }

    public static void clearDiagnosticContext(){
        MDC.clear();
    }
    public  static void put(String key, String value){
        MDC.put(key,value);
    }
}
