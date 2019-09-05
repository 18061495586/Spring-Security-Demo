package com.spring.security.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @Author: Hutengfei
 * @Description:
 * @Date Create in 2019/9/3 20:50
 */
public class NotLoginException extends AuthenticationException {

    public NotLoginException(String msg, Throwable t) {
        super(msg, t);
    }

    public NotLoginException(String msg) {
        super(msg);
    }
}
