package CODE;

import java.util.*;

import UI.Edge;
import UI.Vertex;

public class AlgorithmSetter {

    private GraphAlgorithm algorithm;

    public void setAlgorithm(GraphAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public String execute(Map<Vertex, List<Edge>> graph, Vertex start) {
        return this.algorithm.run(graph, start);
    }
}
