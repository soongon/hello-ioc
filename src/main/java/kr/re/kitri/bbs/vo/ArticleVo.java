package kr.re.kitri.bbs.vo;

import java.util.Date;

public class ArticleVo {
	
	private int articleNo;
	private String title;
	private String author;
	private String content;
	private Date writeDate;
	
	public ArticleVo() {}
	
	public ArticleVo(int articleNo, String title, String author, String content, Date writeDate) {
		super();
		this.articleNo = articleNo;
		this.title = title;
		this.author = author;
		this.content = content;
		this.writeDate = writeDate;
	}
	
	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		return "ArticleVo [articleNo=" + articleNo + ", title=" + title + ", author=" + author + ", content=" + content
				+ ", writeDate=" + writeDate + "]";
	}
}
