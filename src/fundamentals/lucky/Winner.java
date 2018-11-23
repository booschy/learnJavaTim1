package fundamentals.lucky;

import utils.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static utils.ArrayUtils.printArray;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Winner {


    private List<String> getParticipants() throws IOException {

        return FileUtils.fileLinesToList(
                "Resource",
                "fundamentals/lucky",
                "participants.txt"
        );
    }


    private List<String> getAbsents() throws IOException {

        return FileUtils.fileLinesToList(
                "Resource",
                "fundamentals/lucky",
                "absents.txt"
        );
    }


    @Test
    public void test_get_participants_and_absents() throws IOException {

        System.out.println("Participants: " + getParticipants());
        System.out.println("Absents: " + getAbsents());
    }


    private String getWinner(List<String> participants) {

        //System.out.println("Participants: " + participants.size());

        Collections.shuffle(participants,
                new Random(System.currentTimeMillis()));

        return participants.remove(0);
    }


    @Test
    public void main_flow() throws IOException {

        List<String> participants = getParticipants();
        int allCount = participants.size();

        List<String> absents = getAbsents();
        int absentsCount = absents.size();

        boolean succeededRemovingAbsents = participants.removeAll(absents);
        //System.out.println("succeededRemovingAbsents: " + succeededRemovingAbsents);

        int countAfterRemovingAbsents = participants.size();

        assertEquals(
                allCount - absentsCount,
                countAfterRemovingAbsents);

        //System.out.println("Random seed: " + System.currentTimeMillis());

        String[] winners = new String[3];
        for(int i=0; i < 3; i++){
            winners[i] = getWinner(participants);
        }

        printArray(winners);
    }

}
