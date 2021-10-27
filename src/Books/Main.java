package Books;


public class Main {
    public static void main(String[] args) {
        try {
            Publisher publisher1 = new Publisher("Проспект", "Москва");
            Publisher publisher2 = new Publisher("Питер", "Санкт-Петербург");
            Publisher publisher3 = new Publisher("БХВ", "Санкт-Петербург");
            Publisher publisher4 = new Publisher("Диалектика", "Киев");
            Book[] books = {
                    new Book("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", new String[] {"Седжвик Роберт", "Уэйн Кевин"}, 2018, publisher2),
                    new Book("Разработка требований к программному обеспечению. 3-е издание, дополненное", "Вигерс Карл", 2019, publisher3),
                    new Book("Java. Полное руководство, 10-е издание", "Шилдт Герберт",	2018, publisher4),
                    new Book("C/C++. Процедурное программирование", "Полубенцева М.И.", 2017, publisher3),
                    new Book("Конституция РФ", 2020, publisher1)
            };
            Book.printAll(books);
            System.out.println();

            for(int i = 0; i < books.length; i++) {
                if(books[i].getPublisher().getNameOfpublisher().equals("БХВ")) {
                    books[i].getPublisher().setCity("Москва");
                }
            }

            Book.printAll(books); // У издательства "БХВ" исправлено указание на город: "Санкт-Петербург" заменен на "Москва"
        }

        catch(IllegalArgumentException e) {
            System.out.println("Введены неверные данные.");
        }
    }
}
