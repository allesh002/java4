package com.intellekta.mavenlearn;

import java.util.List;

public class Viewer {
    private String nickname;
    private int age;
    private int countOfFilms;
    private List<Viewer> filmsSeen;

    public Viewer(String nickname, int age, List<Viewer> filmsSeen) {
        this.nickname = nickname;
        this.age = age;
        this.filmsSeen=filmsSeen;
        this.countOfFilms = filmsSeen.size();
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Viewer> getFilmsSeen() {
        return filmsSeen;
    }

    public void setFilmsSeen(List<Viewer> filmsSeen) {
        this.filmsSeen = filmsSeen;
    }
}
