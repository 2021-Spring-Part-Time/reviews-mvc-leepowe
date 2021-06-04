package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String name;
    private String content;
    private String link;
    private String video;

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

    public String getVideo() {
        return video;
    }

    public Review(long id, String name, String content, String link, String video) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.link = link;
        this.video = video;
    }



}
