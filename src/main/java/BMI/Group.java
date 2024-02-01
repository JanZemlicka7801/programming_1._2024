package BMI;
import java.util.ArrayList;

public class Group {
    private ArrayList<Participant> Participants;

    public Group() {}

    public void addParticipant(Participant p){
        this.Participants.add(p);
    }
}
