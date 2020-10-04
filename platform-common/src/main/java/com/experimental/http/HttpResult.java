package com.experimental.http;

import lombok.Data;

@Data
public class HttpResult {
    private int code=200;
    private String msg;
    private Object data;

    public static HttpResult error(){
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR,"未知异常请联系管理员");
    }

    private static HttpResult error(String msg){
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR,msg);
    }

    private static HttpResult error(int code,String msg){
        HttpResult r =new HttpResult();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }

    public static HttpResult success(){
        return new HttpResult();
    }
    public static HttpResult success(String msg){
        HttpResult r = new HttpResult();
        r.setMsg(msg);
        return r;
    }
    public static HttpResult success(Object data){
        HttpResult r = new HttpResult();
        r.setData(data);
        return r;
    }

}
