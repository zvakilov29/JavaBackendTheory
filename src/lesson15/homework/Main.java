package lesson15.homework;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Song> playlist = new LinkedList<>();

        // sample songs
        playlist.add(new Song("Blackest Eyes", "Porcupine Tree", 263));
        playlist.add(new Song("Windowpane", "Opeth", 464));
        playlist.add(new Song("Like a Sunken Ship", "Leprous", 244));
        playlist.add(new Song("Falling Back to Earth", "Haken", 710));

        System.out.println("Playlist (initial):");
        printPlaylist(playlist);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter song title: ");
        String inputTitle = sc.nextLine();

        boolean moved = moveSongToFront(playlist, inputTitle);

        if (!moved) {
            System.out.println("Song not found");
        } else {
            System.out.println("\nPlaylist (after move to front):");
            printPlaylist(playlist);
        }
    }

    // If song exists, remove from current position and put it to the beginning.
    private static boolean moveSongToFront(LinkedList<Song> playlist, String title) {
        for (Song song : playlist) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                playlist.remove(song);   // remove from current position
                playlist.addFirst(song); // add to the beginning
                return true;
            }
        }
        return false;
    }

    private static void printPlaylist(LinkedList<Song> playlist) {
        int i = 1;
        for (Song s : playlist) {
            System.out.println(i + ". " + s);
            i++;
        }
    }
}
