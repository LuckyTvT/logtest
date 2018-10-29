package com.karlo.top.log;

import org.apache.log4j.MDC;

/**
 * 功能描述:
 *
 * @author karlo
 * @date 2018/10/27 23:19
 * @since 1.0.0
 */

public class LogTest {
    public static void main(String[] args) {
        MDC.clear();
        MDC.put("sessionId" , "f9e287fad9e84cff8b2c2f2ed92adbe6");
        MDC.put("cityId" , 1);
        MDC.put("siteName" , "北京");
        MDC.put("userName" , "userwyh");
        TraceLogger. info("测试MDC打印一");

        MDC.put("mobile" , "110");
        TraceLogger. info("测试MDC打印二");

        MDC.put("mchId" , 12);
        MDC.put("mchName", "商户名称");
        TraceLogger. info("测试MDC打印三");

    }
}
