## Game Lobby Simulator

Java multithreading project using CyclicBarrier.

### About Project
This project simulates a game lobby where players wait for each other.
Each player runs in a separate thread. When all players arrive, the game starts together.

### Concepts Used
- Thread
- CyclicBarrier
- Multithreading

### How It Works
- Multiple player threads are created
- Each player waits in the lobby
- When all players arrive, the barrier triggers
- Players start the game together

### How to Run
javac GameLobby.java
java GameLobby

### Sample Output
Player-1 arrived in the lobby
Player-2 arrived in the lobby
Player-3 arrived in the lobby
All players arrived! Game is starting...
Player-1 started playing!
Player-2 started playing!
Player-3 started playing!

### Author
Sakshi
