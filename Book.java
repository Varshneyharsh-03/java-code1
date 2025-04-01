public class Book {
    String title;
    int page;

    Book (String title,int pages){
        this.title=title;
        this.page=pages;
    }

    String display(){
        return this.title + " (" + this.page + ") pages";
    }
}
