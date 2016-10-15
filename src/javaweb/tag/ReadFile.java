package javaweb.tag;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;


public class ReadFile implements SimpleTag{
	private PageContext pageContext;
	private String src;
	public void setSrc(String src) {
		this.src = src;
	}
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		InputStream inputStream = pageContext.getServletContext()
				.getResourceAsStream(src);
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(inputStream));
		JspWriter out = pageContext.getOut();
		String buffer = null;
		while(((buffer = bufferedReader.readLine())!=null)){
		out.write(buffer);
		}
		bufferedReader.close();
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
	public void setJspContext(JspContext arg0) {
		// TODO Auto-generated method stub
		this.pageContext = (PageContext)arg0;
	}

	@Override
	public void setParent(JspTag arg0) {
		// TODO Auto-generated method stub
		
	}

}
