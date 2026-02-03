package Lesson03.DotOperator;

public class PersonTest {

    public static void main(String[] args) {

        String fName = "Andreas";
        String mName = "Elias";
        String lName = "Mogensen";
        int height = 178;
        int age = 47;

        OpretNytPersonObjekt(fName, mName, lName, age, height);

        String fName2 = "Dan";
        String mName2 = "";
        String lName2 = "Loghin";
        int height2 = 164;
        int age2 = 98;

        OpretNytPersonObjekt(fName2, mName2, lName2, age2, height2);

    }

    public static void OpretNytPersonObjekt(String fName, String mName, String lName, int age, int height)
    {

        // Opretter et nyt Person-objekt
        Person p = new Person();

        // Sætter værdier
        p.firstName = fName;
        p.middleName = mName;
        p.lastName = lName;
        p.height = height;
        p.age = age;

        //Udskriv
        p.WritePersonInfo();
    }
}

