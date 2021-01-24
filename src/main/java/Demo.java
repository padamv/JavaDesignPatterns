
public class Demo {
    public static void main(String[] args) throws Exception {
        Journal journal = new Journal();

        journal.addEntry("I cried today");
        journal.addEntry("I ate a bug");
        System.out.println(journal);

        Persistence journalPersistence = new Persistence();
        String filename = "journal.txt";
        journalPersistence.saveToFile(journal, filename, true);

        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
