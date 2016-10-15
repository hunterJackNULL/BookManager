package javaweb.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class When extends SimpleTagSupport {
	private boolean test;

	public void setTest(boolean test) {
		this.test = test;
	}

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		Choose parent = (Choose) getParent();
		if (!parent.getStop()) {
			JspFragment jspBody = getJspBody();
			if (test) {
				parent.setStop(true);
				jspBody.invoke(null);
			} 
		}
	}
}
