package com.project.Finance.Entity.Send;

public class Match {
    private String title;
    private String competition;
    private String video;

    public Match(String title, String competition, String video) {
        this.title = title;
        this.competition = competition;
        this.video = video;
    }

    public Match() {
        this.title = "NULL";
        this.competition = "NULL";
        this.video = "NULL";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
