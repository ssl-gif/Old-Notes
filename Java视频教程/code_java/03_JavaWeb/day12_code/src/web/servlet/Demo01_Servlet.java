package web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class Demo01_Servlet implements Servlet {

    // 初始化Servlet对象的方法
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");
    }

    // 获取Servlet配置的方法
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    // 提供服务的方法
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service...");
    }

    // 获取Servlet的一些信息：版本、作者等
    @Override
    public String getServletInfo() {
        return null;
    }

    // 销毁Servlet对象的方法
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }

}
