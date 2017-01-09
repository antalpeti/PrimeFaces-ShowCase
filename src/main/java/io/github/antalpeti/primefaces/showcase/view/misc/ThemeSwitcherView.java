package io.github.antalpeti.primefaces.showcase.view.misc;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import io.github.antalpeti.primefaces.showcase.domain.Theme;
import io.github.antalpeti.primefaces.showcase.service.ThemeService;

@ManagedBean(name = "miscThemeSwitcherView")
public class ThemeSwitcherView {

  private List<Theme> themes;

  @ManagedProperty("#{themeService}")
  private ThemeService service;

  @PostConstruct
  public void init() {
    themes = service.getThemes();
  }

  public List<Theme> getThemes() {
    return themes;
  }

  public void setService(ThemeService service) {
    this.service = service;
  }
}
