class Settings
{
    private static Settings set;

    private Settings()
    {
        //les paramètres globaux
    }

    public static Settings createOrReturnInstance()
    {
        if ( set == null)
            set = new Settings();
        
        return (set);
    }
}
