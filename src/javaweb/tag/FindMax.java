package javaweb.tag;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspPage;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;

public class FindMax implements SimpleTag{
	private String num1,num2;
	private PageContext pageContext;
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspWriter out = pageContext.getOut();
		out.write("hello!"+num1+num2);
	}
	public void setNum1(String num1) {
		this.num1 = num1;
	}
	public void setNum2(String num2) {
		this.num2 = num2;
	}
	@Override
	public JspTag getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setJspBody(JspFragment arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setParent(JspTag arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setJspContext(JspContext jspPage) {
		// TODO Auto-generated method stub
		this.pageContext = (PageContext)jspPage;
	}



}
