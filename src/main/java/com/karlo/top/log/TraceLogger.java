package com.karlo.top.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能描述:
 *
 * @author karlo
 * @date 2018/10/27 23:21
 * @since 1.0.0
 */

public class TraceLogger {
    //此处的"tranceLog"为log4j中定义的对应的 logger的name
    private static final Logger TRACE_LOGGER = LoggerFactory.getLogger("traceLog");

    private TraceLogger() {

    }

    public static void info(String message){
        TRACE_LOGGER.info(message);
    }

    public static void info(String format,Object... arguments){
        TRACE_LOGGER.info(format, arguments);
    }

}
