package chapter12;

import java.util.HashMap;
import java.util.Map;

public class ReadingGrades {
    //Calling the TestResults class and its methods which contains two maps and then, compare one another
    //in order to determine what is the highest grade of each student. Finally, we store the results
    //in a new/third map and print it.

    public static void main(String[] args){
        Map<String, Integer> grade1 = TestResults.getOriginalGrades();
        Map <String, Integer>grade2 = TestResults.getMakeUpGrades();

        Map<String, Integer> finalGrade = new HashMap<>();

        for (var entry : grade1.entrySet()){
            for (var bark : grade2.entrySet()){
                if (entry.getKey() == bark.getKey()){
                    if (entry.getValue() > bark.getValue()){
                        finalGrade.put(entry.getKey(), entry.getValue());
                    }else{
                        finalGrade.put(bark.getKey(), bark.getValue());
                    }
                }
            }
        }
        System.out.println(finalGrade);
    }

}
