import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Main {
    public static  void main(String[] args) throws IOException {

        FileReader file = new FileReader("C:\\Users\\Пользователь\\IdeaProjects\\Laba_4\\foreign_names.csv");
        CSVReader reader = new CSVReader(file, ';');
        String[] nextStr;
        List<Person> prsn = new ArrayList<>();

        while ((nextStr = reader.readNext()) != null) {
            Random rndm = new Random();
            int num = rndm.nextInt(25000);
            prsn.add(new Person(nextStr[0], nextStr[1], nextStr[2], nextStr[5], nextStr[3], nextStr[4],num));

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