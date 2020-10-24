package com.project.finance.entity.getAnswer;

public class Category {
    String login;
    String category;

    public Category() {
    }

    public Category(String login, String category) {
        this.login = login;
        this.category = category;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
