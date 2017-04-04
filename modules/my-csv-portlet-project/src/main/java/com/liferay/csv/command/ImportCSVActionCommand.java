package com.liferay.csv.command;

import com.liferay.csv.portlet.MyCSVPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import org.osgi.service.component.annotations.Component;

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

    //private static final Log _log = LogFactoryUtil.getLog(ImportCSVActionCommand.class);

    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
/*
        ServiceContext serviceContext = ServiceContextFactory.getInstance(User.class.getName(), actionRequest);
        PortletContext portletContext = actionRequest.getPortletSession().getPortletContext();
        UploadPortletRequest request = PortalUtil.getUploadPortletRequest(actionRequest);
        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

        _log.debug(" :: Import CSV :: ");

        String fileName = request.getFileName("file");

        _log.debug("   File: " + fileName);

        try {
            File file = request.getFile("file");
            CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream(file), StringPool.UTF8), CharPool.SEMICOLON);

            //field1;field2;field3;field4;field5

            String[] line;
            while ((line = reader.readNext()) != null) {

                try {

                    String field1 = "";
                    String field2 = "";
                    String field3 = "";
                    String field4 = "";
                    String field5 = "";

                    if (line.length > 0) {
                        field1 = line[0];
                    }
                    if (line.length > 1) {
                        field1 = line[1];
                    }
                    if (line.length > 2) {
                        field1 = line[2];
                    }
                    if (line.length > 3) {
                        field1 = line[3];
                    }
                    if (line.length > 4) {
                        field1 = line[4];
                    }




                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
*/
        return true;
    }

}
