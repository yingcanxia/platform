package com.experimental;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        // 定义filter的类型，四种：pre,route,post,error
        return "pre";
    }

    @Override
    public int filterOrder() {
        // 定义filter的顺序,字数越小优先级又高,越先执行
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        // 是否要执行filter
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // filter中需要做的操作
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        // 需要过滤http请求是否携带了filter
        String token = request.getParameter("token");
        System.out.println(token);
        if (token == null){
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("没有token");
            } catch (IOException e) {

                e.printStackTrace();
            }
            return null;
        }
        return null;
    }
}
