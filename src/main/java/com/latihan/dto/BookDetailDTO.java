package com.latihan.dto;

public class BookDetailDTO {
    private long bookID;
    private String authorName;
    private String bookTitle;
    private String bookDescription;

    public long getBookID() {
        return bookID;
    }

    public void setBookID(long bookID) {
        this.bookID = bookID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    @Override
    public String toString() {
        return "BookDetailDTO{" +
                "bookID =" + bookID +
                ", authorName ='" + authorName + '\'' +
                ", bookTitle ='" + bookTitle + '\'' +
                ", bookDescription ='" + bookDescription + '\'' +
                '}';
    }
}
