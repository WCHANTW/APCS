public class Note {

    String strSaved;

    public Note()
    {
        strSaved = "";
    }

    public Note(String strPassIn)
    {
        strSaved = strPassIn;
    }

    public String getNote()
    {
        return strSaved;
    }
}
