package Klausuraufgaben.ptwotter;

import java.util.*;

public class TwotterSystem {
    private Map<User, List<Message>> map = new HashMap<>();

    public void addMessage(User u, Message m) {
        map.computeIfAbsent(u, k -> new ArrayList<>()).add(m);
    }

    public List<Message> getAllMessages() {
        List<Message> alle = new ArrayList<>();
        for (List<Message> l : map.values()) {
            alle.addAll(l);
        }
        return alle;
    }

    public List<Message> getAllMessagesFromUser(User u) {
        return map.getOrDefault(u, List.of());
    }

    public List<Message> getAllMessagesFromDate(String date) {
        List<Message> liste = new ArrayList<>();
        for (List<Message> messages : map.values()) {
            for (Message m : messages) {
                if (m.getCreationDate().equals(date)) {
                    liste.add(m);
                }
            }
        }
        return liste;
    }
}
