import java.io.FileWriter;
import java.io.IOException;

public class CreateAppDataForLanguages {
	public void saveAppData(Language[] languages){
		try {
            FileWriter writer = new FileWriter("languages.csv");
            writer.append("Language Name;Number of Units;Number of Quizzes;The number of questions in each quiz;The types of questions in each quiz\n");

            for (Language language : languages) {
                Unit[] units = language.getUnitsArray();
                for (Unit unit : units) {
                    Quiz[] quizzes = unit.getQuizArray();
                    writer.append(language.getName())
              	    .append(";")
              	    .append(String.valueOf(language.getUnitNumber()))
                    .append(";")
                    .append(String.valueOf(unit.getQuizNumber()));
         
                    for (Quiz quiz: quizzes) {   
                        writer.append(";")
                        	   .append(String.valueOf(quiz.getListeningQuestionNumber() + " Listening Questions ," + quiz.getReadingQuestionNumber() + " Reading Questions ," + quiz.getSpeakingQuestionNumber() + " Speaking Questions ," + quiz.getWordMatchingQuestionNumber() + " Word Matching Questions" ));
                        	        
                    }
                    writer.append("\n");
                }
            }

            writer.flush();
            writer.close();
            System.out.println("languages.csv file generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

		
	}
}
