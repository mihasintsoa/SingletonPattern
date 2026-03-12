import java.io.File;

class ConfigFileManager
{
    private static ConfigFileManager conf;
    private File confFile;

    private ConfigFileManager()
    {
        confFile =  new File("conf.proprties");
    }

    public static ConfigFileManager createOrReturnInstance()
    {
        if ( conf == null)
            conf = new ConfigFileManager();

        return (conf);
    }
}
