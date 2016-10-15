package javaweb.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Choose extends SimpleTagSupport{
	private boolean stop;
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	public boolean getStop() {
		// TODO Auto-generated method stub
		return stop;
	}
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspFragment jspBody = getJspBody();
		jspBody.invoke(null);
	}
	
}
