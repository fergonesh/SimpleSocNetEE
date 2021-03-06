package SocNET.Action;

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
        actions.put("/showalluser", new GetAllUsers());
        actions.put("/signin", new LoginUserAction());
        actions.put("/getallgroups", new GetAllGroupsAction());
        actions.put("/getgroupboard", new GetGroupBoardAction());
        actions.put("/addnewmessage", new AddNewMessageAction());
        actions.put("/getallsubcribedgroups", new GetAllSubscribedGroupsAction());
        actions.put("/getallmygroups", new GetOwnGroupsAction());
        actions.put("/mygroups",new GetMyGroupsAction());
        actions.put("/addparticipant", new AddParticipantToGroupsAction());
        actions.put("/delparticipant", new DelParticipantFromGroupsActions());
        actions.put("/getallinfogroups", new GetGroupInfoAction());
        actions.put("/signout", new SignoutAction());





    }

    public static Action getAction(HttpServletRequest request) {

        return actions.get(request.getServletPath());
    }
}
