package tsi;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    private List<Record> records = new ArrayList<>();

    @Command
    public void createPerson(String firstName, String lastName,String email, String... phones){
        Person r= new Person();
        r.setFirstName(firstName);
        r.setLastName(lastName);
        r.setEmail(email);
        r.addPhones(phones);
        records.add(r);
    }

    @Command
    public void remove (int id){
        for (int i = 0; i<records.size(); i++){
            Record r =records.get(i);
            if (r.getId()== id) {
            records.remove(i);
            break;
            }
        }
    }

    @Command
    public void createReminder(String Reminder, String Time) {
        Reminder o = new Reminder();
        o.setText(Reminder);
        o.setTime(Time);
        records.add(o);
    }


    @Command
    public void createNote(String Note) {
        Note q = new Note();
        q.getText();
        records.add(q);
    }



   @Command
    public List<Record> list() {
        return records;
    }
}
