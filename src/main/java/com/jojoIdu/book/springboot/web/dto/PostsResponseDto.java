package com.jojoIdu.book.springboot.web.dto;


import com.jojoIdu.book.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private  Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title= entity.getTitle();
        this.content = entity.getContent();
        this.author= entity.getAuthor();
    }


}//상세 조회 기능
