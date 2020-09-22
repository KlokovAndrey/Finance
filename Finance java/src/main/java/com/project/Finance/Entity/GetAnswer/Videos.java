package com.project.Finance.Entity.GetAnswer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Videos {
    private String title;
    private String embed;

    public Videos() {
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

    public Videos(String title, String embed) {
        this.title = title;
        this.embed = embed;
    }
}
