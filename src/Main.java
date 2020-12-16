import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Main {
    public static  void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("C:\\Users\\Пользователь\\IdeaProjects\\Laba_4\\foreign_names.csv");
        CSVReader reader = new CSVReader(fileReader, ';');
        String[] nextLine;
        List<Person> prsn = new ArrayList<>();

        while ((nextLine = reader.readNext()) != null) {
            Random rnd = new Random();
            int num = rnd.nextInt(25000);
            prsn.add(new Person(nextLine[0], nextLine[1], nextLine[2], nextLine[5], nextLine[3], nextLine[4],num));

        }
        for (int i = 1; i < prsn.size(); i++)
        {
            System.out.print(prsn.get(i).getId()+"; ");
            System.out.print(prsn.get(i).getName()+"; ");
            System.out.print(prsn.get(i).getGender()+"; ");
            System.out.print(prsn.get(i).getBirthDate()+"; ");
            System.out.print(prsn.get(i).getSubdTitle()+"; ");
            System.out.print(prsn.get(i).getSubdId()+"; ");
            System.out.print(prsn.get(i).getSalary()+"; ");
            System.out.println();
        }

    }
}