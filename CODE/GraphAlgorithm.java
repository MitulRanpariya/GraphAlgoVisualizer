package CODE;

import java.util.*;

import UI.Edge;
import UI.Vertex;

public interface GraphAlgorithm {
    String run(Map<Vertex, List<Edge>> graph, Vertex start);

    default String processVertex(Vertex vertex) {
        return vertex.getId() + " -> ";
    }
}
