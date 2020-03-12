package cn.scau.db.bookmanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author yinglongyhy
 * @since 2020-03-09
 */
@ApiModel(value="Book对象", description="")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "书籍的id，唯一")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "国际标准书号")
    private String isbn;

    @ApiModelProperty(value = "书名")
    private String name;

    @ApiModelProperty(value = "出版社")
    private String publisher;

    @ApiModelProperty(value = "借书人身份证")
    private String userIdCard;

    @ApiModelProperty(value = "书籍类型id")
    private Long bookCategoryId;

    @ApiModelProperty(value = "出版日期")
    private LocalDateTime publishBy;

    @ApiModelProperty(value = "最后借出日期")
    private LocalDateTime borrowBy;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createBy;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard;
    }
    public Long getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Long bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }
    public LocalDateTime getPublishBy() {
        return publishBy;
    }

    public void setPublishBy(LocalDateTime publishBy) {
        this.publishBy = publishBy;
    }
    public LocalDateTime getBorrowBy() {
        return borrowBy;
    }

    public void setBorrowBy(LocalDateTime borrowBy) {
        this.borrowBy = borrowBy;
    }
    public LocalDateTime getCreateBy() {
        return createBy;
    }

    public void setCreateBy(LocalDateTime createBy) {
        this.createBy = createBy;
    }
    public LocalDateTime getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(LocalDateTime modifyBy) {
        this.modifyBy = modifyBy;
    }

    @Override
    public String toString() {
        return "Book{" +
            "id=" + id +
            ", isbn=" + isbn +
            ", name=" + name +
            ", publisher=" + publisher +
            ", userIdCard=" + userIdCard +
            ", bookCategoryId=" + bookCategoryId +
            ", publishBy=" + publishBy +
            ", borrowBy=" + borrowBy +
            ", createBy=" + createBy +
            ", modifyBy=" + modifyBy +
        "}";
    }
}
