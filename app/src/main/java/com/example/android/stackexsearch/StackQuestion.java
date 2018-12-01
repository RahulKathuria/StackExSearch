package com.example.android.stackexsearch;

import java.util.ArrayList;

public class StackQuestion {

    private ArrayList<SingleQuestion> items;
    private int quota_remaining;

    public int getQuota_remaining() {
        return quota_remaining;
    }

    public StackQuestion(ArrayList<SingleQuestion> items) {
        this.items = items;
    }

    ArrayList<SingleQuestion> getItems() {
        return items;
    }

    public class QuestionOwner {
        private String display_name;
        private String profile_image;

        public QuestionOwner(String display_name, String profile_image) {
            this.display_name = display_name;
            this.profile_image = profile_image;
        }

        String getDisplay_name() {
            return display_name;
        }

        String getProfile_image() {
            return profile_image;
        }
    }

    public class SingleQuestion {
        private QuestionOwner owner;
        private String title;
        private String link;

        public SingleQuestion(QuestionOwner owner, String title, String link) {
            this.owner = owner;
            this.title = title;
            this.link = link;
        }

        QuestionOwner getOwner() {
            return owner;
        }

        public String getTitle() {
            return title;
        }

        public String getLink() {
            return link;
        }

    }
}
