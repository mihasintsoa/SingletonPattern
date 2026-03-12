class AuthService
{
    private static AuthService auth;
    private boolean isAuthenticated;
    
    private AuthService()
    {
        isAuthenticated = false;
    }
    
    public static AuthService createOrReturnInstance()
    {
        if ( auth == null)
            auth = new AuthService();
        
        return (auth);
    }

    public void login()
    {
        isAuthenticated = true;
    }

    public void logout()
    {
        isAuthenticated = false;
    }

    public boolean isAuthenticated()
    {
        return (isAuthenticated);
    }
}
