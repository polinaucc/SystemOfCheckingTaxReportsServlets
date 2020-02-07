package ua.polina.servlets.controller.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class SessionLocaleFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        setLanguage(request);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    private void setLanguage(HttpServletRequest request) {
        String language = request.getParameter("lang");

        if (language != null) {
            request.getSession().setAttribute("lang", language);
        }
    }

    @Override
    public void destroy() {

    }
}

