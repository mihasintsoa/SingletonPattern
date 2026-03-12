class Logging
{
    private static Logging log;

    private Logging(){}

    public static Logging createOrReturnInstance()
    {
        if ( log == null)
        {
            log = new Logging();
        }
        
        return (log);
    }

    public void log(String msg)
    {
        System.out.println(msg);
    }
}
