package com.example.exemple1;

public class Office {
        private String name;
        private String description;

        
        public Office(int photo1, String name, String description) {
            this.name = name;
            this.description = description;
            }

    public String getName() {
        return name;
    }

    public String getdescription() {
        return description;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setdescription(String description) {
        this.description = description;
    }


}
