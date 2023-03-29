package OOPS.CollegeTasks;
public class Book {
    String title;
    private String author;
    int pageCount;
    boolean isRead;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.isRead = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        isRead = true;
    }

    public void markAsUnread() {
        isRead = false;
    }

    public String toString() {
        String readStatus = isRead ? "read" : "unread";
        return title + " by " + author + " (" + pageCount + " pages, " + readStatus + ")";
    }

    public static void main(String[] args) {
        Book Motivational_book = new Book("5AMCLUB","ROBIN SHARMA",450);
        System.out.println(Motivational_book.isRead());
        System.out.println(Motivational_book.getAuthor());
        System.out.println(Motivational_book.toString());
        System.out.println(Motivational_book.getTitle());
    }
}


