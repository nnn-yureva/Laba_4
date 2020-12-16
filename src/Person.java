
public class Person {

    private String id;
    private String name;
    private String gender;
    private String salary;
    private String BirthDate;
    private Subdivision subd;

    public


    Person(String idd, String nm, String gndr, String slr, String BD, String t, int id_subd)
    {
        id = idd;
        name = nm;
        gender = gndr;
        salary = slr;
        BirthDate = BD;
        subd = new Subdivision(t, id_subd);
    }

    public Person() { }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getSalary() { return salary; }
    public String getBirthDate() { return BirthDate; }
    public String getSubdTitle() { return subd.getTitle(); }
    public int getSubdId() { return subd.getId(); }


}