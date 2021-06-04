package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String name;
    private String content;
    private String link;

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String getContent(){
        return content;
    }

    public String getLink(){
        return link;
    }

    public Review(long id, String name, String content, String link) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.link = link;
    }

}
