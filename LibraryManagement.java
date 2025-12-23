class Book {
    private String title;
    private String author;
    private boolean isAvailable = true; 

    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " returned successfully.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author +  ", Available: " + (isAvailable ? "Yes" : "No"));
              
    }
}

 public class LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.setTitle("The Lord of The Rings");
        b1.setAuthor(" J.R.R Tolkien ");

        b1.printDetails();
        b1.borrowBook();
        b1.printDetails();
        b1.returnBook();
        b1.printDetails();
    }
}
