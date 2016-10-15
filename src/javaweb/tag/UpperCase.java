package javaweb.tag;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class UpperCase extends SimpleTagSupport {
	private StringWriter stringWriter;
	private String time;
	public void setTime(String time) {
		this.time = time;
	}


	@Override
	public void doTag() throws JspException, IOException {

		// TODO Auto-generated method stub
		//获取jsp片段
		JspFragment jspBody = getJspBody();
		StringWriter sw = new StringWriter();
		//将标签体输出到StringWriter
		jspBody.invoke(sw);
		//变为大写
		String message = sw.toString().toUpperCase();
		//循环输出
		for(int i = 0;i<Integer.parseInt(time);i++)
			jspBody.getJspContext().getOut().print(message);
	}
	
	
}
