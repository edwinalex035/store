package com.ed.appstore.controllers;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @Autowired
  private MessageSource messageSource;

  @GetMapping("/")
  public String index() {
    Locale locale = Locale.forLanguageTag("en");
    return messageSource.getMessage("message", null, locale);
  }
}
