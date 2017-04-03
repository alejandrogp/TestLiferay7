package com.liferay.csv.command;

import com.liferay.csv.portlet.MyCSVPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;


@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + MyCSVPortletKeys.PORTLET_NAME,
                "mvc.command.name=" + MyCSVPortletKeys.IMPORT_COMMAND
        },
        service = MVCActionCommand.class
)
public class ImportCSVActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {

        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

        System.out.println("Hola " );

        return true;
    }
}
