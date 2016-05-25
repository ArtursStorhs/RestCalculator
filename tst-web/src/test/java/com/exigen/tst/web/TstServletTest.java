package com.exigen.tst.web;


import org.junit.Test;
import org.mockito.InOrder;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

import static org.mockito.Mockito.*;


public class TstServletTest {

    @Test
    public void doGet() throws IOException, ServletException {

        TstServlet servlet = new TstServlet();

        PrintWriter writer = mock(PrintWriter.class);
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getParameter("key")).thenReturn("a");
        when(response.getWriter()).thenReturn(writer);


        servlet.doGet(request, response);
        InOrder inOrder = inOrder(request, response,writer);

        verify(request).getParameter("key");
        verify(response).setContentType("text/html");
        verify(writer).println("a = pizza");


        inOrder.verify(request).getParameter("key");
        inOrder.verify(response).setContentType("text/html");
        inOrder.verify(writer).println("a = pizza");
    }

}



