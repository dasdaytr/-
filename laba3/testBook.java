package Praktic3;

public class testBook {
    public static void main(String args[])
    {
        Book book = new Book("Я","Институт зло",2020,100);
        System.out.println(book.toString());
        System.out.println("Мне стало скучно и я добавил еще 100 страниц");
        book.setPages(200);
        System.out.print("Теперь моя супер книга имеет " + book.getPages() + " страниц.P.s(кто прочтет познает боль,бугага");
    }
}
