package javaweb.tag;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ForEach extends SimpleTagSupport{
	//items var
	private Map<String,Object> items;
	private String var;
	public void setItems(Map<String,Object> items) {
		this.items = items;
	}
	public void setVar(String var) {
		this.var = var;
	}
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspFragment jspBody = getJspBody();
		PageContext pageContext = (PageContext)getJspContext();
		Set<Entry<String, Object>> entrySet = items.entrySet();
		for(Entry<String, Object> entry:entrySet){
			pageContext.getSession().setAttribute(var, entry);
			jspBody.invoke(null);
		}
	
	}
}
