package lucky;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import utils.FileUtils;

import java.io.IOException;
import java.util.*;

public class Winner {

    @Test
    public void test_array_vs_varargs() {

        Integer[] numbers = new Integer[4];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;

        System.out.println("\n1. Array argument:");
        printNumbers(numbers);
        // printNumbers();  //- this does not work

        System.out.println("\n\n1.Varargs - array param:");
        printNumbersVarargs(numbers);

        System.out.println("\n\n2.Varargs - no params:");
        printNumbersVarargs();

        System.out.println("\n3.Varargs - multiple params:");
        printNumbersVarargs(0, 1, 2, 3);

    }


    public <T> void printArray(T[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void printNumbers(Integer[] numbers){

        printArray(numbers);
    }

    public void printNumbersVarargs(Integer... numbers){

        printArray(numbers);
    }


   private void printArray(Integer[] numbers) {

        printArray(numbers);
    }

    private void printArray(String[] strings) {

        printArray(strings);
        /*for (int i = 0; i < strings.length; i++) {
            //System.out.println("Place " + (i+1) + " : " + strings[i]);
            System.out.print(numbers[i] + ", ");
        }*/
    }

    private List<String> getParticipants() throws IOException {

        return FileUtils.fileLinesToList(
                "Resource",
                "lucky",
                "participants.txt"
        );
    }

    private List<String> getAbsents() throws IOException {

        return FileUtils.fileLinesToList(
                "Resource",
                "lucky",
                "absents.txt"
        );
    }

    @Test
    public void test_get_participants_and_absents() throws IOException {

        System.out.println("Participants: " + getParticipants());
        System.out.println("Absents: " + getAbsents());
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

    private String getWinner(List<String> participants) {

        //System.out.println("Participants: " + participants.size());

        Collections.shuffle(participants,
            new Random(System.currentTimeMillis()));

        return participants.remove(0);
    }

}
