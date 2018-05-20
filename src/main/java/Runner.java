import db.DBHelper;
import models.Genre;
import models.Play;
import models.Playwright;
import models.Theater;

public class Runner {

    public static void main(String[] args) {

        Playwright playwright = new Playwright("Dennis McFinnieston", 43, "One Flew Over The Cuckoo's Nest");
        Play play = new Play("One Flew Over The Cuckoo's Nest", Genre.TRAGEDY, "Dennis McFinnieston",);
        Theater theater = new Theater("The Royal Globe", 10000, "123, Fake Street", 3);
        Character character = new Character("CharacterA", 2);

        DBHelper.save(playwright);
        DBHelper.save(play);
        DBHelper.save(theater);
        DBHelper.save(character);

    }
}
