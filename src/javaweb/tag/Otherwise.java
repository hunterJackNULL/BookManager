package javaweb.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Otherwise extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		Choose parent = (Choose) getParent();
		if (!parent.getStop()) {
			JspFragment jspBody = getJspBody();
				jspBody.invoke(null);
		}
	}
}