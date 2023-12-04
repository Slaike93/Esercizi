public class Book {

    private String title;
    private int pageCount;

    public Book(String title, int pageCount){
        this.pageCount = pageCount;
        this.title = title;
    }

    @Override
    public String toString(){
        return "Book{title="+title+", pageCount="+pageCount+"}";
    }

    public static void main(String[] args) {
        Book book = new Book("One Piece", 100);
        System.out.println(book.toString());
    }
}
