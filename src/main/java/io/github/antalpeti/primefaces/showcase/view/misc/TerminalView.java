package io.github.antalpeti.primefaces.showcase.view.misc;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "miscTerminalView")
public class TerminalView {

  public String handleCommand(String command, String[] params) {
    if (command.equals("greet")) {
      if (params.length > 0)
        return "Hello " + params[0];
      else
        return "Hello Stranger";
    } else if (command.equals("date"))
      return new Date().toString();
    else
      return command + " not found";
  }
}
