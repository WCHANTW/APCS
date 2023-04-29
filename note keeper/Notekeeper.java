//part a
import java.util.ArrayList;
public class Notekeeper
{

    private ArrayList<Note> noteList;

    public Notekeeper()
    {
        noteList = new ArrayList<Note>();
    }

    public void add(Note NoteIn)
    {
        this.noteList.add(NoteIn);
    }


public void printNotes()
{
    int count = 1;
    for (Note note: noteList)
    {
        System.out.println(count + "." + note.getNote());
        count++;
    }
}
//alternative solution
/*public void printNotes()
{
    for (int index=0; index < noteList.size(); index++)
    System.out.println(index + 1 +"." + noteList.get(index).getNote());
}/* */
// part b
public void removeNotes(String str)
{
    int index = 0;
    while (index < noteList.size())
    {
        String note = noteList.get(index).getNote();
        if (note.indexOf(str) == -1)
            index++;
        else 
            noteList.remove(index);
    }
}

}
/*In part b you should increment the index only if you don't remove a note.
 * This is because removing an element causes all notes folllowing the removed item to shift one slot to the left.
 * If, at the same time, the index moves to the right, you may miss elements that need to be removed.
 */
