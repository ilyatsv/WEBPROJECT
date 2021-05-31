package com.example.WEB_App.controller.command.impl;

import com.example.WEB_App.controller.command.Command;
import com.example.WEB_App.controller.command.Router;
import com.example.WEB_App.resource.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

public class ToLoginPageCommand implements Command {
    public ToLoginPageCommand() {
    }

    @Override
    public Router execute(HttpServletRequest request) {
        Router router;
        String page = ConfigurationManager.getProperty("path.page.login");
        router = new Router(page, Router.RouteType.FORWARD);
        return router;
    }
}
