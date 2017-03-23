package com.baobin.action;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.util.JAXBSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by hubaobin on 2017/3/23.
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, Object> res = new LinkedHashMap<String, Object>();
        res.put("getPathInfo", req.getPathInfo());
        res.put("getParameterMap", req.getParameterMap());
        res.put("getMethod", req.getMethod());
        res.put("getQueryString", req.getQueryString());
        res.put("getRequestURL", req.getRequestURL());
       /* res.put("getSession", req.getSession());
        res.put("getCookies", req.getCookies());*/
        res.put("getAttribute:body", "1" + req.getAttribute("body"));
        res.put("getParameter:body", req.getParameter("body"));

        resp.getWriter().println(JSON.toJSON(res));

    }
}
