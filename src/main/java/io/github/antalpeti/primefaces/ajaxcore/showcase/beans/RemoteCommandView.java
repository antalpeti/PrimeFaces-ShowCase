package io.github.antalpeti.primefaces.ajaxcore.showcase.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name="ajaxcoreRemoteCommandView")
public class RemoteCommandView {

	public void execute() {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Executed", "Using RemoteCommand."));
	}
}