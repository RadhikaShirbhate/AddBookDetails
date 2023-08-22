package BookDetails;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class Test extends GenericServlet
{
	@Override
	public void init()throws ServletException{
		//Nocode
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String BookId=req.getParameter("bcode");
		String BookName=req.getParameter("bname");
		String Auother=req.getParameter("aname");
		String Price=req.getParameter("bpri");
		String Quantity=req.getParameter("qty");
		pw.println("==========BookDetails==========");
		pw.println("<br>BookId :"+BookId);
		pw.println("<br>BookName :"+BookName);
		pw.println("<br>Auther :"+Auother);
		pw.println("<br>Book Price :"+Price);
		pw.println("<br>Book Quantity :"+Quantity);
	}
	
	@Override
	public void destroy() {
		//NoCode
	}

}
