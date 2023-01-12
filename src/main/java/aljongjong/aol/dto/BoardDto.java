package aljongjong.aol.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class BoardDto {
    private Long no;            // 번호
    private String title;       // 제목
    private String contents;    // 내용
    private String author;      // 작성자
    private LocalDate date;          // 작성일

//    public Long getNo() {
//        return no;
//    }
//
//    public void setNo(Long no) {
//        this.no = no;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContents() {
//        return contents;
//    }
//
//    public void setContents(String contents) {
//        this.contents = contents;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
}
