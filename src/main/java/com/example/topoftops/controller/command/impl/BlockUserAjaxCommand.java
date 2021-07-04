package com.example.topoftops.controller.command.impl;

import com.example.topoftops.controller.command.AjaxCommand;
import com.example.topoftops.exception.ServiceException;
import com.example.topoftops.model.service.UserService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

import static com.example.topoftops.controller.command.RequestParam.*;

/**
 * The command is responsible for blocking user
 *
 * @author Ilya Tsvetkov
 * @see AjaxCommand
 */
public class BlockUserAjaxCommand implements AjaxCommand {
    private static final Logger logger = LogManager.getLogger();
    private UserService userService;

    public BlockUserAjaxCommand(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void execute(HttpServletRequest request) {
        try {
            String userid = request.getParameter(PARAM_NAME_USER);
            userService.block(userid);
        } catch (ServiceException e) {
            logger.log(Level.ERROR, e);
        }
    }
}
