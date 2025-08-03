
# GraphAlgoVisualizer

A Java-based desktop application for visualizing popular graph algorithms such as **Dijkstra**, **BFS**, and **DFS**. Built using **Java Swing** and **AWT**, the project offers an intuitive GUI to help understand the internal working of graph traversal and pathfinding algorithms.

## 🔍 Features

- Interactive GUI for drawing graphs
- Visualizes:
  - **Breadth First Search (BFS)**
  - **Depth First Search (DFS)**
  - **Dijkstra’s Algorithm**
  - **Prim’s Minimum Spanning Tree**
- Highlighted animation of path discovery
- Real-time user interaction (click to add vertices, edges)

## 🛠️ Tech Stack

- **Java** (Core)
- **Swing** & **AWT** (for GUI)
- No external libraries required

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Any Java IDE (IntelliJ, Eclipse) or just the terminal

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/MitulRanpariya/GraphAlgoVisualizer.git
   cd GraphAlgoVisualizer
   ```

2. Compile the code:
   ```bash
   javac *.java
   ```

3. Run the program:
   ```bash
   java Main
   ```

## 📂 Project Structure

```
GraphAlgoVisualizer/
├── CODE/
│   ├── AlgorithmSetter.java
│   ├── BFSAlgorithm.java
│   ├── DFSAlgorithm.java
│   ├── DijkstrasAlgorithm.java
│   ├── GraphAlgorithm.java
│   └── PrimsAlgorithm.java
├── UI/
│   ├── Algorithm.java
│   ├── ApplicationRunner.java
│   ├── Edge.java
│   ├── Graph.java
│   ├── MainFrame.java
│   ├── Mode.java
│   └── Vertex.java
```
## 💡 Future Improvements

- Add more algorithms (Kruskal, Kosaraju, Topo)
- Weighted edges for all algorithms
- Export/Import graph from file
- Enhanced UI/UX

## 🙋‍♂️ Author

**Mitul Ranpariya**  
[GitHub Profile](https://github.com/MitulRanpariya)

---

⭐ If you find this project helpful, consider giving it a star!
