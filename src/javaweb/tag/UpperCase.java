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
		//��ȡjspƬ��
		JspFragment jspBody = getJspBody();
		StringWriter sw = new StringWriter();
		//����ǩ�������StringWriter
		jspBody.invoke(sw);
		//��Ϊ��д
		String message = sw.toString().toUpperCase();
		//ѭ�����
		for(int i = 0;i<Integer.parseInt(time);i++)
			jspBody.getJspContext().getOut().print(message);
	}
	
	
}
