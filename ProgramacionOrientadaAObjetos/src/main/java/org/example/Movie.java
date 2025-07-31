package org.example;

    public class Movie {
        String title;
        String genre;
        int duration;

        public Movie(String title, String genre, int duration) {
            this.title = title;
            this.genre = genre;
            this.duration = duration;
        }

        public void playMovie() {
            System.out.println("Playing movie: " + title);
        }

        public void stopMovie() {
            System.out.println("Stopping movie: " + title);
        }

        public void showInfo() {
            System.out.println("Title: " + title + ", Genre: " + genre + ", Duration: " + duration + " min");
        }

        public static void main(String[] args) {
            Movie m = new Movie("Inception", "Sci-Fi", 148);
            m.showInfo();
            m.playMovie();
            m.stopMovie();
        }
    }

