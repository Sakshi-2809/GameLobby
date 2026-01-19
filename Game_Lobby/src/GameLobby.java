package mult;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Player extends Thread {
    CyclicBarrier barrier;

    Player(CyclicBarrier barrier, String name) {
        super(name);
        this.barrier = barrier;
    }

    public void run() {
        try {
            Thread.sleep(1000); // Simulate player arriving
            System.out.println(getName() + " arrived in the lobby");

            barrier.await(); // Wait for other players

            Thread.sleep(500); // Small delay before starting
            System.out.println(getName() + " started playing!");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

public class GameLobby {
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        // 3 players waiting in lobby
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All players arrived! Game is starting..."));

        Player p1 = new Player(barrier, "Player-1");
        Player p2 = new Player(barrier, "Player-2");
        Player p3 = new Player(barrier, "Player-3");

        // Start player threads
        p1.start();
        p2.start();
        p3.start();
    }
}
