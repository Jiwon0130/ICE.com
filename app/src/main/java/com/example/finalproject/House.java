package com.example.finalproject;

public class House {

        String house_name;
        int image_id;
        String url;
        String price;
        String desc;


        public House(int id, String name, String url, String price, String desc) {
            this.house_name = name;
            this.image_id = id;
            this.url = url;
            this.price = price;
            this.desc = desc;
        }

        public String getHouseName() {
            return house_name;
        }

        public int getImageId() {
            return image_id;
        }

        public String getURL() {
            return url;
        }

        public String getPrice() { return price; }

        public String getDesc() {
            return desc;
        }
}
