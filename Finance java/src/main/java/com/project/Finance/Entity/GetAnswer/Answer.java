package com.project.Finance.Entity.GetAnswer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Answer {
    private String title;
    private String embed;
    private String url;
    private String thumbnail;
    private String date;
    private Side1 side1;
    private Side2 side2;
    private Competition competition;

    public Answer(String title, String embed, String url, String thumbnail, String date, Side1 side1, Side2 side2, Competition competition, Videos[] videos) {
        this.title = title;
        this.embed = embed;
        this.url = url;
        this.thumbnail = thumbnail;
        this.date = date;
        this.side1 = side1;
        this.side2 = side2;
        this.competition = competition;
        this.videos = videos;
    }



    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    private Videos[] videos;

    public Answer() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmbed() {
        return embed;
    }

    public void setEmbed(String embed) {
        this.embed = embed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Side1 getSide1() {
        return side1;
    }

    public void setSide1(Side1 side1) {
        this.side1 = side1;
    }

    public Side2 getSide2() {
        return side2;
    }

    public void setSide2(Side2 side2) {
        this.side2 = side2;
    }

    public Videos[] getVideos() {
        return videos;
    }

    public void setVideos(Videos[] videos) {
        this.videos = videos;
    }
}
