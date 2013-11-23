package control.Action;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: pasha
 * Date: 11/14/13
 * Time: 11:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class ActionFactory {

    private static final Map<String,Action> actions;
    static{
        actions = new HashMap<String, Action>();
        actions.put("/signup", new SignUpAction());
//        actions.put("/signin", new SignInAction());
//        actions.put("/signout", new SignOutAction());
//        actions.put("/search", new SearchAction());
//        actions.put("/smsettings", new SmSettingsAction());
//        actions.put("/adsettings", new SmSettingsAction());
//        actions.put("/confirmation", new ConfirmationAction());
//        actions.put("/smgetallusers", new SmGetAllUsersAction());
    }

    public static Action getAction(HttpServletRequest request) {

        return actions.get(request.getServletPath());
    }
}