import java.util.Set;
import java.util.HashSet;

class UserSessionManager
{
    private static UserSessionManager instance;
    private Set<String> activeUser;

    private UserSessionManager()
    {
        activeUser = new HashSet();
    }

    public static UserSessionManager createOrReturnInstance()
    {
        if ( instance == null)
        {
            instance = new UserSessionManager();
        }
        return (instance);
    }

    public void addUser(String user)
    {
        activeUser.add(user);
    }

    public void removeUser(String user)
    {
        activeUser.remove(user);
    }

    public Set<String> getActiveUser()
    {
        return (activeUser);
    }
}
