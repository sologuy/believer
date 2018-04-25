package com.norris.believer.Bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by android on 2017/7/11.
 */

@Entity
public class ReadPlanDraft {

    @Id(autoincrement = true)
    private Long id =null;

    @Property(nameInDb = "BOOKREVIEW1")
    private String bookReview1;
    @Property(nameInDb = "BOOKREVIEW2")
    private String bookReview2;
    @Property(nameInDb = "BOOKREVIEW3")
    private String bookReview3;
    @Property(nameInDb = "BOOKREVIEW4")
    private String bookReview4;

    @Property(nameInDb = "BOOKNAME")
    private String bookName;

    @Property(nameInDb = "BOOKID")
    private String bookId;

    @Generated(hash = 218280802)
    public ReadPlanDraft(Long id, String bookReview1, String bookReview2,
                         String bookReview3, String bookReview4, String bookName,
                         String bookId) {
        this.id = id;
        this.bookReview1 = bookReview1;
        this.bookReview2 = bookReview2;
        this.bookReview3 = bookReview3;
        this.bookReview4 = bookReview4;
        this.bookName = bookName;
        this.bookId = bookId;
    }

    @Generated(hash = 102201800)
    public ReadPlanDraft() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookReview1() {
        return this.bookReview1;
    }

    public void setBookReview1(String bookReview1) {
        this.bookReview1 = bookReview1;
    }

    public String getBookReview2() {
        return this.bookReview2;
    }

    public void setBookReview2(String bookReview2) {
        this.bookReview2 = bookReview2;
    }

    public String getBookReview3() {
        return this.bookReview3;
    }

    public void setBookReview3(String bookReview3) {
        this.bookReview3 = bookReview3;
    }

    public String getBookReview4() {
        return this.bookReview4;
    }

    public void setBookReview4(String bookReview4) {
        this.bookReview4 = bookReview4;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookId() {
        return this.bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }


}
