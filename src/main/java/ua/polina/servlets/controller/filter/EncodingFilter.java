package ua.polina.servlets.controller.filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain)
            throws IOException, ServletException {
        setEncoding(servletRequest, servletResponse);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    private void setEncoding(ServletRequest servletRequest,
                             ServletResponse servletResponse)
            throws UnsupportedEncodingException {
        servletResponse.setContentType("text/html");
        servletResponse.setCharacterEncoding("UTF-8");
        servletRequest.setCharacterEncoding("UTF-8");
    }

    @Override
    public void destroy() {

    }
}
